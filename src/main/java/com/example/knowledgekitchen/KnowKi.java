package com.example.knowledgekitchen;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KnowKi extends Application {

    static bookings bookings = new bookings();
    static complaints complaints = new complaints();

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(KnowKi.class.getResource("Home.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1120, 800);
            stage.setTitle("Coffee Time");
            stage.setMaxHeight(800);
            stage.setMaxWidth(1120);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            System.out.println("err");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}