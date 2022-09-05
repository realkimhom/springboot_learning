package com.example.demo.controllers;

import com.example.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping(value = "/country")
    public String get_country(){
        return countryService.initialise_country();
    }

    @GetMapping(value = "/save_countries")
    public Boolean save_countries(){
        try{
            countryService.save_countries();
            return true;
        }catch (Exception e){
            throw e;
        }
    }

    @GetMapping(value = "/get_countries_number")
    public int get_countries_number(){
        int x = 100;
        int y = 10;
        return x * y - y;
    }
}
