package com.company;

import java.util.ArrayList;

public class Customer {
        private String name;
        private ArrayList<Double> transactions;
        //    Construction to create a new Customer and initialize the fields.
        public Customer(String name, double initialAmount){
            this.name= name;
            this.transactions = new ArrayList<Double>();
            addTransaction(initialAmount);
        }
        //
        public void addTransaction(double amount){
//       converts from a primitive value to  the object wrapper
            this.transactions.add(amount);
        }

        public String getName() {
            return name;
        }

        public ArrayList<Double> getTransactions() {
            return transactions;
        }
}

