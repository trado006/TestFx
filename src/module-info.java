module TestFx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens views.handlers to javafx.graphics, javafx.fxml;
	opens entity to javafx.graphics, javafx.fxml;
	
	exports entity;
}
