package com.bankingsystem.entity;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private Double balance;

    public Account(String accountNumber, String accountHolder, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters and setters
}
