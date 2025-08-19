package com.example.knowledgekitchen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;


import java.io.IOException;

public class HomeControl {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button bookingBtn;
    @FXML
    private Button galleryBtn;

    @FXML
    private Button bookingBtn2;

    @FXML
    private Button contactBtn;

    @FXML
    private Button menuBtn;

    @FXML
    private Button menuBtn2;
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

        bookingBtn2.setOnAction(event -> {
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

        galleryBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("gallery.fxml"));
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
        menuBtn2.setOnAction(event -> {
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