import java.util.Scanner;
class BubbleSort{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.printf("Enter %d numbers : ",n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.printf("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ",arr[i]);
        }
        sc.close();
    }
}