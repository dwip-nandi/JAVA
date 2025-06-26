class Printer {
    public void printMessage(String message) {
        synchronized (this) {
            for (char ch : message.toCharArray()) {
                System.out.print(ch);
                try {
                    Thread.sleep(100); // small delay between characters
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // move to next line after message
        }
    }
}

class MessageThread extends Thread {
    private Printer printer;
    private String message;

    public MessageThread(Printer printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    public void run() {
        printer.printMessage(message);
    }
}

public class SynchronizedPrinterDemo {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Thread t1 = new MessageThread(sharedPrinter, "Hello, Dwip!");
        Thread t2 = new MessageThread(sharedPrinter, "Java is fun.");
        Thread t3 = new MessageThread(sharedPrinter, "Multithreading rocks!");

        t1.start();
        t2.start();
        t3.start();
    }
}
