class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Priority: " + getPriority() + " - Count: " + i);
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Without setting priority (default is 5)
        System.out.println("=== Without Setting Priority ===");
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join(); t2.join(); t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // With setting priority
        System.out.println("\n=== With Priority Set ===");
        MyThread t4 = new MyThread("Low-Priority");
        MyThread t5 = new MyThread("Normal-Priority");
        MyThread t6 = new MyThread("High-Priority");

        t4.setPriority(Thread.MIN_PRIORITY);   // 1
        t5.setPriority(Thread.NORM_PRIORITY);  // 5
        t6.setPriority(Thread.MAX_PRIORITY);   // 10

        t4.start();
        t5.start();
        t6.start();
    }
}
