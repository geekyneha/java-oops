package bank;

public class CurrentAccount extends Account {

   
    private double overdraftLimit;
    private String accountNumber = "CA001";

    public CurrentAccount(double balance, double overdraftLimit, String accountNumber){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount){
        if(amount > 0){
            if(balance + overdraftLimit >= amount){
                balance -= amount;
                System.out.println("Amount debited: " + amount +
                   " | Account No: " + accountNumber +
                   " | Available Balance: " + balance);

            }
            else{
                System.out.println("Withdrawal amount exceeds overdraft limit.");
            }
        }
    }



    
}
