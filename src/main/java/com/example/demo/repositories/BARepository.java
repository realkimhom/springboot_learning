package com.example.demo.repositories;

import com.example.demo.domain.BankAccount;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BARepository extends JpaRepository<BankAccount, Integer> {

}
