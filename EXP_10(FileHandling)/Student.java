import java.io.*;
import java.util.Scanner;

public class Student implements java.io.Serializable {

    String stdName;
    int stdAge;
    int stdWeight;
    int stdHeight;
    String stdCity;
    long stdNum;

    public String getStdName() {
        return this.stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return this.stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public int getStdWeight() {
        return this.stdWeight;
    }

    public void setStdWeight(int stdWeight) {
        this.stdWeight = stdWeight;
    }

    public int getStdHeight() {
        return this.stdHeight;
    }

    public void setStdHeight(int stdHeight) {
        this.stdHeight = stdHeight;
    }

    public String getStdCity() {
        return this.stdCity;
    }

    public void setStdCity(String stdCity) {
        this.stdCity = stdCity;
    }

    public long getStdNum() {
        return this.stdNum;
    }

    public void setStdNum(long stdNum) {
        this.stdNum = stdNum;
    }

    public String toString() {
        return "\nStudent Details \n" + "Name: " + stdName + "\n" + "Age: " + stdAge + "\n" + "Weight: " + stdWeight
                + "\n" + "Height: " + stdHeight + "\n" + "City: " + stdCity + "\n" + "Mobile Number:" + stdNum + "\n";
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student details:");
        System.out.print("Name: ");
        String name = sc.next();
        s1.setStdName(name);

        System.out.print("Age: ");
        int age = sc.nextInt();
        s1.setStdAge(age);

        System.out.print("Weidht: ");
        int weight = sc.nextInt();
        s1.setStdWeight(weight);

        System.out.print("Height: ");
        int height = sc.nextInt();
        s1.setStdHeight(height);

        System.out.print("City: ");
        String city = sc.next();
        s1.setStdCity(city);

        System.out.print("Mobile Number: ");
        long number = sc.nextLong();
        s1.setStdNum(number);

        sc.close();

        ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream("StudentDetail.ser"));
        o1.writeObject(s1);
        System.out.println(s1);
        System.out.println("Object written to file");
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("StudentDetail.ser"));
        System.out.println("From File");
        Student StdDetails = (Student) o2.readObject();

        System.out.println(StdDetails);
        o2.close();

    }
}
