package application;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class Main extends Application {

    Path path = new Path();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        primaryStage.setTitle("Echec");
        primaryStage.setScene(new Scene(root, 536, 518));
        primaryStage.show();
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("echec.png")));


    }


    public static void main(String[] args) {
        launch(args);
    }
}
