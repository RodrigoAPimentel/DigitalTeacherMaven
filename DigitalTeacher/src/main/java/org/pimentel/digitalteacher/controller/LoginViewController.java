package org.pimentel.digitalteacher.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class LoginViewController implements Initializable {
	
	@FXML 
	private javafx.scene.control.Button btnSair;
	
	@FXML
	private void onActionSair(ActionEvent event) {
		Stage stage = (Stage) btnSair.getScene().getWindow(); //Obtendo a janela atual
	    stage.close(); //Fechando o Stage
	}
	
	
	
	
	
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
