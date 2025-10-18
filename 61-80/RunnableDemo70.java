class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread running: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class RunnableDemo70 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start(); // Start the thread
    }
}
