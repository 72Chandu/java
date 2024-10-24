import java.util.Scanner;
public class CompareFloatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = sc.nextDouble();
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Compare the numbers up to three decimal places
        if (Math.abs(num1 - num2) < 0.001) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different up to three decimal places.");
        }
    }
}
/*
Enter the first floating-point number: 3.1234
Enter the second floating-point number: 3.1245
First number: 3.1234
Second number: 3.1245
The numbers are different up to three decimal places.

*/
