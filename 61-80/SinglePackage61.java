Hello.java

    // File: Pack1/Hello.java
package Pack1;  // Declare the package name

public class Hello {
    public void display() {
        System.out.println("\n**********************");
        System.out.println("\nWelcome to Package Pack1");
        System.out.println("\n**********************");
    }
}

print.java

import Pack1.Hello;  // Import the class from the package

class Print {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.display();  // Call the display method
    }
}
