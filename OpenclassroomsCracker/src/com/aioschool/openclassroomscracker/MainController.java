package com.aioschool.openclassroomscracker;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController implements Initializable{

	@FXML
	protected void handleCreateNewProjectButtonAction(ActionEvent e) {
		MainApp.stage.setTitle("OpenCracker - Create new project");
		MainApp.scene.setRoot(MainApp.createRoot);
		
	}
	
	@FXML
	protected void handleOpenButtonAction(ActionEvent e) {
		
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
