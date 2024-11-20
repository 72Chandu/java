import java.util.Scanner;
public class PhoneBillCalculatorForN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cases: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the duration of call " + i + " in minutes: ");
            int minutes = scanner.nextInt();
            double totalBill = 0;
            if (minutes <= 10) {
                totalBill = minutes * 1; 
            } else if (minutes <= 25) {
                totalBill = 10 * 1 + (minutes - 10) * 1.2; 
            } else {
                totalBill = 10 * 1 + 15 * 1.2 + (minutes - 25) * 2; 
            }
            System.out.println("The total phone bill for call " + i + " is: ₹" + totalBill);
        }
    }
}

