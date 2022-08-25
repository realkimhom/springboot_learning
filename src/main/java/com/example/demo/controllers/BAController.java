package com.example.demo.controllers;


import com.example.demo.domain.BankAccount;
import com.example.demo.services.BAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class BAController {

    // The Service layer is the layer that communicates between the controller and persistence layer.
    @Autowired
    BAService baService = new BAService();

    @RequestMapping(value = "/getall")
    public ResponseEntity<List<BankAccount>> getAccounts()
    {

        return new ResponseEntity<>(baService.getAll(), HttpStatus.FOUND);
    }

    @RequestMapping(value = "/test")
    public String hello(){

        return "hello world";
    }

}
