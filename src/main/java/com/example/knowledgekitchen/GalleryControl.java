package com.example.knowledgekitchen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GalleryControl {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button homeBtn;
    @FXML
    private Button bookingBtn;
    @FXML
    private Button menuBtn;
    @FXML
    private Button contactBtn;
    @FXML
    private Button historyBtn;

    @FXML
    public void initialize(){
        bookingBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("booking.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        homeBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        contactBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("Contact.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        menuBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        historyBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("booking-edit.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
    }
}
