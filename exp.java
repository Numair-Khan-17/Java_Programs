import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 3 or 678 or 45

        System.out.println(n % 9 == 0 ? 9 : n % 9);

        sc.close();
    }
}