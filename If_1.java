import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        System.out.println("JAVA IF CONTITION");
        int a, b;
        // a = 45;
        // b = 35;
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        // Checking a > b
        if (a > b) {
            System.out.printf("\n%d is greater than %d\n", a, b);
        }
    }
}