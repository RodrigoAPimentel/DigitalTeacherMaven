package org.pimentel.digitalteacher.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * teste git
 * @author pimen
 *
 */
public class AdicionaFuncionarioController implements Initializable {
	
	@FXML
    private JFXButton btnSalvarrrrrr;

    @FXML
    private JFXButton btnFechar;

    @FXML
    private void clickedbtnFechar(MouseEvent event) {

    }

    @FXML
    private  void clickedbtnSalvar(MouseEvent event) {

    }
    
    private void carregaImagemBotao() {
    	btnSalvarrrrrr.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/save20px.png"))));
    	btnFechar.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/sair20px.png"))));
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		carregaImagemBotao();

	}

}
