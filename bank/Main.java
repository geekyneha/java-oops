package bank;

public class Main {
    public static void main(String args[]){
        Account savingAcc = new SavingAccount("SA123" , 5000);
       savingAcc.deposit(10000);
        savingAcc.withdraw(4000);
        System.out.println("Final Balance: " + savingAcc.getBalance());

        Account currentAcc = new CurrentAccount(2000, 1000, "CA001");

        currentAcc.deposit(3000);
        currentAcc.withdraw(2500);
        System.out.println("Final Balance: " + currentAcc.getBalance());
    }
    
}
