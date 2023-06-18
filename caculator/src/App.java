import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDoc.fxml"));
            stage.setTitle("Calculator");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}