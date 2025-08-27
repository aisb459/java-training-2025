package com.herbalife.labs.lab04;

public class Account {
    private double balance;
    private int withdrawlCount =0;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance = balance+amount;
    }
    public void withdraw(int amount){
        this.withdrawlCount++;
        if(this.withdrawlCount<=3) {
            this.balance = balance - amount;
        }
        else {
            this.balance = balance - (amount+(0.5 * amount)/100);
        }


    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class CurrentAccount{

}
