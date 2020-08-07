/**
 * Binary to Decimal
 * it convert binary number to decimal
 * present in sub-package convert of math package
 */
package math.convert;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

    }

    public void binaryToDecimal() {

        System.out.println("\n\t\tBinary To Decimal!\n");

        int binary, m, n = 0, decimal = 0;

        System.out.print("\tEnter the Binary number: ");

        Scanner sc = new Scanner(System.in);
        binary = sc.nextInt();
        sc.close();

        m = binary;

        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }

        System.out.println("\tBinary to Decimal of " + m + " is: " + decimal);
    }
}