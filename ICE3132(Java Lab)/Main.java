class Student {
    String name;
    int rollNumber;
    float marks;

    // Method to display student information
    void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Set values for the fields
        student.name = "John Doe";
        student.rollNumber = 101;
        student.marks = 85.5f;

        // Display student information
        student.displayInfo();
    }
}
