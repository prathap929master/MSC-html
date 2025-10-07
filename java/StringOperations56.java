public class StringOperations56 {
    public static void main(String[] args) {
        // Creating two strings
        String str1 = "HelloWorld";
        String str2 = "HelloJava";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // a. Display the length
        System.out.println("\n[a] Length of String 1: " + str1.length());
        System.out.println("    Length of String 2: " + str2.length());

        // b. Concatenate two strings
        String concatenated = str1.concat(str2);
        System.out.println("\n[b] Concatenated String: " + concatenated);

        // c. Check equality, startsWith, endsWith
        System.out.println("\n[c] Strings Equal? " + str1.equals(str2));
        System.out.println("    String 2 starts with 'Hello'? " + str2.startsWith("Hello"));
        System.out.println("    String 2 ends with 'Java'? " + str2.endsWith("Java"));

        // d. Character at 5th position using charAt(), getChars(), toCharArray()
        System.out.println("\n[d] Character at 5th position (index 4) using charAt(): " + str1.charAt(4));

        // Using getChars()
        char[] chars = new char[1];
        str1.getChars(4, 5, chars, 0); // get character from index 4 to 5 (excluding 5)
        System.out.println("    Using getChars(): " + chars[0]);

        // Using toCharArray()
        char[] charArray = str1.toCharArray();
        System.out.println("    Using toCharArray(): " + charArray[4]);

        // e. Searching using indexOf() and lastIndexOf()
        System.out.println("\n[e] Index of 'o' in String 1: " + str1.indexOf('o'));
        System.out.println("    Last index of 'o' in String 1: " + str1.lastIndexOf('o'));

        // f. Replace all occurrences of a character
        String replaced = str1.replace('o', 'x');
        System.out.println("\n[f] String after replacing 'o' with 'x': " + replaced);

        // g. Total allocated capacity of StringBuffer (not applicable for String)
        // Use StringBuffer to demonstrate capacity
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("\n[g] Capacity of StringBuffer (based on str1): " + sb.capacity());
    }
}
