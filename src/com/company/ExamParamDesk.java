package com.company;

public class ExamParamDesk extends Desk {
    String material = "wood";
    int wheels = 4;
    String shape = "oval";

    ExamParamDesk() {

    }


    ExamParamDesk(String color, int height, String name, String material, String shape, int wheels) {
        super(material, shape, wheels);
        this.color = color;
        this.height = height;
        this.name = name;

    }

}

