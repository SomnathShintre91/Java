import java.util.Scanner;

class Employee {

    // Instance Varibles
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Default Constructor
    public Employee() {
        firstName = null;
        lastName = null;
        monthlySalary = 0.0;
    }

    // Getters And Setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }
}

public class EmployeeTest {
    public static void main(String args[]) {

        // Creating objects or instances
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        // Scanner class to get the user's input
        Scanner sc = new Scanner(System.in);
        String first, last;
        double salary;

        // Entering Employee details from user.
        System.out.println("\nEnter First Name of First Employee: ");
        first = sc.next();
        e1.setFirstName(first);

        System.out.println("Enter Last Name of First Employee: ");
        last = sc.next();
        e1.setLastName(last);

        System.out.println("Enter Monthly Salary of First Employee: ");
        salary = sc.nextDouble();
        e1.setMonthlySalary(salary);

        System.out.println("\nEnter First Name of Second Employee: ");
        first = sc.next();
        e2.setFirstName(first);

        System.out.println("Enter Last Name of Second Employee: ");
        last = sc.next();
        e2.setLastName(last);

        System.out.println("Enter Monthly Salary of Second Employee: ");
        salary = sc.nextDouble();
        e2.setMonthlySalary(salary);

        sc.close();

        // Displaying Employee's capabilities.
        System.out.println("\nFirst Employee's Full Name and Yearly Salary.\n");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + "  " + e1.getMonthlySalary() * 12 + "\n");

        System.out.println("Second Employee's Full Name and Yearly Salary.\n");
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + "  " + e2.getMonthlySalary() * 12 + "\n");

        // Displaying Employee's capabilities with 10% raise.
        System.out.println("Displaying New Total Yearly Salary After 10% Raise.\n");
        System.out.println(
                e1.getFirstName() + " " + e1.getLastName() + "  " + (e1.getMonthlySalary() * 1.10 * 12) + "\n");
        System.out.println(
                e2.getFirstName() + " " + e2.getLastName() + "  " + (e2.getMonthlySalary() * 1.10 * 12) + "\n");
    }
}