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



public class Controller_level {
    @FXML public Button l1;
    @FXML public Button l2;
    @FXML public Button l3;
    @FXML public Button l4;
    @FXML public Button l5;
    @FXML public Button exit;
    @FXML public AnchorPane ap;


//    public void Handle1(ActionEvent actionEvent) {
//        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
//        audio.play();
//        try {
//            System.out.println("1");
//        } catch(Exception e) {
//            System.out.println("Error1");
//        }
//    }
//
//    public void Handle2(ActionEvent actionEvent) {
//        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
//        audio.play();
//        try {
//            System.out.println("2");
//        } catch(Exception e) {
//            System.out.println("Error1");
//        }
//    }
//
//    public void Handle3(ActionEvent actionEvent) {
//        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
//        audio.play();
//        try {
//            System.out.println("3");
//        } catch(Exception e) {
//            System.out.println("Error3");
//        }
//    }
//
//    public void Handle4(ActionEvent actionEvent) {
//        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
//        audio.play();
//        try {
//            System.out.println("4");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void Handle5(ActionEvent actionEvent) {
//        AudioClip audio = new AudioClip("file:src/music/buttonclick.wav");
//        audio.play();
//        try {
//            System.out.println("5");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }


    public void Handle6(ActionEvent actionEvent) {
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
