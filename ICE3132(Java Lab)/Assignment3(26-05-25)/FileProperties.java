import java.io.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class FileProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for file name
        System.out.print("Enter the file name (e.g., sample.txt): ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        // Display file properties
        System.out.println("\n📄 File Properties:");
        System.out.println("Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Parent Directory: " + file.getParent());
        System.out.println("File Size: " + file.length() + " bytes");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Last Modified: " + sdf.format(file.lastModified()));

        // Ask how many bytes to read
        System.out.print("\nEnter number of bytes to read: ");
        int n = scanner.nextInt();

        // Read first n bytes
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[n];
            int bytesRead = fis.read(buffer, 0, n);

            System.out.println("\n📥 First " + bytesRead + " bytes of the file:");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print((char) buffer[i]);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}
