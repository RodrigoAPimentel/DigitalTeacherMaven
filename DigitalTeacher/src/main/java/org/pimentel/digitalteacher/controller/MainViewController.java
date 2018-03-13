package org.pimentel.digitalteacher.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
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
    void clickedImgUserOptTop(MouseEvent event) {

    }

    @FXML
    void clickeditenFuncAdd(MouseEvent event) {

    }

    @FXML
    void clickeditenFuncEdit(MouseEvent event) {

    }

    @FXML
    void clickeditenFuncPesquisar(MouseEvent event) {

    }

    @FXML
    void clickeditenFuncRemove(MouseEvent event) {

    }

    @FXML
    void clickeditenProfAdd(MouseEvent event) {

    }

    @FXML
    void clickeditenProfEdit(MouseEvent event) {

    }

    @FXML
    void clickeditenProfPesquisar(MouseEvent event) {

    }

    @FXML
    void clickeditenProfRemove(MouseEvent event) {

    }

    @FXML
    void clickedtitledSair(MouseEvent event) {
    	Platform.exit();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

		titledFuncionario.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/funcionario32px.png"))));
		
		titledProfessor.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/professor32px.png"))));
		
		titledSair.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/IMAGENS/ICONES/sair32px.png"))));
		
		

	}

}
