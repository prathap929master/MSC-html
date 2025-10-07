import java.util.Scanner;

public class AddTimes {
    public static void main(String[] args) {
        // Create two Time objects
        Time time1 = new Time();
        Time time2 = new Time();

        // Read time values from the user
        System.out.println("--- Enter Time 1 ---");
        time1.readTime();
        System.out.println("\n--- Enter Time 2 ---");
        time2.readTime();

        // Add the two time objects
        Time sumTime = Time.add(time1, time2);

        // Display the results
        System.out.println("\n--- Displaying Time Objects ---");
        System.out.print("Time 1: ");
        time1.displayTime();
        System.out.print("Time 2: ");
        time2.displayTime();
        System.out.print("Sum of times: ");
        sumTime.displayTime();
    }
}

// The Time class, which is not public, can be in the same file.
class Time {
    int hours;
    int minutes;
    int seconds;

    // No-argument constructor to initialize time to 00:00:00
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Parameterized constructor to initialize with given values
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to read time from user input
    public void readTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time (hours, minutes, seconds):");
        System.out.print("Hours: ");
        this.hours = scanner.nextInt();
        System.out.print("Minutes: ");
        this.minutes = scanner.nextInt();
        System.out.print("Seconds: ");
        this.seconds = scanner.nextInt();
    }

    // Method to display the time in HH:MM:SS format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", this.hours, this.minutes, this.seconds);
    }

    // Static method to add two Time objects
    public static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.seconds = t1.seconds + t2.seconds;
        sum.minutes = t1.minutes + t2.minutes;
        sum.hours = t1.hours + t2.hours;

        // Handle overflows for seconds
        if (sum.seconds >= 60) {
            sum.minutes += sum.seconds / 60;
            sum.seconds %= 60;
        }

        // Handle overflows for minutes
        if (sum.minutes >= 60) {
            sum.hours += sum.minutes / 60;
            sum.minutes %= 60;
        }

        return sum;
    }
}
