import java.util.Scanner;

public class If_else_2 {
    public static void main(String[] args) {
        // defining a variable
        int year;
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = sc.nextInt();
        // Checking leap year condition
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }
        sc.close();
    }
}