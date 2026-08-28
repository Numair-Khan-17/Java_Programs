import java.util.Scanner;

class Stock {
    int stock;

    Stock(int stock) {
        this.stock = stock;
    }

    public synchronized void purchase(int customer) {
        if (stock > 0) {
            stock--;

            System.out.println("Customer " + customer + " purchase successful");
            System.out.println("Remaining stock = " + stock);
        } else {
            System.out.println("Customer " + customer + " purchase failed");
            System.out.println("Insufficient stock!!");
        }
    }
}

class Customer extends Thread {
    Stock stock;
    int customer;

    Customer(Stock stock, int customer) {
        this.stock = stock;
        this.customer = customer;
    }

    public void run() {
        stock.purchase(customer);
    }
}

public class Stocks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of stocks available:");
        int numStocks = sc.nextInt();

        sc.close();

        Stock stock = new Stock(numStocks);

        Customer c1 = new Customer(stock, 1);
        Customer c2 = new Customer(stock, 2);
        Customer c3 = new Customer(stock, 3);
        Customer c4 = new Customer(stock, 4);

        
        try {
            c1.start();
            c1.join();

            c2.start();
            c2.join();

            c3.start();
            c3.join();

            c4.start();
            c4.join();

        } catch (InterruptedException e) {
            System.out.println("Error occurred while purchasing stocks!!");
        }
    }
}