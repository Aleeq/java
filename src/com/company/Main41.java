package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main41 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Artur");
        names.add("Lija");
        names.add("Oleg");

        Iterator<String> it = names.iterator();




        System.out.println(it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
