package com.company;

public class Man {
    public static void main (String[] args){

        Move[] arr = new Move[]{new Driver(), new Pedestrian()};
        for(int i=0; i<arr.length; i++) {
            arr[i].moving();
        }
    }
}

