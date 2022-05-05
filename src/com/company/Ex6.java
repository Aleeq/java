package com.company;

import java.lang.Math;

public class Ex6 {
    public static void main(String[] args) {
        float num1 = 5.8f;
        System.out.println("Round " + Math.round(num1));

        float num2 = 5.1f;
        System.out.println("ceil" + Math.ceil(num2));

        float num3 = 5.9f;
        System.out.println("floor" + Math.floor(num3));

        int num4;

        for (int i = 0; i < 15; i++) {
            num4 = (int) Math.round(Math.random() * 100);
            System.out.println(num4);
        }

        int num7 = 3;
        System.out.println(Math.pow(num7, 3));

        int num8 = 16;
        System.out.println(Math.sqrt(num8));
    }
}

