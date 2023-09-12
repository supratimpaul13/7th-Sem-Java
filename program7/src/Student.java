// Instance variables
class Std_details {
    int id;
    String name;
    int age;

    // Default constructor
    public Std_details() {
        // Initialize default values
        id = 0;
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Std_details(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        // Creating two student objects using parameterized constructor
        Std_details student1 = new Std_details(1, "Alice", 20);
        Std_details student2 = new Std_details(2, "Bob", 22);

        // Displaying details of the first student
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println(); // Adding a blank line for separation

        // Displaying details of the second student
        System.out.println("Details of Student 2:");
        student2.displayDetails();
    }
}
