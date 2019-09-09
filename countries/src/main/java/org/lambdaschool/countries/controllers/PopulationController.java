package org.lambdaschool.countries.controllers;

import org.lambdaschool.countries.Country;
import org.lambdaschool.countries.CountryList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {

    private ArrayList<Country> list = new CountryList().getList("population");

    @GetMapping("/size/{people}")
    private ArrayList<Country> getSize(@PathVariable int people) {
        ArrayList<Country> popList = new ArrayList<>();
        list.forEach(c -> {
            if (c.getPopulation() >= people) {
                popList.add(c);
            }
        });
        return popList;
    }

    @GetMapping("/min")
    private Country getMinPopCountry() {
        return list.get(0);
    }

    @GetMapping("/max")
    private Country getMaxPopCountry() {
        return list.get(list.size() - 1);
    }

}
