package bank;

public class SavingAccount extends Account {


    public SavingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);

        } 
        else{
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
