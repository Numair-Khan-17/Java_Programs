import java.util.*;

public class CustomerserviceQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        // Customers waiting for service
        queue.add(101);
        queue.add(102);
        queue.add(103);
        queue.add(104);
        queue.add(105);

        System.out.println("Customers waiting: " + queue);

        // Serve customers one by one
        while (!queue.isEmpty()) {
            int customer = queue.poll();
            System.out.println("Serving Customer: " + customer);
            System.out.println("Remaining customers: " + queue);
        }

        // If no customers are left
        if (queue.isEmpty()) {
            System.out.println("No customers waiting");
        }
    }
}
