/**
 * Decimal to Binary
 * it convert decimal number to binary
 * present in sub-package convert of math package
 */
package math.convert;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // decimalToBinary();
    }

    public void decimalToBinary() {

        System.out.println("\n\t\tDecimal To Binary!\n");
        int decimal;
        System.out.print("\tEnter the Decimal number: ");
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        sc.close();
        int m = decimal;
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        System.out.print("\n\tDecimal to Binary of " + m + " is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}