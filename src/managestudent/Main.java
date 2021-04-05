package managestudent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

public class Main extends Application {

    public static void main(String[] args) {
        Locale vi = new Locale("vi","VN");
        Locale.setDefault(vi);
        launch(args);
    }

    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("home/home.fxml"));
        primaryStage.setTitle("Quản lý sinh viên...");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}

