package org.pimentel.digitalteacher.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class HBoxDrawerSairController implements Initializable {
	
	  @FXML
	    private VBox vboxLogoff;

	    @FXML
	    private VBox vboxSair;

	    @FXML
	    void clickedVboxLogoff(MouseEvent event) {

	    }

	    @FXML
	    void clickedVboxSair(MouseEvent event) {
	    	Platform.exit();
	    }
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
