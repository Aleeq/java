package com.company;

public class Random {
    public static int getRandomNumber()
    {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 50; i++)
        {
            int x = getRandomNumber();
            System.out.println(x);
        }
    }
}

