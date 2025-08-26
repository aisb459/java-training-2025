package com.herbalife.labs.lab04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountUser {
    public static void main(String[] args) {
        Account account = new Account(20000);
        List<Transaction> transactionList = new ArrayList<>();
        System.out.println(account.toString());;
        transactionList.add(new Transaction(101232434L,20000,"Credit", LocalDate.now()));

        account.deposit(20000);
        transactionList.add(new Transaction(101232434L,20000,"Credit", LocalDate.now()));
        account.deposit(20000);
        System.out.println(account.toString());;
        transactionList.add(new Transaction(101232434L,20000,"Credit", LocalDate.now()));

        account.withdraw(10000);
        transactionList.add(new Transaction(101232434L,10000,"Debit", LocalDate.now()));
        System.out.println(account.toString());

        account.withdraw(10000);
        transactionList.add(new Transaction(101232434L,10000,"Debit", LocalDate.now()));
        System.out.println(account.toString());

        account.withdraw(10000);
        transactionList.add(new Transaction(101232434L,10000,"Debit", LocalDate.now()));
        System.out.println(account.toString());

        account.withdraw(10000);
        transactionList.add(new Transaction(101232434L,10000,"Debit", LocalDate.now()));
        System.out.println(account.toString());

        transactionList.forEach(System.out::println);




    }
}
