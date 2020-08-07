
/**
 * Application that use the math package to demostarate different classes from the package
 * it's the Main-Class from where the execution begins.
 */
import java.util.Scanner;

// importing the statistical operation from math package
import math.StatisticalOperations;

// importing the classes from convert sub-package present in math package
import math.convert.BinaryToDecimal;
import math.convert.DecimalToBinary;
import math.convert.DecimalToHex;
import math.convert.DecimalToOctal;
import math.convert.HexToDecimal;
import math.convert.OctalToDecimal;

public class Mathematical {

    public static void main(String[] args) {

        // creating objects or instances
        StatisticalOperations sos = new StatisticalOperations();

        BinaryToDecimal btd = new BinaryToDecimal();
        DecimalToBinary dtb = new DecimalToBinary();
        DecimalToHex dth = new DecimalToHex();
        DecimalToOctal dto = new DecimalToOctal();
        HexToDecimal htd = new HexToDecimal();
        OctalToDecimal otd = new OctalToDecimal();

        Scanner sc = new Scanner(System.in);
        int ch;

        // displying the list
        System.out.println("\n\t\t<---------------Mathematical Package--------------->\n\n");

        System.out.println("\tOperations: ");
        System.out.println("\t1:Average\t        2:Mean\t                3:Median");
        System.out.println("\t4:Standerd Deviation\t5:Binary To Decimal\t6:Decimal To Binary");
        System.out.println("\t7:Decimal To Hex\t8:Decimal To Octal\t9:Hex To Decimal");
        System.out.println("\t10:Octal To Decimal\t11:Exit\n");
        System.out.print("\t\tSelect your choise: ");
        ch = sc.nextInt();

        // switch case
        switch (ch) {
            case 1:
                sos.average();
                break;
            case 2:
                sos.mean();
                break;
            case 3:
                sos.medium();
                break;
            case 4:
                sos.standerdDeviation();
                break;
            case 5:
                btd.binaryToDecimal();
                break;
            case 6:
                dtb.decimalToBinary();
                break;
            case 7:
                dth.decimalToHex();
                break;
            case 8:
                dto.decimalToOctal();
                break;
            case 9:
                htd.hexToDecimal();
                break;
            case 10:
                otd.octalToDecimal();
                break;
            case 11:
                System.exit(0);
                break;
            default:
                System.out.println("Enter the correct choice!");
        }

        sc.close();
    }
}