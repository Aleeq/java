package com.company;

public class Country implements CountryInt{
    String country;

    Country(String country){
        this.country = country;


    }
    @Override
    public void printCountry(String capital) {
        System.out.println("The capital of " +country + " is " + capital );
    }
}

