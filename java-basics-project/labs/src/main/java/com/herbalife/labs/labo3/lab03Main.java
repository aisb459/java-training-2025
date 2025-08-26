package com.herbalife.labs.labo3;

public class lab03Main {
    public static void main(String[] args) {
        Person person = new Person("Sam");
        System.out.println(person.toString());;
        Country country = new Country("India","New Delhi","1.4 million");
        City city = new City("Pune",country);
        System.out.println(city.toString());;
    }
}
