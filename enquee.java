import java.util.*;

public class enquee {
    int[] a;
    int front, rear, capacity;

    enquee(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        a[++rear] = value;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("removed " + a[front++]);
    }

    void peek() {
        if (front > rear) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("first element is " + a[front]);
    }

    void display() {
        if (front > rear) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("elements in the queue are:");
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enquee q = new enquee(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.peek();
        q.display();
    }
}