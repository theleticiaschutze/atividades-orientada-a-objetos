package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Calculando com um círculo!");

			GridPane grid = new GridPane(); // tabela para distribuir os componentes
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Scene scene = new Scene(grid, 500, 250);
			primaryStage.setScene(scene);

			Text scenetitle = new Text("Calculando área e perímetro do círculo!");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label lblNum1 = new Label("Raio:");
			grid.add(lblNum1, 0, 1);

			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);


			final Text resultado = new Text();
			grid.add(resultado, 1, 6);

			// calculando

			Button btnCal = new Button("Calcular");

			btnCal.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double raio = Double.parseDouble(txtNum1.getText());

					Double circ = 2 * Math.PI * raio;
					raio = Math.pow(raio, 2) * Math.PI;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Área " + String.format("%.2f", raio) + " e perímetro " + String.format("%.2f", circ));
				}
			});

			// limpar
			Button btnClr = new Button("Limpar");

			btnClr.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					txtNum1.clear();
					resultado.setText(" ");

				}
			});

			HBox caixaBtn = new HBox(10);
			caixaBtn.setAlignment(Pos.CENTER);
			caixaBtn.getChildren().addAll(btnCal, btnClr);
			grid.add(caixaBtn, 1, 4);
			
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
