import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    int value;

    Rectangle(int value) {
        this.value = value;
    }

    void draw() {
        System.out.println("Rectangle: " + value);
    }
}

class Circle extends Shape {
    int value;

    Circle(int value) {
        this.value = value;
    }

    void draw() {
        System.out.println("Circle: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            Shape r = new Rectangle(n);
            Shape c = new Circle(n);

            r.draw();
            c.draw();
        }
    }
}
