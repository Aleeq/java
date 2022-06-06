package com.company;

public class MainInterface2 {
    public static void main(String[] args) {
        ArrayInterface2 array  = new MyArray2();
        ArrayInterface2 array2  = new MyArray2();
        System.out.println(array.Add(5));
        System.out.println(array.Add(8));
        System.out.println(array.Add(10));
        System.out.println(array.Add(3));
        System.out.println(array.Get(1));
        System.out.println(array2.Add("Masha"));
        System.out.println(array2.Add("Sasha"));
        System.out.println(array2.Add("Kolya"));
        System.out.println(array2.Add("Tolya"));
        System.out.println(array2.Add("Petya"));
        array2.Get();

    }
}
