package utils;

public class Bank {

    private int accountNumber;
    private String accountHolder;
    private double balance;
    private double amount;
    private final double TAX = 5.0;

    
    public Bank (int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Initialize balance to zero
    }

    public Bank(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        this.amount = amount;
        balance += amount;
    }

    public void withdraw(double amount, double balance){
        this.amount = amount;
        this.balance = balance;

       if(amount <= balance) {
            balance -= amount + TAX;
            this.balance = balance;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
        
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}