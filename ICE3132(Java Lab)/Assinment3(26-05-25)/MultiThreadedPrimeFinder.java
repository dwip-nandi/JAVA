import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrimeFinder implements Runnable {
    private int start, end;
    private List<Integer> primes;

    public PrimeFinder(int start, int end, List<Integer> primes) {
        this.start = start;
        this.end = end;
        this.primes = primes;
    }

    @Override
    public void run() {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                synchronized (primes) {
                    primes.add(num);
                }
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class MultiThreadedPrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = scanner.nextInt();

        int numThreads = 4;
        int range = (upper - lower + 1) / numThreads;
        List<Integer> primes = new ArrayList<>();
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = lower + i * range;
            int end = (i == numThreads - 1) ? upper : start + range - 1;
            threads[i] = new Thread(new PrimeFinder(start, end, primes));
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        primes.sort(Integer::compareTo);
        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        System.out.println(primes);
    }
}
