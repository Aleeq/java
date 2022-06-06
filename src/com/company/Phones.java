package com.company;

public class Phones {
    public static void main(String[] args){
        PhonesDemo phone1 = new PhonesDemo();
        PhonesDemo phone2 = new PhonesDemo();
        PhonesDemo phone3 = new PhonesDemo("Xiaomi", "5858907865", "Father", 400);
        PhonesDemo2 phone4 = new PhonesDemo2();
        PhonesDemo2 phone5 = new PhonesDemo2("LG", "5555666688", 555);
        PhonesDemoParam phone6 = new PhonesDemoParam();
        PhonesDemoParam phone7 = new PhonesDemoParam("Kitkat", 8, 256);
        PhonesDemoParam phone8 = new PhonesDemoParam("Kitkat", 8, 256, "Nokia", "4784907957", 100);
        PhonesDemoParam phone9 = new PhonesDemoParam("Lolipop", 4, 1024, "Sumsung", "583126777", 150);



        phone6.core = 8;
        phone6.memory = 128;
        phone6.system = "IOS";

        phone1.number = "56666777888";
        phone1.price = 600;
        phone1.name  = "Father";

        System.out.println(phone1.model + " " + phone1.number + " " + phone1.price);

        phone2.number = "56666745888";
        phone2.price = 900;
        phone2.model = "Apple";

        System.out.println(phone2.model + " " + phone2.number + " " + phone2.price);
        System.out.println(phone3.model + " " + phone3.number + " " + phone3.price);

        System.out.println("Calling " + phone2.Calling());
        System.out.println("Calling " + phone3.Calling());

        System.out.println(phone5.model + " " + phone5.number + " " + phone5.price + "\n");

        System.out.println(phone6.system + " " + phone6.core + " " + phone6.memory);
        System.out.println(phone7.system + " " + phone7.core + " " + phone7.memory);
        System.out.println(phone8.system + " " + phone8.core + " " + phone8.memory+" "+phone8.model+ " " + phone8.number+" "+phone8.price);
        phone8.tellModel();
        phone9.tellphone9();


    }
}
