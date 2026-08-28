import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
        int i = 0, j = str.length() - 1;
        boolean flag = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

            if (flag)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}