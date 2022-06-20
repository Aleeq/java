package com.company;

public class Home {
    public static void main (String[] args){

        Furniture[] arr = new Furniture[]{new Wardrobe(), new Table()};
        for(int i=0; i<arr.length; i++) {
            arr[i].Parts();
        }
    }
}

