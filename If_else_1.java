import java.util.Scanner;

public class If_else_1 {
    public static void main(String[] args) {
        // defining a variable
        int number;
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        number = sc.nextInt();
        sc.close();
        // Check if the number is divisible by 2 or not
        if (number % 2 == 0) {
            System.out.println("Entered number is a even number");
        } else {
            System.out.println("Entered number is a odd number");
        }
    }
}