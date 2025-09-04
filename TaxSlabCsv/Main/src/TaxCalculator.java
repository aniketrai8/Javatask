import java.io.*;
import java.util.*;

class Employee{
    int Id;
    String Name;
    double Salary;
    double Tax;

    public Employee(int Id,String Name, double Salary) {
        this.Id= Id;
        this.Name= Name;
        this.Salary = Salary;
        this.Tax = CalculateTax(Salary);
    }

    private double CalculateTax(double Salary){
        double Tax;
        if(Salary<=40000){
            Tax = Salary*0.10;

        }
        else if(Salary > 40000 && Salary<=50000){
            Tax= (40000*0.10)+((Salary - 40000)*0.15);
        }
        else{
            Tax= (40000*0.10)+(10000*0.15)+((Salary-50000)*0.20);
        }
        return Tax;
    }
}

public class TaxCalculator {

    public static void main(String[] args) {
        String inputFile = "/Users/aniketrai/IdeaProjects/TaxSlabCsv/Resource/Employee.csv";
        String outputFile = "TaxableIncome.csv";

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int Id = Integer.parseInt(data[0]);
                String Name = data[1];
                double Salary = Double.parseDouble(data[2]);
                employees.add(new Employee(Id, Name, Salary));

            }
        } catch (Exception e) {
            System.out.println("Error Reading the File: " + e.getMessage());

        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Id,Name,Salary,TaxPayable\n");
            for (Employee emp : employees) {
                bw.write(emp.Id + "," + emp.Name + "," + emp.Salary + "," + emp.Tax + "\n");
            }
            System.out.println(" Tax Payable per Income Range" + outputFile);
        } catch (Exception e) {
            System.out.println("Error in the File ");
        }
    }
}
