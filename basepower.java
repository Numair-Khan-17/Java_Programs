import java.util.Scanner;

public class basepower {

    static long power(int a, int n) {
        if (n == 0)
            return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter base");
            int a = sc.nextInt();
            System.out.println("enter exponent");
            int n = sc.nextInt();

            System.out.println(power(a, n));
        }
    }
}