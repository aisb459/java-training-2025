package com.herbalife.labs.labo3;

public class Country {
    private String name;
    private String capital;
    private String population;

    public Country(String name, String capital, String population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return this.name+" - "+this.capital+", "+this.population;
    }
}
