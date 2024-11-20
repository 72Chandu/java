import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu
        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");

        // Get user choice
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        // Get numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Perform the chosen operation
        double result = 0;
        boolean valid = true;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Modulo Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and choose a valid option.");
                valid = false;
        }

        // Close scanner
        if (valid) {
            System.out.println("Thank you for using the calculator!");
        }
        scanner.close();
    }
}

/*
Welcome to the Calculator!
Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Modulo (%)
Enter your choice (1-5): 2
Enter the first number: 15
Enter the second number: 5


Subtraction Result: 10.0
Thank you for using the calculator!

*/
