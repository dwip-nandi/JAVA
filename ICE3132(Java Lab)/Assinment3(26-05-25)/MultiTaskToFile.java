import java.io.*;

class PrintAlphabets implements Runnable {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("\n[Alphabets printed]");
    }
}

class PrintSymbols implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
        System.out.println("\n[Symbols printed]");
    }
}

class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n[Numbers printed]");
    }
}

public class MultiTaskToFile {
    public static void main(String[] args) {
        try {
            // Redirect output to a text file
            PrintStream fileOut = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(fileOut);

            Thread t1 = new Thread(new PrintAlphabets());
            Thread t2 = new Thread(new PrintSymbols());
            Thread t3 = new Thread(new PrintNumbers());

            t1.start();
            t2.start();
            t3.start();

            // Wait for all threads to finish
            t1.join();
            t2.join();
            t3.join();

            System.out.println("\nAll tasks completed and written to output.txt");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
