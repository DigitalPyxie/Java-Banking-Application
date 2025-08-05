package com.kekeletso;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new CheckingAccount("Jane Doe", "92051228");
        account.displayAccountType();

        int option;
        do {
            System.out.println("Welcome " + account.getCustomerName() + "\nAccount: " + account.getAccountNumber());
            System.out.println("Please select from the options below: ");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");

            System.out.println("Selection: ");
            option = scanner.nextInt();
        

           switch (option) {
                case 1:
                    System.out.println("Account Balance: R" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount into Account: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    System.out.println("R" + depositAmount + " deposited into your Account.");
                    System.out.println("New Account Balance: R" + account.getBalance());
                   
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw from Account: ");
                    int withdrawAmount = scanner.nextInt();
                    account.withdraw(withdrawAmount);
                    System.out.println("R" + withdrawAmount + " withdrawn from your Account.");
                    System.out.println("New Account Balance: R" + account.getBalance());
                    
                    break;

                case 4:
                    account.printTransactionHistory();
                    break;

                case 5:
                    System.out.println("Thank you for banking with us!");
                    System.out.println("---------------------------------");
                    break;

                default:
                    System.out.println("Please enter from the options provided.");
                    break;

            }

        } while (option != 5);

        scanner.close();
         
        }
    }

