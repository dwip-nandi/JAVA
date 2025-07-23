class student {
    String name;
    int rollNumber;
    float marks;

    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "Alice";
        student1.rollNumber = 123;
        student1.marks = 95.5f;

        student1.displayInfo(); // Display student details
    }
}
