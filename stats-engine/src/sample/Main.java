package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;




public class Main extends Application {

    private Stage stage;
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("StatsManagerView.fxml"));
        stage.setTitle("Stats Engine");
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("sample/logo.png"));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
