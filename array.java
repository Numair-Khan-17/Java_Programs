import java.util.*;
class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i] > p[j]) {
                    int x = p[i];   
                    p[i] = p[j];
                    p[j] = x;

                    x = h[i];
                    h[i] = h[j];
                    h[j] = x;
                }
            }
        }
        int max = 0;
        int a = 0, b = 0;
        for (int i = 0; i < n - 1; i++) {
            int d = p[i + 1] - p[i];
            if (d > max) {
                max = d;
                a = h[i];
                b = h[i + 1];
            }
        }
        System.out.println(Math.min(a, b) + " " + Math.max(a, b));
    }
}