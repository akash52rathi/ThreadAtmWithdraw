package com.company;

public class AccountHolder implements Runnable  {

    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }



    @Override
    public void run() {

        for(int i=0;i<5;i++)
        {
            makewithdraw(200);

            if (account.getBalance() < 0) {
                System.out.println("account is overdrawn!");
                break;
            }

        }

    }

    private synchronized void makewithdraw(int amount)
    {
        if(account.getBalance()>=amount)
        {
            System.out.println(Thread.currentThread().getName() + " Is going to withdraw amount" );
            try {
                Thread.sleep(300);
            }
            catch (Exception e)
            {

            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + "completese withdrwala amount  " +amount + " Remaining balance is  " + account.getBalance() );
        }

        else {
            System.out.println("Not enough money is present in account for"+ Thread.currentThread().getName() + " with balance in account " + account.getBalance() );
        }

    }


}
