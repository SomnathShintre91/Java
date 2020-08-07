/**
 * decimal to Octal
 * it convert decimal number to octal
 * present in sub-package convert of math package
 */
package math.convert;

import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {
        // decimalToOctal();
    }

    public void decimalToOctal() {

        System.out.println("\n\t\tDecimal to Octal!\n");

        int decimal, m, i = 0;

        System.out.print("\tEnter the Decimal number: ");

        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        sc.close();
        // array to store octal number
        int[] octalNum = new int[100];

        m = decimal;
        // counter for octal number array

        while (decimal != 0) {
            // storing remainder in octal array
            octalNum[i] = decimal % 8;
            decimal = decimal / 8;
            i++;
        }

        System.out.print("\n\tDecimal to octal of " + m + " is: ");
        // Printing octal number array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);

        System.out.println();
    }

}