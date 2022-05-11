package com.company;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some sentence or word: ");
        String someString = scn.nextLine();
        System.out.println("Please write some letter: ");
        char someChar = scn.next().charAt(0);

        int count = 0;
        int total_letters = 0;


        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }


            if (someString.charAt(i) != ' ') {
                total_letters++;
            }
        }

        System.out.println(count);
        System.out.println(total_letters);
    }
}

