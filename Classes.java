class Employee {
    String fName, mName, lName, post;
    int salary;

    Employee(String name1, String name2, String name3, String name4, int s) {
        fName = name1;
        mName = name2;
        lName = name3;
        post = name4;
        salary = s;
    }

    public void discription() {
        System.out.println("Name: " + fName + mName + lName);
        System.out.println("Post: " + post);
        System.out.println("Salary: " + salary);
    }

    public void email() {
        System.out.printf("%s%s@gmail.com\n", fName, lName);
    }

    public void Iam() {
        System.out.println("I'am an employee");
    }
}

class Manager {
    String fName, mName, lName, proName;
    int salary;

    Manager(String name1, String name2, String name3, String name4, int s) {
        fName = name1;
        mName = name2;
        lName = name3;
        proName = name4;
        salary = s;
    }

    public void discription1() {
        System.out.println("Name: " + fName + mName + lName);
        System.out.println("Project Name: " + proName);
        System.out.println("Salary: " + salary);
    }

    public void email() {
        System.out.printf("%s%s@gmail.com\n", fName, lName);
    }

    public void Iam() {
        System.out.println("I'am an employee");
    }
}

public class Classes {

    public static void main(String[] args) {
        Employee e_1 = new Employee("Somnath", "Ravindre", "Shintre", "Manager", 50000);
        Manager m_1 = new Manager("jhon", "jani", "janardnan", "dev", 30211);

        e_1.Iam();
        m_1.Iam();

        e_1.discription();
        m_1.discription1();

        e_1.email();
        m_1.email();
    }

}