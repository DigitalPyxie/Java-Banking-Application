package com.kekeletso;

import java.util.Scanner;

public abstract class Account {
    private String customerName;
    private String accountNumber;
    private int balance;
    private int transactionHistory;

    public Account(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactionHistory = 0;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getLastTranscation(){
        return transactionHistory;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory = amount;
        }
    }

    public void printTransactionHistory() {
        if (transactionHistory > 0){
            System.out.println("Deposited: R" + transactionHistory);
        } else if (transactionHistory < 0) {
            System.out.println("Withdrawn: R" + Math.abs(transactionHistory));
        } else {
            System.out.println(" No account activity.");
        }
    }

    public abstract void displayAccountType();
}