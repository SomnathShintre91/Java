import java.util.*;
public class Odd_Even{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number :");
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}