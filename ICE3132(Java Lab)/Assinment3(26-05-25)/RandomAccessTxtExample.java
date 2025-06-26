import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomAccessTxtExample {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int totalNumbers = 50;

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            Random rand = new Random();

            // Write 50 random numbers to the file
            for (int i = 0; i < totalNumbers; i++) {
                int num = 100 + rand.nextInt(51); // 100–150
                raf.writeBytes(num + "\n"); // Write as text with newline
            }

            // Read all numbers
            raf.seek(0); // Go back to the beginning
            System.out.println("All numbers in the file:");
            String line;
            int index = 0;
            while ((line = raf.readLine()) != null) {
                System.out.println("[" + index + "] " + line);
                index++;
            }

            // Modify a specific number
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter index (0–49) to modify: ");
            int modifyIndex = scanner.nextInt();
            System.out.print("Enter new value (100–150): ");
            int newValue = scanner.nextInt();

            // Reopen file to overwrite specific line
            RandomAccessFile raf2 = new RandomAccessFile(fileName, "rw");
            long[] positions = new long[totalNumbers];
            raf2.seek(0);
            for (int i = 0; i < totalNumbers; i++) {
                positions[i] = raf2.getFilePointer();
                raf2.readLine();
            }

            raf2.seek(positions[modifyIndex]);
            String padded = String.format("%-4s", newValue); // pad to overwrite cleanly
            raf2.writeBytes(padded + "\n");
            raf2.close();

            System.out.println("Value at index " + modifyIndex + " updated to " + newValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
