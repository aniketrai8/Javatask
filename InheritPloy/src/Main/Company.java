
package Main;

import Model.Developer;
import Model.Employee;
import Model.Intern;
import Model.Manager;

public class Company {
    public static void main(String[] args) {
        Employee M = new Manager("Abhiav", 27, 21176543, 100000, 5000, 5000, 2000);
        Employee D = new Developer("Abhshek", 23, 21191786, 65000, 7000, 3500);
        Employee I = new Intern("Sahil", 11, 21245687, 21000, 1500);

        M.displayInfo();
        System.out.println();

        D.displayInfo();
        System.out.println();

        I.displayInfo();
        System.out.println();
    }
}
