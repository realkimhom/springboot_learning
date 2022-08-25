package com.example.demo.services;

import com.example.demo.domain.BankAccount;
import com.example.demo.repositories.BARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BAService {
    @Autowired
    BARepository baRepository;

    public List<BankAccount> getAll(){
        return baRepository.findAll();
    }



}
