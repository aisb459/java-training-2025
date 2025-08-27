package com.herbalife.labs.lab04;

import java.time.LocalDate;
import java.util.Date;

public class Transaction {
    private Long accountNumber;
    private int amount;
    private TransactionType transactionType;
    private LocalDate transactionTime;

    public Transaction(Long accountNumber, int amount, TransactionType transactionType, LocalDate transactionTime) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionTime = transactionTime;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", transactionTime=" + transactionTime +
                '}';
    }
}
