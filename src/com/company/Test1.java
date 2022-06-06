package com.company;

public class Test1 {
    public static void main(String[] args) {
        int num;
        int i = 0;
        while(i<10){
            num = (int) Math.round(Math.random()*100)+100;
            if(num<=200 && num>=100){

            }
                System.out.println(num);
                i++;
        }
    }
}
