import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomAccessExample {
    public static void main(String[] args) {
        String fileName = "random_numbers.txt";
        int totalNumbers = 50;

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            Random rand = new Random();

            // Step 1: Write 50 random numbers between 100 and 150
            for (int i = 0; i < totalNumbers; i++) {
                int num = 100 + rand.nextInt(51); // 100 to 150
                raf.writeInt(num);
            }

            System.out.println(" 50 random numbers written to file.");

            // Step 2: Display a random number
            int randomIndex = rand.nextInt(totalNumbers);
            raf.seek(randomIndex * 4); // each int = 4 bytes
            int value = raf.readInt();
            System.out.println(" Random number at index " + randomIndex + ": " + value);

            // Step 3: Modify a random number
            int newIndex = rand.nextInt(totalNumbers);
            int newValue = 100 + rand.nextInt(51);
            raf.seek(newIndex * 4);
            raf.writeInt(newValue);
            System.out.println("  Modified number at index " + newIndex + " to: " + newValue);

            raf.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
