import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessModifier {
    public static void main(String[] args) {
        String filename = "numbers.dat";

        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            // Step 1: Write numbers 1 to 100 using random access
            for (int i = 1; i <= 100; i++) {
                raf.writeInt(i); // Each int takes 4 bytes
            }

            // Step 2: Modify specific positions using random access
            raf.seek((7 - 1) * 4);   // Move to 7th number
            raf.writeInt(755);

            raf.seek((34 - 1) * 4);  // Move to 34th number
            raf.writeInt(345);

            raf.seek((55 - 1) * 4);  // Move to 55th number
            raf.writeInt(555);

            // Step 3: Read and display all values using random access
            raf.seek(0); // Reset pointer to start
            System.out.println("Contents of the file:");
            for (int i = 1; i <= 100; i++) {
                int value = raf.readInt();
                System.out.printf("%4d", value);
                if (i % 10 == 0) System.out.println(); // Format output
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
