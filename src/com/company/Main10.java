package com.company;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[]{1,2,3,4,5};
        System.out.println(array2[3]);

        float[] array3 = new float[]{1.5f,2.8f,10.5f};
        System.out.println(array3[2]);

        int[][]arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[2][1]);

        int[] array4 = new int[5];
        array4[0] = 5;
        array4[1] = 10;
        System.out.println(Arrays.toString(array4));
    }
}
