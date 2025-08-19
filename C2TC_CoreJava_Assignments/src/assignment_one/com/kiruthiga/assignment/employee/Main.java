package assignment_one.com.kiruthiga.assignment.employee;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 85000, "HR");
        Developer developer = new Developer("Bob", 102, 75000, "Java");

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
    }
}