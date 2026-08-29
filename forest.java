import java.util.*;

public class forest {

    static int findMax(int[] a, int n) {
        if (n == 1)
            return a[0];

        return Math.max(a[n - 1], findMax(a, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(findMax(a, n));
        sc.close();
    }
}