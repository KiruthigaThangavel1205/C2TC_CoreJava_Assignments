package assignment_one.com.kiruthiga.assignment.employee;

public class Manager extends Employee {
    // Additional attribute for Manager
    private String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary); // Call Employee constructor
        this.department = department;
    }

    // Getter and Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Overriding display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}