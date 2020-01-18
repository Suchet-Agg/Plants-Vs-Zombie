package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class lawn_play extends Application {

    static Stage stg;
    GridPane gridPane;

    public Controller_play getPlayController() throws IOException{
        URL url = getClass().getResource("lawn.fxml");
        FXMLLoader loader = new FXMLLoader(url);
//        FXMLLoader loader = new FXMLLoader(Controller_play.class.getResource("lawn.fxml"));
        Parent root = loader.load();
        Controller_play controller_play = loader.getController();
        return controller_play;
//        FXMLLoader l = new FXMLLoader(lawn_play.class.getResource("lawn.fxml"));
//        FXMLLoader root = (new FXMLLoader(lawn_play.class.getResource("lawn.fxml")));
//        return (Controller_play) root.getController();
//        Controller_play p = (Controller_play) l.getController();
//        return p;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("lawn.fxml"));
        primaryStage.setTitle("Plants Vs. Zombies");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
        URL resource = getClass().getResource("/music/background.mp3");
        MediaPlayer a =new MediaPlayer(new Media(resource.toString()));
        a.play();
        a.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                a.seek(Duration.ZERO);
                a.play();
            }
        });}

    public static Stage getStg(){
        return stg;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
