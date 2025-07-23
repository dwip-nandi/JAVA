import java.io.*;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name (with extension): ");
        String fileName = scanner.nextLine();

        System.out.print("Enter number of bytes/characters to read: ");
        int n = scanner.nextInt();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File not found.");
            return;
        }

        System.out.println("\nReading using FileInputStream (byte stream):");
        try (FileInputStream fis = new FileInputStream(file)) {
            for (int i = 0; i < n; i++) {
                int byteData = fis.read();
                if (byteData == -1) break;
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nReading using FileReader (character stream):");
        try (FileReader fr = new FileReader(file)) {
            for (int i = 0; i < n; i++) {
                int charData = fr.read();
                if (charData == -1) break;
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
