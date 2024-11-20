/*
Suppose you are building a payment processing system that can handle multiple payment methods (like bank 
transfer, cards ) etc explain how you would use polymorphism to implement this system.
*/
// Interface for Payment Method
interface PaymentMethod {
    // Method to process payment
    void processPayment(double amount);
}

// Bank Transfer Implementation
class BankTransfer implements PaymentMethod {
    private String bankAccountNumber;

    public BankTransfer(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount + " from account " + bankAccountNumber);
    }
}

// Credit Card Implementation
class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card paymenvt of $" + amount + " for cardholder " + cardHolderName);
    }
}

// PayPal Implementation
class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for email " + email);
    }
}

// Main class demonstrating polymorphism
public class PaymentProcessingSystem {
    public static void main(String[] args) {
        // Create different payment method objects
        PaymentMethod bankTransfer = new BankTransfer("123456789");
        PaymentMethod creditCard = new CreditCard("4111 1111 1111 1111", "John Doe");
        PaymentMethod payPal = new PayPal("johndoe@example.com");

        // Array of payment methods (polymorphism in action)
        PaymentMethod[] paymentMethods = { bankTransfer, creditCard, payPal };

        // Process payments for all methods
        System.out.println("Processing Payments:");
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.processPayment(100.0);
        }
    }
}

/*
Processing Payments:
Processing bank transfer of $100.0 from account 123456789
Processing credit card payment of $100.0 for cardholder John Doe
Processing PayPal payment of $100.0 for email johndoe@example.com

*/