import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


public class ShapeDriver {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("------ Shape Area Calculator ------");
            System.out.println("Which shape area you want to calculate: 1. Circle 2. Rectangle");
            int choice = sc.nextInt();

            Shape shape;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                }
                case 2 -> {
                    System.out.println("Enter length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter width of the rectangle: ");
                    double width = sc.nextDouble();
                    shape = new Rectangle(length, width);
                }
                default -> {
                    System.out.println("Invalid choice");
                    return;
                }
            }

            System.out.println("Area of the selected shape: " + shape.calculateArea());
        }
    }
}
