// Abstract class: Student
abstract class Student {
    protected String name;
    protected int rollNumber;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Abstract method to calculate total marks
    public abstract int calculateTotalMarks();

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class: Marks
class Marks extends Student {
    private int subject1;
    private int subject2;
    private int subject3;

    // Constructor
    public Marks(String name, int rollNumber, int subject1, int subject2, int subject3) {
        super(name, rollNumber);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Implementation of abstract method
    @Override
    public int calculateTotalMarks() {
        return subject1 + subject2 + subject3;
    }

    // Display details and marks
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Marks - Subject 1: " + subject1 + ", Subject 2: " + subject2 + ", Subject 3: " + subject3);
        System.out.println("Total Marks: " + calculateTotalMarks());
    }
}

// Main class
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Create a Marks object
        Marks student = new Marks("Alice", 101, 85, 90, 88);
        
        // Display student details and total marks
        System.out.println("Student Details:");
        student.displayDetails();
    }
}

