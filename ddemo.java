import java.util.*;

class ddemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n >= 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is negative");
            }
        }
    }
}