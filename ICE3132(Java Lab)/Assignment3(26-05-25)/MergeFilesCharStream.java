import java.io.*;

public class MergeFilesCharStream {
    public static void main(String[] args) {
        try {
            // Read File1.txt
            StringBuilder file1Content = readFile("File1.txt");

            // Read File2.txt
            StringBuilder file2Content = readFile("File2.txt");

            // Calculate halves
            int half1 = (file1Content.length() + 1) / 2; // round up
            int half2 = file2Content.length() / 2;

            // Write to File3.txt
            FileWriter fw = new FileWriter("File3.txt");

            // Write first half of File1
            fw.write(file1Content.substring(0, half1));

            // Write last half of File2
            fw.write(file2Content.substring(half2));

            fw.close();

            System.out.println("File3.txt created successfully using character streams.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static StringBuilder readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        int ch;
        while ((ch = reader.read()) != -1) {
            content.append((char) ch);
        }
        reader.close();
        return content;
    }
}
