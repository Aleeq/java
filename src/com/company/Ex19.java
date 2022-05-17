package com.company;

public class Ex19 {
    public static void main(String[] args){
        System.out.println(function(10,5));
        int num1, num2;
        num1 = 15;
        num2 = 20;
        System.out.println(function(num1,num2));
        function2();
    }
    public static int function(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }


//    public static void main(String[] args){
//    int summa;
//        summa = function(10,5));
//        System.out.println (summa);
//    }
    public static int function1(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }



    public static void function2(){
        int num1, num2, result;
        num1 = 15;
        num2 = 20;
        result = num1 + num2;
        System.out.println(result);
    }
}
