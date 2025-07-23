import java.io.*;

public class MergeFilesByteStream {
    public static void main(String[] args) {
        try {
            byte[] file1Bytes = readBytes("File1.txt");

            byte[] file2Bytes = readBytes("File2.txt");

            int half1 = (file1Bytes.length + 1) / 2; 
            int half2 = file2Bytes.length / 2;

            FileOutputStream fos = new FileOutputStream("File3.txt");

            fos.write(file1Bytes, 0, half1); 
            fos.write('\n'); 
            fos.write(file2Bytes, half2, file2Bytes.length - half2);

            fos.close();

            System.out.println("File3.txt created successfully and safely using byte streams.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static byte[] readBytes(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists() || file.length() == 0) {
            System.err.println("Warning: " + filename + " is empty or missing.");
            return new byte[0];
        }
        FileInputStream fis = new FileInputStream(file);
        byte[] content = fis.readAllBytes();
        fis.close();
        return content;
    }
}
