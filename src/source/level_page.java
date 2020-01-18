package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class level_page extends Application {

    static Stage stg;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("level_select.fxml"));
        primaryStage.setTitle("Plants Vs. Zombies");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }

    public Stage getStg(){
        return stg;
    }

    public static void setStg(Stage stg) {
        Main.stg = stg;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
