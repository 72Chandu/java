import java.util.Scanner;

class TicketCounter {
    private int passengerCount;
    private double ticketPrice;

    // Constructor
    public TicketCounter(double ticketPrice) {
        this.passengerCount = 0;
        this.ticketPrice = ticketPrice;
    }

    // Method to issue a ticket
    public void issueTicket(int count) {
        if (count <= 0) {
            System.out.println("Invalid number of tickets. Please enter a positive value.");
            return;
        }
        this.passengerCount += count;
        System.out.println(count + " ticket(s) issued.");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Total Passengers: " + passengerCount);
        System.out.println("Total Earnings: $" + (passengerCount * ticketPrice));
    }
}

public class TicketCounterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize ticket counter with a price
        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();
        TicketCounter counter = new TicketCounter(price);

        // Menu-driven program
        int choice;
        do {
            System.out.println("\n--- Ticket Counter Menu ---");
            System.out.println("1. Issue Ticket");
            System.out.println("2. Show Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of tickets to issue: ");
                    int count = scanner.nextInt();
                    counter.issueTicket(count);
                    break;

                case 2:
                    counter.displayDetails();
                    break;

                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
/*
Enter ticket price: 10.5

--- Ticket Counter Menu ---
1. Issue Ticket
2. Show Details
3. Exit
Enter your choice: 1
Enter the number of tickets to issue: 3
3 ticket(s) issued.

--- Ticket Counter Menu ---
1. Issue Ticket
2. Show Details
3. Exit
Enter your choice: 2
Ticket Price: $10.5
Total Passengers: 3
Total Earnings: $31.5

--- Ticket Counter Menu ---
1. Issue Ticket
2. Show Details
3. Exit
Enter your choice: 3
Exiting the system. Thank you!

*/

