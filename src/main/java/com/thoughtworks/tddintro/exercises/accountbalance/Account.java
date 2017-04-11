package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private Integer balance;

    public Account(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount) {
        this.balance +=  amount;
    }
    public void withdrawal(Integer amount)  {
        this.balance -= amount;
    }

    public Integer getBalance() {
        return this.balance;
    }
}
