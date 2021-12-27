package com.example.courswork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main extends Application {

    static List<Trips> trips = new ArrayList<>();
    static List<Trips> tripSorted = new ArrayList<>();



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 450);
        stage.setTitle("Tourist vouchers");
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        trips.add(new Trips("Egypt", 1000, 3,7 ,"Excursions", "All In", "Bus", "All In"));
        trips.add(new Trips("Egypt", 500, 2,5 ,"Excursions", "Standard", "Airplane", "Breakfast"));
        trips.add(new Trips("Turkey", 900, 2, 7,"Cruise","All In", "Airplane", "Breakfast"));
        trips.add(new Trips("Turkey", 450, 1, 10,"Rest","Luxury", "Train", "Standard"));



        launch();
    }
}