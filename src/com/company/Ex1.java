package com.company;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[]  args){
        int[] array = new int[]{1,2,3,4,3,55,65,78,99};
        int result = 0;
        for (int i = 0; i<array.length; i++){
            if(i< array.length-3 || i==array.length-1) {
                result += array[i];
            }
        }
//             result = result + array[i];
            System.out.println(result);
    }

}
