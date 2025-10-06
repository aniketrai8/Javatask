import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    double tax;
    double finalAmount;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void calculateTaxAndFinalAmount() {
        this.tax = calculateTax(this.salary);
        this.finalAmount = calculateFinalAmount(this.salary, this.tax);
    }

    private double calculateTax(double salary) {
        double tax;
        if (salary <= 40000) {
            tax = salary * 0.10;
        } else if (salary > 40000 && salary <= 50000) {
            tax = (40000 * 0.10) + ((salary - 40000) * 0.15);
        } else {
            tax = (40000 * 0.10) + (10000 * 0.15) + ((salary - 50000) * 0.20);
        }
        return tax;
    }

    private double calculateFinalAmount(double salary, double tax) {
        return (salary - tax);
    }
}

public class TaxCalculator {

    public static void main(String[] args) {
        String inputFile = "/Users/aniketrai/IdeaProjects/Javatask/TaxSlabCsv/Resource/Employee.csv";
        String outputFile = "TaxableIncome.csv";

        List<Employee> employees = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                double salary = Double.parseDouble(data[2].trim());

                Employee emp = new Employee(id, name, salary);
                emp.calculateTaxAndFinalAmount();
                employees.add(emp);
            }
        } catch (Exception e) {
            System.out.println("Error Reading the File: " + e.getMessage());
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Id,Name,Salary,TaxPayable,FinalAmount\n");
            for (Employee emp : employees) {
                bw.write(emp.id + "," + emp.name + "," + emp.salary + "," + emp.tax + "," + emp.finalAmount + "\n");
            }
            System.out.println("Tax Payable per Income Range written to: " + outputFile);
        } catch (Exception e) {
            System.out.println("Error Writing the File: " + e.getMessage());
        }
    }
}
