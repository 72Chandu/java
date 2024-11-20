import java.util.Scanner;
public class HillTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {// Loop to print each row
            for (int j = 1; j <= n - i; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars for the current row (left side of the hill)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
