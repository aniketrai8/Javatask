import java.io.*;
import java.util.Scanner;


public class CheckUncheck {
    //unchecked
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       try{
           System.out.println("Enter the name of the employee: ");
           String name = input.nextLine();

           if(name==null || name.trim().isEmpty()){
               throw new IllegalArgumentException("Name of the employee, should not be null");
           }

           System.out.println("Enter your age: ");
           String ageInput = input.nextLine();

           int age= Integer.parseInt(ageInput);

           if(age <21){
               throw new IllegalArgumentException("Employee Should be of a min. age 21");
           }

           System.out.println("New Employee :"+name+" | Age of the Employee is: "+age);

           System.out.println("Data of employee to be uploaded");
           String Employee = input.nextLine();

           readEmployee(Employee);

       }catch(IllegalArgumentException e){
           System.out.println("Invalid input: "+e.getMessage());

       } catch (IOException e) {
           System.out.println("Error reading file: " + e.getMessage());
       } finally {
           input.close();
           System.out.println("Program Ended");
       }
    }

    public static void readEmployee(String Employee) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(Employee));
        System.out.println("Employee Profile created: ");
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
}
