package com.company;

public class PrintCountry {
    public static void main(String[] args) {
        CountryInt country = new Country(" Italy ");
        CountryInt country1 = new Country(" Malta ");

        country.printCountry( " Rome ");
        country.printCountry( " Valetta ");
    }
}
