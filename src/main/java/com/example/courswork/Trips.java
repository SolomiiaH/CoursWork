package com.example.courswork;
import java.sql.*;
import java.sql.Connection;

public class Trips {
    int Price;//
    String Country;//
    int NumOfPeople;
    int Days;//
    String TypeOfTrip;//
    String TypeOfResort;//
    String TypeOfTransfer;//
    String Meal;//



    public Trips(String Country, int Price, int NumOfPeople, int Days, String TypeOfResort, String TypeOfTrip, String TypeOfTransfer, String Meal){
        this.Country=Country;
        this.Price=Price;
        this.NumOfPeople=NumOfPeople;
        this.TypeOfResort=TypeOfResort;
        this.Days=Days;
        this.TypeOfTrip=TypeOfTrip;
        this.TypeOfTransfer=TypeOfTransfer;
        this.Meal=Meal;
    }

    @Override
    public String toString(){
//        System.out.println(
//                "    From Ukraine to "+Country+"\n"
//                +"Price: "+Price+"\n"
//                +"Days: "+Days+"\n"
//                +"Type of resort: "+TypeOfResort+"\n"
//                +"Transfer: "+TypeOfTransfer+"\n"
//                +"Trips: "+TypeOfTrip+"\n"
//                +"For "+NumOfPeople+" people(s)"+"\n"
//        );
        return "\t\t\tFrom Ukraine to "+Country+"\n"
                +"\tPrice: "+Price+"\n"
                +"\tDays: "+Days+"\n"
                +"\tType of resort: "+TypeOfResort+"\n"
                +"\tTransfer: "+TypeOfTransfer+"\n"
                +"\tTrips: "+TypeOfTrip+"\n"
                +"\tMeal: "+Meal+"\n"
                +"\tFor "+NumOfPeople+" people(s)"+"\n\n";
    }

    public int getNumOfPeople() {
        return NumOfPeople;
    }

    public int getPrice() {
        return Price;
    }

    public String getCountry() {
        return Country;
    }

    public String getMeal() {
        return Meal;
    }

    public String getTypeOfTransfer() {
        return TypeOfTransfer;
    }

    public String getTypeOfTrip() {
        return TypeOfTrip;
    }

    public int getDays() {
        return Days;
    }

    public String getTypeOfResort() {
        return TypeOfResort;
    }


    public void setCountry(String country) {
        Country = country;
    }

    public void setDays(int days) {
        Days = days;
    }

    public void setMeal(String meal) {
        Meal = meal;
    }

    public void setNumOfPeople(int numOfPeople) {
        NumOfPeople = numOfPeople;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setTypeOfResort(String typeOfResort) {
        TypeOfResort = typeOfResort;
    }

    public void setTypeOfTransfer(String typeOfTransfer) {
        TypeOfTransfer = typeOfTransfer;
    }

    public void setTypeOfTrip(String typeOfTrip) {
        TypeOfTrip = typeOfTrip;
    }


}