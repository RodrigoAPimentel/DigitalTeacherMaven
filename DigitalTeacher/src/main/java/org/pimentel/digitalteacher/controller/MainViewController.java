package org.pimentel.digitalteacher.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	
	@FXML
    private VBox vboxTop;

    @FXML
    private ImageView imgLogoTop;

    @FXML
    private TitledPane titledFuncionario;

    @FXML
    private HBox itenFuncAdd;

    @FXML
    private HBox itenFuncRemove;

    @FXML
    private HBox itenFuncPesquisar;

    @FXML
    private HBox itenFuncEdit;

    @FXML
    private TitledPane titledProfessor;

    @FXML
    private HBox itenProfAdd;

    @FXML
    private HBox itenProfRemove;

    @FXML
    private HBox itenProfPesquisar;

    @FXML
    private HBox itenProfEdit;

    @FXML
    private TitledPane titledSair;

    @FXML
    private ImageView imgUserTop;

    @FXML
    private Label lblUserTop;

    @FXML
    private ImageView imgUserOptTop;
    
    @FXML
    private StackPane stackPane;

    @FXML
    private void clickedImgUserOptTop(MouseEvent event) {

    }

    @FXML
    private void clickeditenFuncAdd(MouseEvent event) throws IOException {    	
    	Parent node = FXMLLoader.load(getClass().getResource("/FXML/COMPONENTS/AdicionaFuncionario.fxml"));
    	stackPane.getChildren().add(node);
    }

    @FXML
    private void clickeditenFuncEdit(MouseEvent event) {

    }

    @FXML
    private void clickeditenFuncPesquisar(MouseEvent event) {

    }

    @FXML
    private void clickeditenFuncRemove(MouseEvent event) {

    }

    @FXML
    private void clickeditenProfAdd(MouseEvent event) {

    }

    @FXML
    private void clickeditenProfEdit(MouseEvent event) {

    }

    @FXML
    private void clickeditenProfPesquisar(MouseEvent event) {

    }

    @FXML
    private void clickeditenProfRemove(MouseEvent event) {

    }

    @FXML
    private void clickedtitledSair(MouseEvent event) {
    	Platform.exit();
    }
    
    private void carregaImagemTitledPane() {
    	titledFuncionario.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/funcionario32px.png"))));
    	titledProfessor.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/professor32px.png"))));
    	titledSair.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/sair32px.png"))));
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		carregaImagemTitledPane();
		
		
		

	}

}
