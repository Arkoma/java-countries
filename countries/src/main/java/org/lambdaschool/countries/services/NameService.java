package org.lambdaschool.countries.services;

import org.lambdaschool.countries.CountriesApplication;
import org.lambdaschool.countries.Country;

import java.util.ArrayList;

public class NameService {

    private ArrayList<Country> list = CountriesApplication.countryList.countryList;

    public NameService() {
        list.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
    }

    public ArrayList<Country> getList() {
        return list;
    }
}
