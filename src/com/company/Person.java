package com.company;

public class Person {
    public static void main(String[] args){
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        PersonDemo animals1 = new PersonDemo();
        PersonDemo animals2 = new PersonDemo();

        System.out.println(person1.age);
        System.out.println(person1.height);
        person2.age = 30;
        System.out.println(person2.age);
        person1.say("Maks");
        System.out.println(animals1.name);
        System.out.println(animals2.name);

    }
}
