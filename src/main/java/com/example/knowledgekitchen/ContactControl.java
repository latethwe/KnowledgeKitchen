package com.example.knowledgekitchen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ContactControl {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button bookingBtn;

    @FXML
    private TextField cityf;

    @FXML
    private Button contactBtn;

    @FXML
    private TextField emailf;

    @FXML
    private Button galleryBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button menuBtn;

    @FXML
    private TextField namef;
    @FXML
    private Button historyBtn;

    @FXML
    private TextField phonef;

    @FXML
    private TextField questionf;

    @FXML
    private Button sendBtn;

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

        sendBtn.setOnAction(event -> {
            complaints complaints = new complaints(namef.getText(),cityf.getText(),emailf.getText(),phonef.getText(),questionf.getText());
            System.out.println(complaints);
            //KnowKi.complaintsList.add(complaints);
            KnowKi.complaints = complaints;


            try {
                root = FXMLLoader.load(getClass().getResource("home.fxml"));
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
