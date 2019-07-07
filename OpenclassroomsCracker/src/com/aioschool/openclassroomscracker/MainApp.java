package com.aioschool.openclassroomscracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {

	public static Parent createRoot, homeRoot, helpRoot; // Vu que chacun de mes widgets a son propre controlleur, si je
															// veux
	// pouvoir changer mes scenes alors je dois pourvoir récupérer mes widgets
	// principaux et les interfacer sur ma scene
	public static Scene scene, scene2; // On prévoit une variable static scene qui va permettre de récupérer la scene
	public static Stage stage, stage2; // On récupère le stage en vue de pouvoir l'utiliser

	@Override
	public void start(Stage primaryStage) throws Exception {

		helpRoot = FXMLLoader.load(getClass().getResource("/ressources/fxml/Help.fxml"));
		createRoot = FXMLLoader.load(getClass().getResource("/ressources/fxml/Create.fxml"));
		homeRoot = FXMLLoader.load(getClass().getResource("/ressources/fxml/Home.fxml"));

		Stage secondaryStage = new Stage();
		stage = primaryStage;
		stage2 = secondaryStage;

		scene = new Scene(homeRoot);
		scene2 = new Scene(helpRoot);

		secondaryStage.setScene(scene2);
		secondaryStage.setResizable(false);
		secondaryStage.initStyle(StageStyle.TRANSPARENT);
		secondaryStage.getIcons().add(new Image(this.getClass().getResource("/ressources/icones/logo.png").toString()));


		primaryStage.setTitle("OpneCracker - Home");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setResizable(true);
		primaryStage.getIcons().add(new Image(this.getClass().getResource("/ressources/icones/logo.png").toString()));
		
		primaryStage.show();
		primaryStage.centerOnScreen();

	}

	public static void main(String[] args) {

		launch(args);

	}

}
