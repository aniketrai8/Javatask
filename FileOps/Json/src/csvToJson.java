
import java.io.*;
import java.util.*;

public class csvToJson {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Step 1: Read CSV
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/aniketrai/IdeaProjects/FileOps/Json/employee.csv"))) {
            String line;
            br.readLine(); // skip header row: id,name,department,salary

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                String dept = values[2];
                String designation = values[3];
                int salary = Integer.parseInt(values[4]);


                employees.add(new Employee(id, name, dept, salary,designation));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Convert to JSON manually
        StringBuilder json = new StringBuilder();
        json.append("[\n");

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            json.append("  {")
                    .append("\"id\": ").append(emp.id).append(", ")
                    .append("\"name\": \"").append(emp.name).append("\", ")
                    .append("\"department\": \"").append(emp.department).append("\", ")
                    .append("\"salary\": ").append(emp.salary)
                    .append("}");
            if (i < employees.size() - 1) {
                json.append(",");
            }
            json.append("\n");
        }

        json.append("]");

        System.out.println("JSON file before writing inside file "+json);
        // Step 3: Write JSON to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employee.json"))) {
            writer.write(json.toString());
            System.out.println("Conversion successful! Check employees.json file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Looking for CSV in: " +System.getProperty("user.dir"));
    }
}
