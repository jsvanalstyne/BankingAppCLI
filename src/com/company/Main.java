package com.company;

public class Main {

    public static void main(String[] args) {
    Bank bank = new Bank("Bank of America");
    bank.addBranch("Eastern");
    bank.addCustomer("Eastern","Jerrica", 300);
    bank.addCustomer("Eastern", "Mack", 20);
    bank.addCustomer("Eastern", "Jane", 2000);
    bank.addBranch("Main");
    bank.addCustomer("Main", "Jim", 25);

    bank.addCustomerTransaction("Main", "Jim", 25);
    bank.addCustomerTransaction("Main", "Jim", 25);
    bank.addCustomerTransaction("Main", "Jim", 25);

    bank.listCustomers("Eastern", false);
    }
}
