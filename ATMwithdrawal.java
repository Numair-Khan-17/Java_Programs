import java.util.Scanner;
public class ATMwithdrawal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int balance = 100000;
            System.out.println("Enter the amount to withdraw: ");
            int withdrawalAmount = sc.nextInt();
            try {
                if(withdrawalAmount < 0) {
                    throw new ArithmeticException();
                }
                else{
                    balance=balance-withdrawalAmount;
                    System.out.println("Amount withdrawn: " + withdrawalAmount);
                    System.out.println("Remaining balance: " + balance);
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: Withdrawal amount cannot be negative.");
            }
            finally {
                System.out.println("Transaction completed.");
            }
        }
    }
}