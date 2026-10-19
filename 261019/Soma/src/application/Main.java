package application;
	
import ifsc.tds.controller.SomarController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//configurando alguns dados da tela
			primaryStage.setTitle("Somar números");
			primaryStage.resizableProperty().set(Boolean.FALSE);
			
			//carregando o arquivo da tela
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ifsc/tds/view/Soma.fxml"));
			Parent arquivoFXML = loader.load();
			
			// Atribuindo o arquivo XML para uma scene e atribuindo a janela stage
			Scene somarCena = new Scene(arquivoFXML);
			primaryStage.setScene(somarCena);
			
			//carregar o controller da cena
			SomarController somarController = loader.getController();
			
			//atribuir evento a janela de fechar tela
			primaryStage.setOnCloseRequest(e->{
				if(somarController.onCloseQuery()) {
					System.exit(0);
				} else {
					e.consume();
				}
			});
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
