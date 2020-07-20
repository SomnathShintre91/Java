import java.util.Scanner;

public class Else_if_ladder_2 {
    public static void main(String[] args) {
        // defining a variable
        int number;
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        number = sc.nextInt();

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is 0.");
        }
        sc.close();
    }
}