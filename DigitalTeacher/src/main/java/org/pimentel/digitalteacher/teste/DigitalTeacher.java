package org.pimentel.digitalteacher.teste;

import org.pimentel.digitalteacher.controller.ConfiguracaoInicialController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DigitalTeacher extends Application{

	private StageController stageController;

	@Override
	public void start(Stage stage) throws Exception {
		this.stageController = StageController.instance(stage);
		Parent root = null;
		Scene scene;
		
//		ConfiguracaoInicialController configuracaoInicialController = new ConfiguracaoInicialController();		
//		stage.setTitle(configuracaoInicialController.carregaConfiguracaoInicial().getNome());
//		stage.getIcons().add(new Image(configuracaoInicialController.carregaConfiguracaoInicial().getIconeURL()));
//		stage.setResizable(false);		
//		stage.initStyle(StageStyle.TRANSPARENT);	
		
		
		stage.centerOnScreen();	
		root = FXMLLoader.load(getClass().getResource("/FXML/LoginView.fxml"));
//		root = FXMLLoader.load(getClass().getResource("/FXML/MainView.fxml"));
		
//		root = FXMLLoader.load(getClass().getResource("/FXML/Mv.fxml"));

		scene = new Scene(root);
		scene.setFill(null);

		stageController.getStage().setScene(scene);
		stageController.getStage().show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	

	
}
