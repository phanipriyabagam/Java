package oops;
public class Student {
    String name;
    int rollNo;

    // No-arg constructor
    Student() {
        this("Unknown", 0);  // Calls parameterized constructor
        System.out.println("No-arg constructor called");
    }

    // Parameterized constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();          // Calls no-arg → which calls parameterized
        s1.display();

        System.out.println();

        Student s2 = new Student("Priya", 111);  // Direct call to parameterized
        s2.display();
    }
}
