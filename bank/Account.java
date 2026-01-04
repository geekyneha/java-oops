package bank;

public abstract class Account {

    private String accountNumber;
   protected double balance;

    public Account( String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount credited: " + amount +
                   " | Account No: " + accountNumber +
                   " | Available Balance: " + balance);

        }
    }
    
    public abstract void withdraw(double amount);
    public double getBalance(){
        return balance;
    }

    
    
}
