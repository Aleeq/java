package com.company;

import java.util.Arrays;

public class MainPolymorphism {
    public static void main (String[] args){

        Shape circle = new Circle();
        circle.draw();
        Shape triangle = new Triangle();
        triangle.draw();
        Shape ellipse = new Ellipse();
        ellipse.draw();

        Shape[] arr = new Shape[]{new Circle(), new Triangle(), new Ellipse()};
        for(int i=0; i<arr.length; i++) {
        arr[i].draw();
        }
    }
}
