package com.company;

public class Ex16 {
    public static void main(String[] args) {

        int[] numbers = new int[]{35, 7, 48, 9, 568, 324589, 8, 9};
        int max, min;
        max = min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
            if (numbers[i] < min) {
                min = numbers[i];

            }
            System.out.println("Max number from array is " + max);
            System.out.println("Max number from array is " + min);
        }
    }
}
