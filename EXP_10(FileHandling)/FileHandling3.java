import java.io.*;
import java.util.Scanner;

public class FileHandling3 implements java.io.Serializable {
    
    String name;
    int age;
    int weight;
    int height;
    String city;
    long number;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String toString(){
        return "\nStudent Details!\n"+
                "Name: "+name+"\n"+
                "Age: "+age+"\n"+
                "Height: "+height+"\n"+
                "Weight: "+weight+"\n"+
                "City: "+city+"\n"+
                "Mobile Number: "+number+"\n";
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        
        FileHandling3 std = new FileHandling3();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student details:");
        System.out.print("Name: ");
        String name = sc.next();
        std.setName(name);

        System.out.print("Age: ");
        int age = sc.nextInt();
        std.setAge(age);

        System.out.print("Weidht: ");
        int weight = sc.nextInt();
        std.setWeight(weight);

        System.out.print("Height: ");
        int height = sc.nextInt();
        std.setHeight(height);

        System.out.print("City: ");
        String city = sc.next();
        std.setCity(city);

        System.out.print("Mobile Number: ");
        long number = sc.nextLong();
        std.setNumber(number);

        System.out.println(std);

        FileOutputStream FOS = new FileOutputStream("Student1.ser");
        ObjectOutputStream OOS = new ObjectOutputStream(FOS);
        OOS.writeObject(std);

        OOS.close();
        sc.close();

        ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("Student1.ser"));
        FileHandling3 std1 = (FileHandling3)OIS.readObject();
        System.out.println("From File");
        System.out.println(std1);

    }
}