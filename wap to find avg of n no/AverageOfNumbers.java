import java.util.Scanner;
public class AverageOfNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;
        System.out.println("The average is: " + average);
    }
}
