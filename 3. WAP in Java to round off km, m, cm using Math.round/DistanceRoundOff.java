import java.util.Scanner;
public class DistanceRoundOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distances in kilometers, meters, and centimeters
        System.out.print("Enter distance in kilometers (e.g., 12.345): ");
        double kilometers = sc.nextDouble();

        System.out.print("Enter distance in meters (e.g., 123.45): ");
        double meters = sc.nextDouble();

        System.out.print("Enter distance in centimeters (e.g., 12.3): ");
        double centimeters = sc.nextDouble();

        // Rounding off the distances
        long roundedKilometers = Math.round(kilometers);
        long roundedMeters = Math.round(meters);
        long roundedCentimeters = Math.round(centimeters);

        // Displaying the rounded results
        System.out.println("\nRounded Distances:");
        System.out.println("Kilometers: " + roundedKilometers + " km");
        System.out.println("Meters: " + roundedMeters + " m");
        System.out.println("Centimeters: " + roundedCentimeters + " cm");

        sc.close();
    }
}

/*
Enter distance in kilometers (e.g., 12.345): 12.345
Enter distance in meters (e.g., 123.45): 123.45
Enter distance in centimeters (e.g., 12.3): 12.3

Rounded Distances:
Kilometers: 12 km
Meters: 123 m
Centimeters: 12 cm

*/