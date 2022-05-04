package com.company;

import java.util.Arrays;

public class Main12 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int i=0; i<array.length; i++){
            array[i]=0;
            System.out.print(Arrays.toString(array));
        }
    }
}
