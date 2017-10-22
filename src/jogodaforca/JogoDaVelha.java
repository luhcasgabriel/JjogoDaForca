package jogodaforca;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class JogoDaVelha extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("Estilo.css");
                       
        stage.setScene(scene);
        stage.setTitle("Jogo da Forca");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
