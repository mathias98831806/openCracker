package com.aioschool.openclassroomscracker;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class HelpController implements Initializable {

	@FXML
	protected void handleQuitterButtonAction(ActionEvent e) {
		MainApp.stage2.close();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
