//76

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    // Parameterized constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Overloaded constructor (grade defaults to "Not Assigned")
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = "Not Assigned";
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------");
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A+");   // Using parameterized constructor
        Student s2 = new Student("Bob", 102);           // Using overloaded constructor

        s1.display();
        s2.display();
    }
}
