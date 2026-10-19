package ifsc.tds.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable{

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnSoma;

    @FXML
    private Button btnSub;

    @FXML
    private Label lblNumero1;

    @FXML
    private Label lblNumero2;

    @FXML
    private Label lblResultado;

    @FXML
    private Label lblResultadoCalc;

    @FXML
    private Label lblTitulo;

    @FXML
    private GridPane pnlGrid;

    @FXML
    private AnchorPane pnlPrincipal;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void OnClickDividir(ActionEvent event) {
    	double numero1 = Double.parseDouble(this.txtNumero1.getText());
    	double numero2 = Double.parseDouble(this.txtNumero2.getText());

    	numero1 = numero1 / numero2;
    	
    	lblResultadoCalc.setText(new Double(numero1).toString());

    }

    @FXML
    void OnClickLimpar(ActionEvent event) {
    	this.txtNumero1.setText(new String());
    	this.txtNumero2.setText(new String());
    	this.lblResultadoCalc.setText(new String("0"));

    }

    @FXML
    void OnClickMultiplicar(ActionEvent event) {
    	double numero1 = Double.parseDouble(this.txtNumero1.getText());
    	double numero2 = Double.parseDouble(this.txtNumero2.getText());

    	numero1 = numero1 * numero2;
    	
    	lblResultadoCalc.setText(new Double(numero1).toString());

    }

    @FXML
    void OnClickSomar(ActionEvent event) {
    	double numero1 = Double.parseDouble(this.txtNumero1.getText());
    	double numero2 = Double.parseDouble(this.txtNumero2.getText());

    	numero1 = numero1 + numero2;
    	
    	lblResultadoCalc.setText(new Double(numero1).toString());

    }

    @FXML
    void OnClickSubtrair(ActionEvent event) {
    	double numero1 = Double.parseDouble(this.txtNumero1.getText());
    	double numero2 = Double.parseDouble(this.txtNumero2.getText());

    	numero1 = numero1 - numero2;
    	
    	lblResultadoCalc.setText(new Double(numero1).toString());

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
