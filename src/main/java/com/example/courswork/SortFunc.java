package com.example.courswork;

import java.util.List;


import static com.example.courswork.Controller.tripSortedBuf;

public class SortFunc {

    public static void SortTypeCountry(String Type, List<Trips> Trip) {
        if(Type.equals("Country") || Type==null){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else{
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getCountry().equals(Type)) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }

        }

    }

    public static void SortTypeTrip(String Type, List<Trips> Trip) {
        if(Type.equals("Type of trip") || Type==null){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else{
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getTypeOfTrip().equals(Type)) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }

        }

    }

    public static void SortTypeTransfer(String Type, List<Trips> Trip) {
        if(Type.equals("Transfer") || Type==null){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else {
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getTypeOfTransfer().equals(Type)) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }
        }

    }

    public static void SortTypeMeal(String Type, List<Trips> Trip) {
        if(Type.equals("Meal") || Type==null){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else{
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getMeal().equals(Type)) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }

        }
    }

    public static void SortTypeResort(String Type, List<Trips> Trip) {
        if(Type.equals("Type of resort") || Type==null){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else{
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getTypeOfResort().equals(Type)) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }

        }

    }

    public static void SortByPrice(int PriceFrom,int PriceTo, List<Trips> Trip){

        if(PriceFrom == 0 && PriceTo == 0){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else if(PriceTo > 0 && PriceFrom == 0){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if(i.getPrice() <= PriceTo){
                    tripSortedBuf.add(i);
                }

            }
        }else if(PriceFrom > 0 && PriceTo == 0){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if(i.getPrice() >= PriceFrom){
                    tripSortedBuf.add(i);
                }
            }
        }else if(PriceFrom > 0 && PriceTo > 0){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if(i.getPrice() >= PriceFrom && i.getPrice() <= PriceTo){
                    tripSortedBuf.add(i);
                }
            }
        }
        Main.tripSorted.clear();
        for (Trips i : tripSortedBuf) {
            //System.out.println(i.getInfo());
            Main.tripSorted.add(i);
        }
    }

    public static void SortByPeople(int Num, List<Trips> Trip){
        if(Num == 0){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else{
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getNumOfPeople() == Num) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }

        }
    }

    public static void SortByDays(int Day, List<Trips> Trip){
        if(Day == 0){
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                tripSortedBuf.add(i);
            }
        }else{
            tripSortedBuf.clear();
            for (Trips i : Trip) {
                if (i.getDays() == Day) {
                    tripSortedBuf.add(i);
                }
            }
            Main.tripSorted.clear();
            for (Trips i : tripSortedBuf) {
                //System.out.println(i.getInfo());
                Main.tripSorted.add(i);
            }

        }
    }


}
