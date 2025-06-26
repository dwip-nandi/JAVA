class Rectangle {
    double length;
    double width;

    // Default Constructor
    Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // Parameterized Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); // Default values
        rect1.displayDetails();

        Rectangle rect2 = new Rectangle(5.0, 3.0); // Parameterized values
        rect2.displayDetails();
    }
}
