class MyRunnable implements Runnable {
    private String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
    }
}

public class MultipleThreadsDemo73 {
    public static void main(String[] args) {
        // Same code executed by multiple threads
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));
        Thread t3 = new Thread(new MyRunnable("Thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
