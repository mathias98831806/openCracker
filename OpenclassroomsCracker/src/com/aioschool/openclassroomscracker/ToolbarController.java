package com.aioschool.openclassroomscracker;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ToolbarController implements Initializable{

	@FXML
	protected Label appLabel;
	// R�cup�ration de la scene � partir de appLabel
	
	
//	protected Scene scene = (Scene) appLabel.getScene();
	
	@FXML
	protected void handleHomeButtonAction(ActionEvent e) {
		MainApp.stage.setTitle("OpenCracker - Home");
		MainApp.scene.setRoot(MainApp.homeRoot);
	}
	@FXML
	protected void handleCreateButtonAction(ActionEvent e) {
		MainApp.stage.setTitle("OpenCracker - Create new project");
		MainApp.scene.setRoot(MainApp.createRoot);
	}
	@FXML
	protected void handleExplorerButtonAction(ActionEvent e) {
		System.out.println("Méthode non encore implémentée");
	}
	@FXML
	protected void handleGethelpButtonAction(ActionEvent e) {
		;
		MainApp.stage2.show();
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
