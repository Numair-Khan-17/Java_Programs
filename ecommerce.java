import java.util.*;

interface makepayment {
    void payment();
}
interface placeorder {
    void order();
}
interface writeReview {
    void review();
}
class Flipkart implements makepayment, placeorder, writeReview {
    int choice;

    public void payment() {
        System.out.println("Payment done");
    }

    public void order() {
        System.out.println("Order placed");
    }

    public void review() {
        System.out.println("Review given");
    }

    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1. Payment 2. Order 3. Feedback");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                payment();
                break;
            case 2:
                order();
                break;
            case 3:
                review();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

class ecommerce {
    public static void main(String[] args) {
        Flipkart fk = new Flipkart();
        fk.process();
    }
}
