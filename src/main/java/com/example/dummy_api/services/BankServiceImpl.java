package com.example.dummy_api.services;

import com.example.dummy_api.services.contracts.BankService;
import dtos.CardDto;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.random.RandomGenerator;

@Service
public class BankServiceImpl implements BankService {

    private final RandomGenerator randomGenerator = new Random();

    public BankServiceImpl() {
    }

    @Override
    public Boolean processWithdraw(CardDto cardDto) {
        if (randomGenerator.nextInt(10) > 6) {
            return false;
        }

        return true;
    }
}