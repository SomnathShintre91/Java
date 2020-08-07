/**
 * Statistical Operations
 * to calculate the average, mean, median and standerd deviation
 * present in math package! 
 */
package math;

import java.util.Scanner;

public class StatisticalOperations {
    public static void main(String[] args) {

    }

    // Scanner Class
    Scanner sc = new Scanner(System.in);

    /**
     * Function to calculate Average
     */
    public void average() {

        int n, sum = 0;
        System.out.println("\n\t\tFinding Average!\n");

        System.out.print("\tEnter Size of Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("\n\tEnter " + n + " numbers : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        sc.close();

        System.out.println("\tAverage ::" + sum / (float) n);
    }

    /**
     * Function to calculate Mean
     */
    public void mean() {

        int sum = 0, n;

        System.out.println("\n\t\tFinding Mean!\n");

        System.out.print("Enter Size of Array: ");

        n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("\n\tEnter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        sc.close();

        System.out.println("\tMean ::" + sum / (float) n);

    }

    /**
     * Function to calculate Median
     */
    public void medium() {

        int n;

        System.out.println("\n\t\tFinding Median!\n");

        System.out.print("\tEnter Size of Array");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("\n\tEnter" + n + "elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("\tMedian ::" + a[n / 2]);
    }

    /**
     * Function to calculate Standerd Deviation
     */
    public void standerdDeviation() {

        int n;

        System.out.println("\n\t\tFinding Standerd Deviation!\n");

        double sum = 0.0, standardDeviation = 0.0;
        System.out.print("\tEnter Size of Array: ");

        n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("\n\tEnter" + n + "elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        sc.close();

        double mean = sum / n;

        for (double num : a) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        System.out.println("\tStanderd Deviation ::" + standardDeviation / n);
    }
}