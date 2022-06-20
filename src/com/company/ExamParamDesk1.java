package com.company;

public class ExamParamDesk1 extends Desk{
    String covering = "velvet";
    int shelves = 3;


    ExamParamDesk1() {

    }


    ExamParamDesk1(String color, int height, String name, String covering, int shelves) {
        super(color, name, height);
        this.covering = covering;
        this.shelves = shelves;

    }

}

