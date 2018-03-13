package org.pimentel.digitalteacher.controller;

import java.io.IOException;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ResourceBundle;

import org.pimentel.digitalteacher.teste.StageController;
import org.pimentel.digitalteacher.util.ShakeTransition;
import org.pimentel.digitalteacher.util.Util;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class LoginViewController implements Initializable {	

	@FXML private AnchorPane AnchorPanePrincipal;
	@FXML private Pane PaneLogin;
	@FXML private JFXTextField txtFieldUsuario;
	@FXML private JFXTextField txtVerSenha;
	@FXML private JFXPasswordField passSenha;
	@FXML private ImageView imVerSenha;
	@FXML private JFXButton btnEntrar;
	@FXML private JFXButton btnSair;
	@FXML private Pane PaneSobre;
	@FXML private Label lblVersao;
	@FXML private Label lblAnoCorrente;
	@FXML private JFXButton btnSobreOK;
	@FXML private ImageView icoConfigBD;
	@FXML private ImageView icoInternet;
	@FXML private ImageView icoSobre;    
	@FXML private StackPane stackPane;
	private String auxVerSenha;
	private ObservableList<Node> panels;  
	@FXML private Pane PaneInternet;
	@FXML private JFXButton btnInternetOK;
	@FXML private Label lblTipoConexao;
	@FXML private Label lblInterface;
	@FXML private Label lblIP;
	@FXML private Label lblHost;
	@FXML private Label lblSerial;
	@FXML private ImageView imAlerta;
	@FXML private ImageView imIcone;	 
	@FXML private Text lblNomeAplicativo;	 
	@FXML private ImageView imBanner;	
	private ConfiguracaoInicialController configuracaoInicialController;
	private UsuarioController usuariocontroller;

	@FXML
	void onConfigBD(MouseEvent event) {

	}

	@FXML
	void onEntrar(ActionEvent event) throws IOException {
		Boolean logar = usuariocontroller.logar(txtFieldUsuario.getText(), passSenha.getText());
		if (logar) {
			StageController.instance(null).loadNewStage("MainView");			 
		} else {
			new ShakeTransition(PaneLogin).setDelayTime(Duration.ZERO).setDuration(Duration.millis(1000)).play();
		}
	}

	@FXML
	void onSair(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void onSobre(MouseEvent event) {
		mudarPane(1);
	}

	@FXML
	void onSobreOK(ActionEvent event) {
		mudarPane(0);
	}

	@FXML
	void onInternet(MouseEvent event) {
		mudarPane(2);
	}

	@FXML
	void onInternetOK(ActionEvent event) {
		mudarPane(0);
	}

	@FXML
	private void onVerSenhaPressed(MouseEvent event) {
		imVerSenha.setImage(new Image("/IMAGENS/ICONES/verSenha.png"));
		auxVerSenha = passSenha.getText();
		passSenha.setPromptText("");
		passSenha.clear();
		txtVerSenha.setText(auxVerSenha);
	}

	@FXML
	private void onVerSenhaReleased(MouseEvent event) {
		imVerSenha.setImage(new Image("/IMAGENS/ICONES/verSenhaBlock.png"));
		txtVerSenha.clear();
		passSenha.setText(auxVerSenha);
	}

	private void carregarIconesPanelEsquerdo() throws ClassNotFoundException, SQLException, IOException {
		imVerSenha.setImage(new Image("/IMAGENS/ICONES/verSenhaBlock.png"));
		icoSobre.setImage(new Image("/IMAGENS/ICONES/about.png"));    	
		if (configuracaoInicialController.testaConexaoBD()) {
			icoConfigBD.setImage(new Image("/IMAGENS/ICONES/bancoDadosGREEN.png"));
		} else {
			icoConfigBD.setImage(new Image("/IMAGENS/ICONES/bancoDadosRED.png"));
		}    	
		if (Util.verificarConexãoInternet()) {
			icoInternet.setImage(new Image("/IMAGENS/ICONES/internetGREEN.png"));
		} else {
			icoInternet.setImage(new Image("/IMAGENS/ICONES/internetRED.png"));
		}
	}	

	private void mudarPane(int proxPane) {		
		for (int i = 0; i < panels.size(); i++) {
			if (i == proxPane) {
				panels.get(i).setVisible(true);
			}else {
				panels.get(i).setVisible(false);
			}			
		}
	}

	private void carregarInfoRede() throws UnknownHostException, SocketException {
		ArrayList<String> bv = Util.getInformacoesRede();		
		lblTipoConexao.setText(bv.get(0).split(":")[1]);
		lblInterface.setText(bv.get(1).split(":")[1]);
		lblIP.setText(bv.get(2).split(":")[1]);
		lblHost.setText(bv.get(3).split(":")[1]);
	}

	private void carregarInfoSobre() {
		lblAnoCorrente.setText(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));		
		lblNomeAplicativo.setText(configuracaoInicialController.carregaConfiguracaoInicial().getNome());
		lblVersao.setText(configuracaoInicialController.carregaConfiguracaoInicial().getVersao());
		lblSerial.setText(configuracaoInicialController.carregaConfiguracaoInicial().getSerial());
		imIcone.setImage(new Image(configuracaoInicialController.carregaConfiguracaoInicial().getIconeURL()));		
	}

	private void verificarBD() throws ClassNotFoundException, SQLException, IOException {
		if (!(configuracaoInicialController.testaConexaoBD())) {
			txtFieldUsuario.setEditable(false);
			txtFieldUsuario.setFocusColor(Paint.valueOf("red"));
			txtFieldUsuario.setUnFocusColor(Paint.valueOf("red"));			
			passSenha.setEditable(false);
			passSenha.setFocusColor(Paint.valueOf("red"));
			passSenha.setUnFocusColor(Paint.valueOf("red"));			
			btnEntrar.setDisable(true);			
			imAlerta.setImage(new Image("/IMAGENS/ICONES/alertRED.png"));			
		} 
	}
	
	private void validacao() {
		RequiredFieldValidator validatorUsuario = new RequiredFieldValidator();
		RequiredFieldValidator validatorSenha = new RequiredFieldValidator();
		validatorUsuario.setMessage("USUARIO EM BRANCO");		
		validatorSenha.setMessage("SENHA EM BRANCO");
		
		txtFieldUsuario.getValidators().add(validatorUsuario);
		passSenha.getValidators().add(validatorSenha);
		
		txtFieldUsuario.focusedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
				if (!arg2) {
					txtFieldUsuario.validate();
				}				
			}
		});
		passSenha.focusedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
				if (!arg2) {
					passSenha.validate();
				}				
			}
		});
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	
		
	
		
		configuracaoInicialController = new ConfiguracaoInicialController();
		usuariocontroller = new UsuarioController();
		imBanner.setImage(new Image(configuracaoInicialController.carregaConfiguracaoInicial().getBannerURL()));
		try {
			validacao();
			carregarIconesPanelEsquerdo();
			carregarInfoRede();
			carregarInfoSobre();
			verificarBD();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		panels = stackPane.getChildren();
		for (int i = 1; i < panels.size(); i++) {
			panels.get(i).setVisible(false);
		}
	}
}
