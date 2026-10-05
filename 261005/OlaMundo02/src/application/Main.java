package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX em ação - feito no IFSC Rau!");

			Label label = new Label("Olá mundo!");
			Label label02 = new Label("Eu sou a Letícia, Letícia, Letícia!");
			
			StackPane root = new StackPane();
			root.getChildren().add(label);
			root.getChildren().add(label02);
			
			root.setAlignment(label, Pos.CENTER);
			root.setAlignment(label02, Pos.BOTTOM_CENTER);
			

			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
