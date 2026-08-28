import java.util.*;
class magicsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int sum = 0;
        for (int j = 0; j < n; j++) sum += a[0][j];

        boolean magic = true;

        for (int i = 0; i < n; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < n; j++) {
                r += a[i][j];
                c += a[j][i];
            }
            if (r != sum || c != sum) magic = false;
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - i - 1];
        }

        if (d1 != sum || d2 != sum) magic = false;
        System.out.println(magic ? "Magic Square" : "Not a Magic Square");
    }
}