package org.pimentel.digitalteacher.teste;

import java.io.IOException;

import org.pimentel.digitalteacher.controller.ConfiguracaoInicialController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DigitalTeacher extends Application {

	private Stage primaryStage;
	private AnchorPane anchorPane;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		ConfiguracaoInicialController configuracaoInicialController = new ConfiguracaoInicialController();
		
		primaryStage.setTitle(configuracaoInicialController.carregaConfiguracaoInicial().getNome());
		primaryStage.getIcons().add(new Image(configuracaoInicialController.carregaConfiguracaoInicial().getIconeURL()));
		primaryStage.setResizable(false);
		
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		
		mostrarJanela("LoginView", "LoginView_CSS");		
	}

	public void mostrarJanela(String nomeDaJanela, String arquivoCSS) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(DigitalTeacher.class.getResource("/FXML/"+nomeDaJanela+".fxml"));
		anchorPane = loader.load();
		
		Scene scene = new Scene(anchorPane);
		
		scene.getStylesheets().add("/CSS/"+arquivoCSS+".css");
		
		anchorPane.getStyleClass().add("root");
		scene.setFill(null);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
