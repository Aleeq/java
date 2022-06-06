package com.company;

public class Test2 {
    public static void main(String[]  args){
        int[] array = new int[]{188,181,156,162,173,152,169,193,185};
        double sum = 0;
        for (int i: array) {
            sum += i;
        }
        int max = array[0];
        int n = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
                n = i;
            }
        }
        System.out.println("Index position of Maximum value in an array is  :  " + n);
        System.out.print("Arithmetic mean of numbers is: " + sum/array.length);
    }
}

