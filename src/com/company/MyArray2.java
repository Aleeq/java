package com.company;

import java.util.Arrays;

public class MyArray2 implements ArrayInterface2 {
    int[] array = new int[4];
    int size = 0;
    String[] array2 = new String [5];


    @Override
    public boolean Add(int value) {
        if (size != array.length) {
            array[size] = value;
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int Get(int index) {
        return array[index];


    }

    @Override
    public String Add(String students) {
        if (size != array2.length) {
            array2[size] = students;
            size++;

        }
        return students;
    }
    @Override
    public void Get (){
        System.out.println(Arrays.toString(array2));
    }


}

