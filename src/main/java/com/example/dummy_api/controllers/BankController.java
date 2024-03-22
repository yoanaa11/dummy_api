package com.example.dummy_api.controllers;

import com.example.dummy_api.services.contracts.BankService;
import dtos.CardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mock-bank")
public class BankController {

    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/withdraw")
    public String processWithdraw(@RequestBody CardDto cardDto) {
        if (!bankService.processWithdraw(cardDto)) {
            return "REJECTED";
        }

        return "COMPLETED";
    }
}