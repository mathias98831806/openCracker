package com.aioschool.openclassroomscracker;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class StatusbarController implements Initializable{

	@FXML
	protected void handleCheckUpdateButtonAction(ActionEvent e) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION, "Voulez-vous réellement mettre à jour votre application ?",
				ButtonType.YES, ButtonType.NO);
		// Clicking X also means no
		ButtonType result = alert.showAndWait().orElse(ButtonType.NO);
		
		if (ButtonType.YES.equals(result)) {
			System.out.println("Désolé il n'y a pas de mise à jour pour le moment");
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
