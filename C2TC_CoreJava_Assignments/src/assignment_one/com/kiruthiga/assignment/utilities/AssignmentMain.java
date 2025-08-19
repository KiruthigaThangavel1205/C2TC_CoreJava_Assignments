package assignment_one.com.kiruthiga.assignment.utilities;

import assignment_one.com.kiruthiga.assignment.employee.*;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer
        Manager manager = new Manager("Alice", 101, 85000, "HR");
        Developer developer = new Developer("Bob", 102, 75000, "Java");

        // Using EmployeeUtilities methods
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increase salary (protected method, but allowed because we are in same project)
        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 4000);

        // Perform confidential operation (via public wrapper)
        EmployeeUtilities.performConfidentialCheck(manager);
        EmployeeUtilities.performConfidentialCheck(developer);
    }
}