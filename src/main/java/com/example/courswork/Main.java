package com.example.courswork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static DBcommands db_trips = new DBcommands();
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

        String query = "SELECT * FROM trips";

        try{
            Statement statement = db_trips.getConnection().createStatement();
            ResultSet ResSet = statement.executeQuery(query);

            while(ResSet.next()){
                trips.add(new Trips(ResSet.getString(2), ResSet.getInt(3), ResSet.getInt(4),ResSet.getInt(5) ,ResSet.getString(6), ResSet.getString(7), ResSet.getString(8), ResSet.getString(9)));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        launch();
    }
}