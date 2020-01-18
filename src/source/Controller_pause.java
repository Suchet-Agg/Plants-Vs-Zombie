package sample;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_pause implements Initializable {
    public javafx.scene.control.Button save;
    public javafx.scene.control.Button close2;
    public javafx.scene.control.Button close;
    @FXML private Button create;
    @FXML public AnchorPane ap;

    public void hand1(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            Parent root = Main.controller.gp;
            Main.stg.setScene(new Scene(root, 1280, 800));
            Main.stg.show();
        } catch(Exception e) {
            System.out.println("Error1");
        }
        finally {
            Main.b.pause();
            Main.a.play();
        }
    }

    public void hand2(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


    public void hand3(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            Parent root = Main.controller_play.overall;
            Main.stg.setScene(new Scene(root, 1280, 800));
            Main.stg.show();
        } catch(Exception e) {
            System.out.println("Error1");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ;
    }
}