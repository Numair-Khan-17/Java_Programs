import java.util.*;

class bankaccount{
    int balance;
    public bankaccount(int balance) {
        this.balance = balance;
}
synchronized void deposit(int amount) {
    System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
    System.out.println(Thread.currentThread().getName() + " deposit completed");
    balance += amount;
}
int getbalance() {
    return balance;
}
}
class Customer extends Thread {
    bankaccount account;
    int amount;
    public Customer(bankaccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        account.deposit(amount);
    }
  }
 
public class customerBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int amt1=sc.nextInt();
        int amt2=sc.nextInt();
        sc.close();
        bankaccount account = new bankaccount(b);
        Customer c1 = new Customer(account, amt1);
        Customer c2 = new Customer(account, amt2);
        c1.start();
        c2.start();
        try{
            c1.join();
            c2.join();
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Final balance: " + account.getbalance());
    }
}
