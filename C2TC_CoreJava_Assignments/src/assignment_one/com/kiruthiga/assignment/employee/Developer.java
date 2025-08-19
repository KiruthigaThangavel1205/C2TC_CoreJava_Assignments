package assignment_one.com.kiruthiga.assignment.employee;

public class Developer extends Employee {
    // Additional attribute for Developer
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary); // Call Employee constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}