package com.example.courswork;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.*;



public class Controller implements Initializable {
    String SortedTripsText="";

    static List<Trips> tripSortedBuf = new LinkedList<>();


    @FXML
    private ComboBox<String> switchCountry;
    String Country = null;

    @FXML
    private ComboBox<String> switchTypeOfTrip;
    String TypeOfTrip = null;

    @FXML
    private ComboBox<String> switchTypeOfResort;
    String TypeOfResort = null;

    @FXML
    private ComboBox<String> switchMeal;
    String Meal = null;

    @FXML
    private ComboBox<String> switchTransfer;
    String Transfer = null;

    @FXML
    private Label text;

    @FXML
    private RadioButton ECrbtn, CErbtn;

    @FXML
    private TextField PriceFrom;
    int priceFrom = 0;


    @FXML
    private TextField PriceTo;
    int priceTo = 0;

    @FXML
    private TextField Days;
    int days = 0;

    @FXML
    private TextField People;
    int people = 0;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        switchCountry.setItems(FXCollections.observableArrayList("Country","Egypt","Turkey","Greece"));
        switchCountry.setValue("Country");

        switchTypeOfResort.setItems(FXCollections.observableArrayList("Type of resort","Excursions","Cruise","Rest"));
        switchTypeOfResort.setValue("Type of resort");

        switchTypeOfTrip.setItems(FXCollections.observableArrayList("Type of trip","All In","Standard","Luxury"));
        switchTypeOfTrip.setValue("Type of trip");

        switchMeal.setItems(FXCollections.observableArrayList("Meal","All In","Breakfast","Standard"));
        switchMeal.setValue("Meal");

        switchTransfer.setItems(FXCollections.observableArrayList("Transfer","Bus","Train","Ship","Airplane"));
        switchTransfer.setValue("Transfer");
    }


    public void ClearChoose(ActionEvent event){
        Main.tripSorted.clear();
        SortedTripsText=null;
        switchCountry.setValue("Country");
        switchTypeOfResort.setValue("Type of resort");
        switchTypeOfTrip.setValue("Type of trip");
        switchMeal.setValue("Meal");
        switchTransfer.setValue("Transfer");
        PriceFrom.setText("");
        PriceTo.setText("");
        People.setText("");
        Days.setText("");
        text.setText("");

    }

    public void SubmitChoose(ActionEvent event) {
        Main.tripSorted.clear();


        Country = switchCountry.getValue();
        TypeOfResort = switchTypeOfResort.getValue();
        TypeOfTrip = switchTypeOfTrip.getValue();
        Meal = switchMeal.getValue();
        Transfer = switchTransfer.getValue();

        System.out.println(Country);
        System.out.println(TypeOfResort);
        System.out.println(TypeOfTrip);
        System.out.println(Meal);
        System.out.println(Transfer);

        try{
            priceFrom = Integer.parseInt(PriceFrom.getText());
            System.out.println(priceFrom);
        }catch(Exception e){
            priceFrom = 0;
            System.out.println(priceFrom);
            //System.out.println("Wrong format. Error:"+e);

        }

        try{
            priceTo = Integer.parseInt(PriceTo.getText());
            System.out.println(priceTo);
        }catch(Exception e){
            priceTo = 0;
            System.out.println(priceTo);
            //System.out.println("Wrong format. Error:"+e);

        }

        try{
            people = Integer.parseInt(People.getText());
            System.out.println(people);
        }catch(Exception e){
            people = 0;
            System.out.println(people);
            //System.out.println("Wrong format. Error:"+e);
        }

        try{
            days = Integer.parseInt(Days.getText());
            System.out.println(days);
        }catch(Exception e){
            days = 0;
            System.out.println(days);
            //System.out.println("Wrong format. Error:"+e);
        }



        if(Main.tripSorted.isEmpty()){
            SortFunc.SortTypeCountry(Country,Main.trips);
        }else {
            SortFunc.SortTypeCountry(Country,Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortTypeMeal(Meal,Main.trips);
        }else {
            SortFunc.SortTypeMeal(Meal,Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortTypeTrip(TypeOfTrip,Main.trips);
        }else {
            SortFunc.SortTypeTrip(TypeOfTrip,Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortTypeTransfer(Transfer,Main.trips);
        }else {
            SortFunc.SortTypeTransfer(Transfer,Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortTypeResort(TypeOfResort,Main.trips);
        }else {
            SortFunc.SortTypeResort(TypeOfResort,Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortByPrice(priceFrom, priceTo, Main.trips);
        }else {
            SortFunc.SortByPrice(priceFrom, priceTo, Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortByPeople(people, Main.trips);
        }else {
            SortFunc.SortByPeople(people, Main.tripSorted);
        }

        if(Main.tripSorted.isEmpty()){
            SortFunc.SortByDays(days, Main.trips);
        }else {
            SortFunc.SortByDays(days, Main.tripSorted);
        }

        PriceSortBtn(event);


        SortedTripsText = toStringTrips(Main.tripSorted);
        text.setText(SortedTripsText);




        for(int i=0; i<30;i++){
            System.out.print("-");
        }
        System.out.println("\n");

    }

    public static String toStringTrips(List<Trips> sortedTrip){
        String TripsText="";
        for(Trips i : sortedTrip){
            TripsText = TripsText.concat(i.getInfo());
        }
        return TripsText;
    }

    public void PriceSortBtn(ActionEvent event){
        if(ECrbtn.isSelected()){
            System.out.println("expensive-chip");

            Collections.sort(Main.tripSorted, new Comparator<>() {
                @Override
                public int compare(Trips o1, Trips o2) {
                    return o2.Price-o1.Price;
                }
            });
        }else if(CErbtn.isSelected()){
            //System.out.println("chip-expensive");

            Collections.sort(Main.tripSorted, new Comparator<>() {
                @Override
                public int compare(Trips o1, Trips o2) {
                    return o1.Price-o2.Price;
                }
            });
        }
    }





}