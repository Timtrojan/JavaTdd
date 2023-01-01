package tdd;

public class AccountBeta {
    private double balance;
    private String accountName;
    public static String accountNumber = "";

    public AccountBeta(double balance, String accountName, String accountNumber) {
        this.balance=balance;
        this.accountName=accountName;
        this.accountNumber=accountNumber;

    }

    public static String transfer(AccountBeta firstAccount, AccountBeta secondAccount, double amount) {
        firstAccount.balance = firstAccount.balance-amount;
        secondAccount.balance= secondAccount.balance+amount;

        return "transfer of"+" "+Double.toString(amount)+" "+"transfer successful";


    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }



    public double getBalance() {
        return balance;
    }

    public void  withdraw(double amount) {

        if (balance>amount){
            if (amount>1) balance=balance-amount;}

    }

    public void deposit(double amount ) {
        balance=balance+amount;
    }
}
