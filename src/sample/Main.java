package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * Permet de cr�er l'interface utilisateur et de d�marrer l'application
     * @param primaryStage Interface utilisateur
     * @throws Exception Problème au lancement
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root = loader.load();
        MenuController controller = loader.getController();
        Group root2= new Group(root);
        controller.setRoot(root2);

        primaryStage.setTitle("Cr�ation r�seau");
        primaryStage.setScene(new Scene(root2, 1000, 600));
        primaryStage.show();
    }


    /**
     * @param args Programme � lancer
     */
    public static void main(String[] args) {
        launch(args);
    }
}
