package Model;

public class Developer extends Employee{
    private int bonus;
    private int paidLeaves;

    //constructor
    public Developer(String Name,int age,int ID,double Salary,int bonus,int paidLeaves){
        super(Name,age,ID,Salary);
        this.bonus=bonus;
        this.paidLeaves=paidLeaves;
    }

    public double calculateSalary(){
        return super.calculateSalary()+ bonus+ paidLeaves;
    }

}