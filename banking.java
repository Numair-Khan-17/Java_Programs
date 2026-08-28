import java.util.Scanner;
public class banking {
    public static void transfer(int senderBalance, int transferAmount,
                                int senderAccount, int receiverAccount) {
        if (senderBalance <= 0) {
            throw new IllegalArgumentException("Sender balance must be greater than 0");
        }
        if (transferAmount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be greater than 0");
        }
        if (transferAmount > senderBalance) {
            throw new IllegalArgumentException(
                "Transfer amount must not exceed sender balance"
            );
        }
        if (transferAmount > 50000) {
            throw new IllegalArgumentException(
                "Transfer amount must not exceed 50000 in a single transaction"
            );
        }
        if (senderAccount == receiverAccount) {
            throw new IllegalArgumentException(
                "Sender and receiver account numbers must be different"
            );
        }
        senderBalance = senderBalance - transferAmount;
        System.out.println("Transfer successful!");
        System.out.println("Transferred amount: " + transferAmount);
        System.out.println("Remaining balance: " + senderBalance);
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senderBalance = 100000;
        System.out.print("Enter sender account number: ");
        int senderAccount = sc.nextInt();
        System.out.print("Enter receiver account number: ");
        int receiverAccount = sc.nextInt();
        System.out.print("Enter transfer amount: ");
        int transferAmount = sc.nextInt();
        try {
            transfer(senderBalance, transferAmount,
                     senderAccount, receiverAccount);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
        sc.close();
    }
}