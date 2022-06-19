package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);


        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);

        t1.setName("Jimmy");
        t2.setName("Jackl");
        t1.start();
        t2.start();

    }
}
