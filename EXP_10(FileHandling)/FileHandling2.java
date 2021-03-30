import java.io.*;
import java.util.Scanner;

public class FileHandling2 {
    

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        FileOutputStream FOS = new FileOutputStream("Student.txt");
        DataOutputStream DOS = new DataOutputStream(FOS);


        System.out.println("\n\t--File Handling--");
        System.out.println("Enter Student details:");
        System.out.print("Name: ");
        String name = sc.next();
        DOS.writeUTF(name);

        System.out.print("Age: ");
        int age = sc.nextInt();
        DOS.writeInt(age);

        System.out.print("Weight: ");
        int weight = sc.nextInt();
        DOS.writeInt(weight);

        System.out.print("Height: ");
        int height = sc.nextInt();
        DOS.writeInt(height);

        System.out.print("City: ");
        String city = sc.next();
        DOS.writeUTF(city);

        System.out.print("Mobile Number: ");
        long number = sc.nextLong();
        DOS.writeLong(number);

        DOS.close();
        sc.close();

        FileInputStream FIS = new FileInputStream("Student.txt");
        DataInputStream DIS = new DataInputStream(FIS);

        System.out.println("\n\n*-*-*-*-*-*-*-*-*");
        System.out.println("Student Details:");
        System.out.println("Name: " + DIS.readUTF());
        System.out.println("Age: " + DIS.readInt());
        System.out.println("Weight: " + DIS.readInt());
        System.out.println("Height: " + DIS.readInt());
        System.out.println("City: " + DIS.readUTF());
        System.out.println("Number: " + DIS.readLong());
        System.out.println("*-*-*-*-*-*-*-*-*\n");

        DIS.close();
    }
}
