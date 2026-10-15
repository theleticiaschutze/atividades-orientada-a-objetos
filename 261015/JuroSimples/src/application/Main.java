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
import javafx.scene.layout.BorderPane;
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
			primaryStage.setTitle("Calculando seu Juros!");

			GridPane grid = new GridPane(); // tabela para distribuir os componentes
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Scene scene = new Scene(grid, 600, 300);
			primaryStage.setScene(scene);

			Text scenetitle = new Text("Calculando juros simples!");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label lblNum1 = new Label("Capital:");
			grid.add(lblNum1, 0, 1);

			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);
			
			Label lblNum2 = new Label("Tempo:");
			grid.add(lblNum2, 0, 2);

			TextField txtNum2 = new TextField();
			grid.add(txtNum2, 1, 2);
			
			Label lblNum3 = new Label("Taxa:");
			grid.add(lblNum3, 0, 3);

			TextField txtNum3 = new TextField();
			grid.add(txtNum3, 1, 3);


			final Text resultado = new Text();
			grid.add(resultado, 1, 6);

			// calculando

			Button btnCal = new Button("Calcular");

			btnCal.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double capital = Double.parseDouble(txtNum1.getText());
					Double tempo = Double.parseDouble(txtNum2.getText());
					Double taxa = Double.parseDouble(txtNum3.getText());

					Double juros = capital * tempo * taxa;
					capital += juros;
					

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Seu montante final é de R$ " + String.format("%.2f", capital) + ", tendo R$ " + juros + " de juros!");
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
