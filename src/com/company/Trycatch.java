package com.company;

public class Trycatch {
    public static void main(String[] args){
        int [] arr = new int[]{15,15,87};
        try {
            int num = 5;
            arr[5] = 5;
            System.out.println(arr[4]);
            int num2 = num / 0;
            System.out.println(num2);
        }catch (Exception e){
            System.out.println("some error " + e);
        }finally{
            System.out.println("Hello world! ");
        }

    }
}
