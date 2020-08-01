class SavingsAccount {

    // Static Variable
    private static double annualInterestRate;
    // private instance variable
    private double savingsBalance;

    // Parameterized Constructor
    public SavingsAccount(double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    // Getters And Setters
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        System.out.println("Current savings balance: " + savingsBalance);
        savingsBalance = savingsBalance + (savingsBalance * annualInterestRate) / 12;
        System.out.println("New savings balance: " + savingsBalance);
    }

    // Static method to modify intrest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}

public class Bank {
    public static void main(String[] args) {

        // Creating objects or instances
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(4000);

        System.out.println("\nsaver1's Current savings balance: " + saver1.getSavingsBalance());
        System.out.println("saver2's Current savings balance: " + saver2.getSavingsBalance());

        System.out.println("\nModifying Interest Rate to 1.03");
        // Accessing Static Method
        SavingsAccount.modifyInterestRate(1.03);
        System.out.println("Saver1: ");
        saver1.calculateMonthlyInterest();
        System.out.println("Saver2: ");
        saver2.calculateMonthlyInterest();

        System.out.println("\nModifying Interest Rate to 1.05");
        // Accessing Static Method
        SavingsAccount.modifyInterestRate(1.05);
        System.out.println("Saver1: ");
        saver1.calculateMonthlyInterest();
        System.out.println("Saver2: ");
        saver2.calculateMonthlyInterest();
        System.out.println();

    }
}