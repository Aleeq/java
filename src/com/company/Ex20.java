package com.company;

public class Ex20 {
    public static void main(String[] args) {
        int[] numbers = new int[]{35, 7, 48, 9, 568, 324589, 8, 9};
        System.out.println("Max number from array is " + getMaxValue(numbers));
        System.out.println("Min number from array is " + getMinValue(numbers));
    }

    public static int getMaxValue(int[] numbers) {
        int max;
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }

        }
        return max;
    }

    public static int getMinValue(int[] numbers) {
        int min;
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
