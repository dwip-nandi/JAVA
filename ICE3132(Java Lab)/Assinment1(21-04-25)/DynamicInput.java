import java.util.Scanner;

public class DynamicInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.print("Enter your marks: ");
        float marks = scanner.nextFloat(); 

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        // Close the scanner
        scanner.close();
    }
}
