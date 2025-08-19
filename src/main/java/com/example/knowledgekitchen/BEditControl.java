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

import java.io.IOException;

public class BEditControl {

    bookings book = KnowKi.bookings;
    complaints comp = KnowKi.complaints;


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button galleryBtn;
    @FXML
    private Button bookingBtn;

    @FXML
    private Button homeBtn;
    @FXML
    private Button homeBtn2;

    @FXML
    private Button menuBtn;
    @FXML
    private Button contactBtn;
    @FXML
    private Button changeBtn;

    @FXML
    private Label forDate;

    @FXML
    private Label forEmail;

    @FXML
    private Label forName;

    @FXML
    private Label forPhone;

    @FXML
    private Label forSize;

    @FXML
    private Label forSpec;

    @FXML
    private Label forSurname;
    @FXML
    private Label forTime;
    @FXML
    private Label forCName;
    @FXML
    private Label forCity;
    @FXML
    private Label forCEmail;
    @FXML
    private Label forCPhone;
    @FXML
    private Label forQuestion;

    @FXML
    public void initialize(){
        forDate.setText(book.date);
        forEmail.setText(book.email);
        forPhone.setText(book.phone);
        forName.setText(book.name);
        forSurname.setText(book.surname);
        forSize.setText(String.valueOf(book.size));
        forSpec.setText(book.spec);
        forTime.setText(BookingControl.time+ " " + BookingControl.at);
        forCEmail.setText(comp.email);
        forCPhone.setText(comp.phone);
        forCName.setText(comp.name);
        forQuestion.setText(comp.question);
        forCity.setText(comp.city);

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
        homeBtn2.setOnAction(event -> {
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
        changeBtn.setOnAction(event -> {

            BookingControl.edit = true;

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
    }
}
