package com.example.dummy_api.services.contracts;

import dtos.CardDto;

public interface BankService {


    Boolean processWithdraw(CardDto cardDto);
}