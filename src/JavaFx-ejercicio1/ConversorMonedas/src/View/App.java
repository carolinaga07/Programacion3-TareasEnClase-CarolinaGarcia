package View;

import java.security.Principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader louder = 
        new FXMLLoader(getClass().getResource("/View/Principal.fxml"));
        
        Scene scene = new Scene(louder.load());

        stage.setScene(scene);
        stage.setTitle("Convertidor de monedas");
        stage.show();
    }


}
