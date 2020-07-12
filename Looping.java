import java.util.Scanner;
class Looping{
    public static void main(String[] args) {
        int n; 
        System.out.println("Enter Table NO.\n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();  
        System.out.printf("Table of %d is : \n",n);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
        sc.close();
    }
}