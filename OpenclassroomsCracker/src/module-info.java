module OpenclassroomsCracker {
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens com.aioschool.openclassroomscracker to javafx.fxml;
	exports com.aioschool.openclassroomscracker;
	
}