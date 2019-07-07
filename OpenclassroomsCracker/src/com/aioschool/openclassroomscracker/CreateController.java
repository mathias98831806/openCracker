package com.aioschool.openclassroomscracker;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;

public class CreateController implements Initializable{
	@FXML
	private TextField directoryField;	// Récupération de notre objet directoryField
	// Création de l'objet stage local
//	protected Stage stage = (Stage) MainApp.scene.getWindow();
	
	@FXML
	private TextField urlField;
	
	@FXML
	private ComboBox<String> formatChooser;	// Valeur injectée par fxmlloader
	
	private String format;
	
	@FXML
	private void handleChooseDirectoryButtonAction(ActionEvent e) {
		
		final DirectoryChooser directoryChooser = new DirectoryChooser();
		File dir = directoryChooser.showDialog(MainApp.stage);
		directoryField.setText(dir.getPath().toString());
	}
	
	@FXML
	private void handleDownloaButtonAction(ActionEvent e) {
		System.out.println("Le format sélectionné est " + format); 
		Alert alert = new Alert(Alert.AlertType.INFORMATION, "Désolé le téléchargeur n'est pas encore implémenté !!!",
				ButtonType.OK);
		// Clicking X also means no
		ButtonType result = alert.showAndWait().orElse(ButtonType.OK);
		
		if (ButtonType.OK.equals(result)) {
			System.out.println("M�thode non impl�ment�");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		format = new String("PDF");
		formatChooser.getItems().addAll(
				"PDF",
				"WORD",
				"HTML");
		
//		formatChooser.valueProperty().addListener(new ChangeListener<String>() {
//			@Override
//			public void changed(ObservableValue ov, String t, String t1) {
//				format = t1;
//			}
//		});
		
		formatChooser.valueProperty().addListener((ChangeListener<String>) (ov, t, t1) -> format = t1);
	}

}
