class FoodPreparation extends Thread {
    public void run() {
        System.out.println("Food preparation started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Food preparation completed.");
    }
}
class DeliveryPartner extends Thread {
    public void run() {
        System.out.println("Searching for delivery partner...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Delivery partner found.");
    }
}
class OrderNotification extends Thread {
    public void run() {
        System.out.println("Sending order notification...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order notification sent.");
    }
}
public class FoodDelivery {
    public static void main(String[] args) {

        FoodPreparation food = new FoodPreparation();
        DeliveryPartner delivery = new DeliveryPartner();
        OrderNotification notification = new OrderNotification();
        food.start();
        delivery.start();
        notification.start();
    }
}
