package org.lambdaschool.countries.controllers;

import org.lambdaschool.countries.Country;
import org.lambdaschool.countries.services.AgeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController {

    @GetMapping("/{age}")
    private ArrayList<Country> getMedianAge(@PathVariable int age) {
        ArrayList<Country> list = new AgeService().getList();
        ArrayList<Country> ageList = new ArrayList<>();
        list.forEach(c -> {
            if (c.getAge() >= age) {
                ageList.add(c);
            }
        });
        return ageList;
    }

    @GetMapping("/min")
    private Country getMinMedianAge() {
        ArrayList<Country> list = new AgeService().getList();
        return list.get(0);
    }

    @GetMapping("/max")
    private Country getMaxMedianAge() {
        ArrayList<Country> list = new AgeService().getList();
        return list.get(list.size() - 1);
    }

}
