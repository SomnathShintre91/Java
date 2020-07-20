import java.util.Scanner;

public class Else_if_ladder_1 {
    public static void main(String[] args) {
        // defining a variable
        int marks;
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        marks = sc.nextInt();
        // Else-if ladder
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }
        sc.close();
    }
}