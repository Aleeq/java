package com.company;

public class Eam1 {
    public static void main(String[] args) {
        Desk desk1 = new Desk();
        ExamParamDesk desk2 = new ExamParamDesk("red", 100, "Shark", "wood", "oval", 4);
        ExamParamDesk1 desk3 = new ExamParamDesk1();

        String color;
        int height;
        String name;


        desk1.color = "blue";
        desk1.height = 90;
        desk1.name = "Stinger";

//        System.out.println(desk1.color + " " + desk1.name + " " + desk1.height);
        System.out.println(desk2.color + " " + desk2.name + " " + desk2.height +" "+ desk2.material+ " " + desk2.shape + " " + desk2.wheels + desk3.covering + " " + desk3.shelves);

    }
}
