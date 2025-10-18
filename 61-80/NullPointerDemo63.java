public class NullPointerDemo63 {
    public static void main(String[] args) {
        String str = null; // This is a null reference

        try {
            // Attempting to call a method on a null object
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Caught a NullPointerException!");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
