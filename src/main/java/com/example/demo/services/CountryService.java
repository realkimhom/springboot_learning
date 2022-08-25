package com.example.demo.services;

import com.example.demo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public String initialise_country(){
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response = template.getForEntity("https://api.covid19api.com/countries",
                String.class);
        return response.getBody();
    }


    // Failed. 
    public void save_countries(){
        RestTemplate template = new RestTemplate();
        ResponseEntity<List> response = template.getForEntity("https://api.covid19api.com/countries",
                List.class);
        System.out.println(response.getBody());
        countryRepository.saveAll(response.getBody());

    }

}
