abstract class Shape {
    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 4);
        Circle circle = new Circle(3);

        rectangle.displayShape();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        circle.displayShape();
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
