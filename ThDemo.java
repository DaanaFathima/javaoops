class Multiple implements Runnable {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                int c = 5 * i;
                System.out.println("5 x " + i + " = " + c);
            }
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Factor implements Runnable {
    public void run() {
        int n = 36;
        System.out.println("Factors of " + n + ":");
        try {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThDemo {
    public static void main(String[] args) { 
        Multiple m1 = new Multiple();
        Factor f1 = new Factor();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(f1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Both threads are finished");
    }
}
