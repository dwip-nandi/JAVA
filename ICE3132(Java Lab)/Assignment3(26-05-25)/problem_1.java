// .Write a program to display the file size of a text file then read first n bytes of 
// the file usingFileInputStream class of byte streaming.Repeat the problem with 
// FileReader class of character streaming.
import java.io.*;
import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path (e.g., C:\\\\test.txt): ");
        String fh = sc.nextLine();

        File file = new File(fh);

        if (!file.exists()) {
            System.out.println("❌ File not found.");
            return;
        }

        // Display file size
        long size = file.length();
        System.out.println("✅ File size: " + size + " bytes");

        // Ask for n bytes/chars to read
        System.out.print("Enter number of bytes/characters to read (n): ");
        int n = sc.nextInt();

        // 1️⃣ Using FileInputStream (Byte Stream)
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[n];
            int bytesRead = fis.read(buffer);
            System.out.println("\n📦 First " + bytesRead + " bytes (FileInputStream):");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print((char) buffer[i]);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file using FileInputStream: " + e.getMessage());
        }

        // 2️⃣ Using FileReader (Character Stream)
        try (FileReader fr = new FileReader(file)) {
            char[] buffer = new char[n];
            int charsRead = fr.read(buffer);
            System.out.println("\n🔤 First " + charsRead + " characters (FileReader):");
            for (int i = 0; i < charsRead; i++) {
                System.out.print(buffer[i]);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file using FileReader: " + e.getMessage());
        }
    }
}
