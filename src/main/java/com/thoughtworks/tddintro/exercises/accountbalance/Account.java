package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private Integer balance;

    public Account(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount) {
        balance +=  amount;
    }
    public void withdrawal(Integer amount)  {
        if (balance > amount) {
            balance -= amount;
        }
    }

    public Integer getBalance() {
        return balance;
    }
}
