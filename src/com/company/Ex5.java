package com.company;

public class Ex5 {
    public static void main(String[] args){
        int result;
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i<10; i++){
            result = num1+num2;

            System.out.print(result + " ");
            num1 = num2;
            num2 = result;

        }
    }
}
