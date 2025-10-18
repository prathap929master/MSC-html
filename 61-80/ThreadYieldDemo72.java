class MyThreadYield extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            Thread.yield(); // Suggests CPU to give other threads a chance
        }
    }
}

public class ThreadYieldDemo72 {
    public static void main(String[] args) {
        MyThreadYield t1 = new MyThreadYield();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            Thread.yield(); // Main thread yields control
        }
    }
}
