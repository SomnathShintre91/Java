import java.util.Scanner;

public class Flodys {

    static int Dublicate_no(int nums[]) {

        int tortoise, hare;
        tortoise = nums[0];
        hare = nums[0];
        while (true) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if (tortoise == hare) {
                break;
            }
        }
        hare = tortoise;
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return tortoise;
    }

    public static void main(String[] args) {
        System.out.println("             Flody's Tortoise And Hare Algorithm              ");
        System.out.println("==============================================================");
        int n, nums[];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre Size Of Array: ");
        n = sc.nextInt();
        nums = new int[n + 1];
        System.out.printf("Enter %d numbers in Range [1 t0 %d]: ", n + 1, n);
        for (int i = 0; i <= n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.printf("Dublicate Number is : %d\n\n", Dublicate_no(nums));
        sc.close();
    }
}