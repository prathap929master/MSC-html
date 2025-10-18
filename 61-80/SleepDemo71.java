public class SleepDemo71 {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread ends");
    }
}
