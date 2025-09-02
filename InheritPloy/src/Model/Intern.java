
package Model;

public class Intern extends Employee{
    private int bonus;

    //constructor
    public Intern(String Name,int age,int ID,double Salary,int bonus)
    {
        super(Name,age,ID,Salary);
        this.bonus=bonus;

    }

    public double calculateSalary(){
        return super.calculateSalary()+bonus;
    }

}