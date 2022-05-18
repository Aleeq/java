package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {

        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please some letter ");
        char letter = scn.next().toLowerCase().charAt(0);
        char letter2 = Character.toUpperCase(letter);
        int countLetter;
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader("src/com/test.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                countLetter = 0;
//                System.out.println(line);
                String[] parts = line.split(" ");
                for(int i = 0; i<parts.length; i++) {
                    parts[i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
                }
                System.out.println(Arrays.toString(parts));
                System.out.println(parts.length);

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == letter || line.charAt(i) == letter2) {
                        countLetter++;
                    }
                }
                System.out.println("Special letter in sentences " + countLetter + "\n");
            }


        }catch(IOException e){
            System.out.println(e);

        }
    }
}





