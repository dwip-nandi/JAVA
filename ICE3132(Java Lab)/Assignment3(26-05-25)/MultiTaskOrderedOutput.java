import java.io.*;

class PrintAlphabets implements Runnable {
    private StringBuilder output;

    public PrintAlphabets(StringBuilder output) {
        this.output = output;
    }

    public void run() {
        synchronized (output) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                output.append(ch).append(" ");
            }
            for (char ch = 'a'; ch <= 'z'; ch++) {
                output.append(ch).append(" ");
            }
            output.append("\n[Alphabets printed]\n");
        }
    }
}

class PrintSymbols implements Runnable {
    private StringBuilder output;

    public PrintSymbols(StringBuilder output) {
        this.output = output;
    }

    public void run() {
        synchronized (output) {
            for (int i = 0; i < 100; i++) {
                output.append("@");
            }
            output.append("\n[Symbols printed]\n");
        }
    }
}

class PrintNumbers implements Runnable {
    private StringBuilder output;

    public PrintNumbers(StringBuilder output) {
        this.output = output;
    }

    public void run() {
        synchronized (output) {
            for (int i = 1; i <= 100; i++) {
                output.append(i).append(" ");
            }
            output.append("\n[Numbers printed]\n");
        }
    }
}

public class MultiTaskOrderedOutput {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        Thread t1 = new Thread(new PrintAlphabets(output));
        Thread t2 = new Thread(new PrintSymbols(output));
        Thread t3 = new Thread(new PrintNumbers(output));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

            PrintWriter writer = new PrintWriter("output.txt");
            writer.write(output.toString());
            writer.println("\nAll tasks completed and written to output.txt");
            writer.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
