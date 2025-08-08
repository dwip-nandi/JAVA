import java.util.ArrayList;
import java.util.Scanner;

public class DynamicAccessModifier {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Step 1: Populate the list with numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // Step 2: Ask user for positions and new values
        System.out.println("Enter positions to modify (e.g., 7 34 55):");
        int pos1 = scanner.nextInt();
        int pos2 = scanner.nextInt();
        int pos3 = scanner.nextInt();

        System.out.println("Enter new values for these positions:");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        // Step 3: Modify values dynamically
        numbers.set(pos1 - 1, val1); // ArrayList is 0-indexed
        numbers.set(pos2 - 1, val2);
        numbers.set(pos3 - 1, val3);

        // Step 4: Display updated list
        System.out.println("Updated List:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%4d", numbers.get(i));
            if ((i + 1) % 10 == 0) System.out.println();
        }

        scanner.close();
    }
}
