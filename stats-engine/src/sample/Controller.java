package sample;


import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.net.URI;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;


public class Controller {

    @FXML
    private void openBrowser(ActionEvent event) throws Exception {
        URI u = new URI("C:/");
        java.awt.Desktop.getDesktop().browse(u);
    }

    @FXML
    private void loadStatsManager(ActionEvent event) throws Exception {
        Node node=(Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("StatsManagerView.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void loadPluginManager(ActionEvent event) throws Exception {
        Node node=(Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("PluginManagerView.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
