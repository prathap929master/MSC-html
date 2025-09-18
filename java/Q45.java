import java.util.*;
class Student {
    String name, city;
    int age;
    void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");  name = sc.nextLine();
        System.out.print("City: ");  city = sc.nextLine();
        System.out.print("Age: ");   age  = sc.nextInt();
    }
    void printdata() {
        System.out.println("Name: " + name + ", City: " + city + ", Age: " + age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.readdata();
        s.printdata();
    }
}
