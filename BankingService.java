package com.bankingsystem.service;

import com.bankingsystem.entity.Account;

import java.util.HashMap;
import java.util.Map;

public class BankingService {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String accountHolder) {
        accounts.put(accountNumber, new Account(accountNumber, accountHolder, 0.0));
    }

    public void deposit(String accountNumber, Double amount) {
        Account account = accounts.get(accountNumber);
        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(String accountNumber, Double amount) {
        Account account = accounts.get(accountNumber);
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public Double getBalance(String accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }
}
