import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for coefficients
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calculate the discriminant (D = b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // Check if a is not zero to avoid division by zero
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero in a quadratic equation.");
        } else {
            // Evaluate the nature of the roots based on the discriminant
            if (discriminant > 0) {
                // Two distinct and real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two real and distinct roots:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                // One real root (repeated root)
                double root = -b / (2 * a);
                System.out.println("The equation has one real root (repeated): " + root);
            } else {
                // Two complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The equation has two complex roots:");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}
/*
Enter coefficient a: 1
Enter coefficient b: -3
Enter coefficient c: 2
The equation has two real and distinct roots:
Root 1: 2.0
Root 2: 1.0
*/
