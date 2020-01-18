package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {
    @FXML private Button play;
    @FXML private Button exit;
    @FXML private Button load;
    @FXML private Button level;
    @FXML public GridPane gp;

    public void Handle1(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            Parent root = Main.NewController.gp;
            Main.stg.setScene(new Scene(root, 1280, 800));
            Main.stg.show();
        } catch(Exception e) {
            System.out.println("Error1");
        }
    }

    public void Handle2(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            Parent root = Main.LoadController.gp;
            Main.stg.setScene(new Scene(root, 1280, 800));
            Main.stg.show();
        } catch(Exception e) {
            System.out.println("Error1");
        }
    }

    public void Handle3(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            Parent root = Main.LevelController.ap;
            Main.stg.setScene(new Scene(root, 1280, 800));
            Main.stg.show();
        } catch(Exception e) {
            System.out.println("Error3");
        }
    }

    public void Handle4(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            System.exit(0);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void initialize(URL location, ResourceBundle resources) {
        ;
    }

}
