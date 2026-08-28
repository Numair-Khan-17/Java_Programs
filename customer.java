class Product {
    private int stock;

    Product(int stock) {
        this.stock = stock;
    }

    synchronized void purchase(String customer, int qty) {
        if (stock >= qty) {
            stock -= qty;
            System.out.println(customer + " purchased " + qty +
                    " items. Stock left: " + stock);
        } else {
            System.out.println(customer + " purchase failed. Stock: " + stock);
        }
    }
}

class Customer extends Thread {
    Product product;
    int qty;

    Customer(String name, Product product, int qty) {
        super(name);
        this.product = product;
        this.qty = qty;
    }

    public void run() {
        product.purchase(getName(), qty);
    }
}

public class customer {
    public static void main(String[] args) throws InterruptedException {
        Product product = new Product(5);

        Thread c1 = new Customer("Customer 1", product, 2);
        Thread c2 = new Customer("Customer 2", product, 2);
        Thread c3 = new Customer("Customer 3", product, 2);
        Thread c4 = new Customer("Customer 4", product, 1);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
    }
}