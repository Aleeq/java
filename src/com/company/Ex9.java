package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex9 {
    public static void main(String[] args){
        int[] array = new int[] {17,19,16,34,56,89,87};
        int sum = 0;
        int i = 0;
        boolean isTrue = true;
        while(isTrue){
            sum += array[i];
            i++;
            if(i == array.length - 1){
                isTrue = false;
            }
        }
        System.out.println(sum);

        for(int j = 0; j<array.length; j++){
            sum = sum + array[j];
        }
        System.out.println(sum);

        for(int element: array){
            sum = sum + element;
        }
        System.out.println(sum);

        IntStream elements = IntStream.of(array);
        sum = elements.sum();
        System.out.println(sum);

        System.out.println(Arrays.stream(array).sum());
    }
}
