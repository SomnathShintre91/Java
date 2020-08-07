/**
 * Octal to Decimal
 * it convert Octal number to decimal
 * present in sub-package convert of math package
 */
package math.convert;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {

    }

    public void octalToDecimal() {

        System.out.println("\n\t\tHexadecimal to Decimal!\n");

        int octal, m, decimal = 0, n = 0;

        System.out.print("\tEnter the Decimal number: ");
        Scanner sc = new Scanner(System.in);
        octal = sc.nextInt();
        sc.close();

        m = octal;

        // writing logic
        while (true) {
            if (octal == 0) {
                break;
            } else {
                int temp = octal % 10;
                decimal += temp * Math.pow(8, n);
                octal = octal / 10;
                n++;
            }
        }

        System.out.println("\tOctadecimal to Decimal of " + m + " is: " + decimal);
    }
}