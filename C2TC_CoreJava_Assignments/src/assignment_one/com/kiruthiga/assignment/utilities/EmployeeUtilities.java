package assignment_one.com.kiruthiga.assignment.utilities;
import assignment_one.com.kiruthiga.assignment.employee.*;
import assignment_one.com.kiruthiga.assignment.utilities.*;


public class EmployeeUtilities {

    // Public method: accessible from anywhere
    public static void printEmployeeDetails(Employee e) {
        System.out.println("----- Employee Details -----");
        e.displayDetails();  // Calls overridden displayDetails()
        System.out.println("----------------------------\n");
    }

    // Protected method: accessible in same package and subclasses
    protected static void increaseSalary(Employee e, double amount) {
        double newSalary = e.getSalary() + amount;
        e.setSalary(newSalary);
        System.out.println("Salary increased! New salary of " + e.getName() + ": " + e.getSalary());
    }

    // Private method: only accessible inside EmployeeUtilities
    private static void confidentialOperation(Employee e) {
        System.out.println("Confidential operation executed for employee ID: " + e.getEmployeeId());
    }

    // Public method that internally uses private method
    public static void performConfidentialCheck(Employee e) {
        confidentialOperation(e); // Accessing private method within same class
    }
}  // Import Employee, Manager, Developer

