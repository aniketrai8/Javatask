package Model;

public class Manager extends Employee {
    private int TA;
    private int DA;
    private int HRA;

    // constructor
    public Manager(String Name, int age, int ID, double Salary, int TA, int DA, int HRA) {
        super(Name, age, ID, Salary);
        this.TA = TA;
        this.DA = DA;
        this.HRA = HRA;

    }

    public double calculateSalary() {
        return super.calculateSalary() + TA + DA + HRA;
    }

}
