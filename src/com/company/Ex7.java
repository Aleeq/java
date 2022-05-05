package com.company;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        int num1,num2,result;
        boolean isTrue = true;

        Scanner scn = new Scanner(System.in);
        System.out.println("this is a game");
        System.out.println("Rules: First number is a secret. Summa of two numbers must be lower than 100");
        num1 = (int) Math.round(Math.random()*100);
        System.out.println("Please enter number2:");
        num2 = scn.nextInt();
        while(isTrue){
            if(num2<=10){
                System.out.println("Second number MUSTbe bigger than 10");
                System.out.println("Please enter second number again: ");
                num2 = scn.nextInt();
            }else{
                result = num1 +num2;
                if(result<100){
                    System.out.println("You have won the game, because summa of two numbers was " + result);

                }else {
                    System.out.println("Game over!");
                    System.out.println("Because summa of two numbers was " + result);
                }
                isTrue = false;
            }
        }
    }
}
