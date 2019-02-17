package org.lambdaschool.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {

    private static AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private int population;
    private int landMass;
    private int age;

    public Country(String name, int population, int landMass, int age) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.population = population;
        this.landMass = landMass;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getAge() {
        return age;
    }
}
