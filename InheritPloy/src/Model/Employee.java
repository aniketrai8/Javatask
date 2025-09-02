//base class
package Model;

public class Employee {
    private String Name;
    private int age;
    private int ID;
    private double Salary;

    // constructor
    public Employee(String Name, int age, int ID, double Salary) {
        this.Name = Name;
        this.age = age;
        this.ID = ID;
        this.Salary = Salary;

    }

    public double calculateSalary() {
        return Salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Salary: " + calculateSalary());
    }
}