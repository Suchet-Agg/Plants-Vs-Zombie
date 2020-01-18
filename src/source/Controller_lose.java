package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller_lose {
    @FXML public Button Quit;
    @FXML public AnchorPane ap;

    public void handle(ActionEvent actionEvent) {
        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
        audio.play();
        try {
            Parent root = Main.controller.gp;
            Main.stg.setScene(new Scene(root, 1280, 800));
            Main.stg.show();
        } catch(Exception e) {
            System.out.println("Error1");
        }
    }
}
