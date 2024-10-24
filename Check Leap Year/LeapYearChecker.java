import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If year is divisible by 100, it must also be divisible by 400 to be a leap year
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                // If year is not divisible by 100, it is a leap year
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
/*
Enter a year to check if it is a leap year: 2024
2024 is a leap year.
*/
