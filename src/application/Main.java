package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Carrega a tela em root, root � do tipo Parent porque todos os
			//containers herdam desta classe, assim n�o importa o container 
			//que usamos para definir nossa interface. 
			Parent root = FXMLLoader.load(getClass().getResource("/telas/Principal.fxml"));
			Scene scene = new Scene(root);
			//Adiciona o icnone que est� na pasta imagens
			primaryStage.getIcons().add(new Image("/imagens/icone.jpg"));
			//aplica a folha de estilo que deixam os bot�es com
			//cor azul
			scene.getStylesheets().add(getClass()
					.getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Cadastro de Gar�om");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
