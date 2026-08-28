import java.util.*;

class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char x = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != x)
                result += s.charAt(i);
        }

        System.out.println(result);
    }
}
