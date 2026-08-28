import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("leap year");
                } else {
                    System.out.print("not a leap year");
                }
            } else {
                System.out.print("leap year");
            }
        } else {
            System.out.print("not a leap year");
        }
        }
    }
    
}
