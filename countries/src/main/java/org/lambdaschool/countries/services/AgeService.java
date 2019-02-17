package org.lambdaschool.countries.services;

import org.lambdaschool.countries.CountriesApplication;
import org.lambdaschool.countries.Country;

import java.util.ArrayList;

public class AgeService {

    private ArrayList<Country> list = CountriesApplication.countryList.countryList;

    public AgeService() {
        list.sort((c1, c2) -> (c1.getAge() - c2.getAge()));
    }

    public ArrayList<Country> getList() {
        return this.list;
    }
}
