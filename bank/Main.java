package bank;

public class Main {
    public static void main(String args[]){
        Account acc = new SavingAccount("SA123" , 5000);
        acc.deposit(10000);
        acc.withdraw(4000);
        System.out.println("Final Balance: " + acc.getBalance());
    }
    
}
