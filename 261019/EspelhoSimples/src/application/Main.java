package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			final Effect r = new Reflection();
			final VBox root = new VBox(30);
			final HBox hbTop = new HBox(5);
			final TextField txtName = new TextField();
			final Button btnAction = new Button("Send");
			final Label lblMessage = new Label();
			root.setTranslateX(10);
			root.setTranslateY(10);
			lblMessage.setText("Enter your name and send it!");
			hbTop.getChildren().addAll(txtName, btnAction);
			root.getChildren().addAll(hbTop, lblMessage);
			lblMessage.setEffect(r);
			Scene cena = new Scene(root, 250, 150);
			primaryStage.setTitle("Using Java");
			primaryStage.setScene(cena);
			primaryStage.show();
			btnAction.setOnAction(e -> lblMessage.setText("Olá, " + txtName.getText() + ", aqui é Brasiiiil"));

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
