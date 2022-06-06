package com.company;

public class PhonesDemo {

    String number;
    int price;
    String model = "Samsung";
    String name;

    PhonesDemo(){

    }

    PhonesDemo(String m, String n, String h, int p){
        model = m;
        number = n;
        price = p;
        name = h;


    }

    public String Calling(){
        return number +" "+ name;


    }

}
