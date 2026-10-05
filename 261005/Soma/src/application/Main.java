package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Somando 2 números - Feito no IFSC Rau!"); //nome da janela

			GridPane grid = new GridPane(); //tabela para distribuir os componentes
			grid.setAlignment(Pos.CENTER); 
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Scene scene = new Scene(grid, 500, 250);
			primaryStage.setScene(scene);

			Text scenetitle = new Text("Soma");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label lblNum1 = new Label("Número 1:");
			grid.add(lblNum1, 0, 1);

			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);

			Label lblNum2 = new Label("Número 2:");
			grid.add(lblNum2, 0, 2);

			TextField txtNum2 = new TextField();
			grid.add(txtNum2, 1, 2);

			final Text resultado = new Text();
			grid.add(resultado, 1, 6);

			//somar
			Button btnSomar = new Button("Somar");
			
			btnSomar.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					numero1 = numero1 + numero2;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
				}
			});
			
			//subtrair 
			Button btnSubtrair = new Button("Subtrair");
			
			btnSubtrair.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					numero1 = numero1 - numero2;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
				}
			});
			
			// multiplicar 
			Button btnMulti = new Button("Multiplicar");
			
			btnMulti.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					numero1 = numero1 * numero2;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
				}
			});
			
			//dividir
			Button btnDiv = new Button("Dividir");
			
			btnDiv.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());
					if(numero2 == 0) {
						resultado.setFill(Color.FIREBRICK);
						resultado.setText("Não é possível divisão por zero!");
						
					} else {
						numero1 = numero1 / numero2;

						resultado.setFill(Color.FIREBRICK);
						resultado.setText("Total: " + numero1);
					}

				}
			});
			
			//limpar 
			Button btnClr = new Button("Limpar");
			
			
			btnClr.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					txtNum1.clear();
					txtNum2.clear();
					resultado.setText(" ");

				}
			});
			
			HBox caixaBtn = new HBox(10);
			caixaBtn.setAlignment(Pos.CENTER);
			caixaBtn.getChildren().addAll(btnSomar, btnSubtrair, btnMulti, btnDiv, btnClr);
			grid.add(caixaBtn, 1, 4);

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
