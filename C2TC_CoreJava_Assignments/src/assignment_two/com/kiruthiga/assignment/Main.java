package assignment_two.com.kiruthiga.assignment;

public class Main {
    public static void main(String[] args) {
        // Create Student object → triggers default constructor
        Student s = new Student();

        // Create Commission object and use its methods
        Commission c = new Commission();
        c.acceptDetails();      // Accept employee details
        c.calculateCommission(); // Calculate and display commission
    }
}