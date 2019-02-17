package org.lambdaschool.countries.controllers;

import org.lambdaschool.countries.Country;
import org.lambdaschool.countries.CountryList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class NamesController {

    private ArrayList<String> namesList = new ArrayList<>();
    private ArrayList<Country> list = new CountryList().getList("name");

    @GetMapping("/all")
    private ArrayList<String> getAllNames() {
       list.forEach(c -> namesList.add(c.getName()));
       return namesList;
    }

    @GetMapping("/begin/{letter}")
    private ArrayList<Country> begin(@PathVariable Character letter) {
        ArrayList<Country> beginList = new ArrayList<>();
        Character compareLetter = Character.toUpperCase(letter);
        list.forEach(c -> {
            Character beginLetter = Character.toUpperCase(c.getName().charAt(0));
            if (beginLetter == compareLetter) {
                beginList.add(c);
            }
        });
        return beginList;
    }

    @GetMapping("/size/{letters}")
    private ArrayList<Country> sized(@PathVariable int letters) {
        ArrayList<Country> sizedList = new ArrayList<>();
        list.forEach(c -> {
            if (c.getName().length() >= letters) {
                sizedList.add(c);
            }
        });
        return sizedList;
    }
}
