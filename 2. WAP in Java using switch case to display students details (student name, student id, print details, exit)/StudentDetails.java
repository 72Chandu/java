import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Sample student details
        String studentName = "John Doe";
        int studentId = 12345;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Display Student Name");
            System.out.println("2. Display Student ID");
            System.out.println("3. Print All Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Student Name: " + studentName);
                    break;
                case 2:
                    System.out.println("Student ID: " + studentId);
                    break;
                case 3:
                    System.out.println("Student Details:");
                    System.out.println("Name: " + studentName);
                    System.out.println("ID: " + studentId);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
}

/*
Select an option:
1. Display Student Name
2. Display Student ID
3. Print All Details
4. Exit
Enter your choice: 1
Student Name: John Doe

Select an option:
1. Display Student Name
2. Display Student ID
3. Print All Details
4. Exit
Enter your choice: 3
Student Details:
Name: John Doe
ID: 12345

*/