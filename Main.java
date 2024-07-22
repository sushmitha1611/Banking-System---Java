package com.bankingsystem;

import com.bankingsystem.service.BankingService;

public class Main {
    public static void main(String[] args) {
        BankingService bankingService = new BankingService();

        bankingService.createAccount("12345", "John Doe");
        bankingService.deposit("12345", 500.0);
        bankingService.withdraw("12345", 200.0);

        System.out.println("Account Balance: " + bankingService.getBalance("12345"));
    }
}
