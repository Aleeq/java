package com.company;

public class Vehicles {
    public static void main(String[] args) {
        Tractor M1 = new Tractor (6, 200, 200, "Diesel", true);
        Track Scania = new Track (15, 12, 700, "Diesel", false);

        M1.getParam();
        Scania.getParam();
    }



}

