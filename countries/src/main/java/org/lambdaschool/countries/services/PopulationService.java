package org.lambdaschool.countries.services;

import org.lambdaschool.countries.CountriesApplication;
import org.lambdaschool.countries.Country;

import java.util.ArrayList;

public class PopulationService {

    private ArrayList<Country> list = CountriesApplication.countryList.countryList;

    public PopulationService() {
        list.sort((c1,c2) -> (c1.getPopulation() - c2.getPopulation()));
    }

    public ArrayList<Country> getList() {
        return list;
    }
}
