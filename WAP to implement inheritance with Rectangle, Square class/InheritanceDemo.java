// Base class: Rectangle
class Rectangle {
    protected double length;
    protected double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Display details
    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Derived class: Square
class Square extends Rectangle {

    // Constructor for Square
    public Square(double side) {
        super(side, side); // Call Rectangle constructor with side for both length and width
    }

    // Override display method for Square
    @Override
    public void display() {
        System.out.println("Square - Side: " + length); // Length and width are the same for a square
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Details:");
        rectangle.display();

        System.out.println();

        // Create a Square object
        Square square = new Square(7);
        System.out.println("Square Details:");
        square.display();
    }
}
