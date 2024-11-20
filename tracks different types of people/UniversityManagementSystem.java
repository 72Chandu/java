/*
You are developing an application for a university and it tracks different types of people such as students 
professors , staff etc . Each person shares a common attribute (like id , name ) but has unique characteristics
(like students characteristics) then describes how you would use inheritance to model this
*/
// Base class representing a generic person
abstract class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Common method to display basic details
    public void displayBasicDetails() {
        System.out.println("ID: " + id + "\nName: " + name);
    }

    // Abstract method to display specific details
    public abstract void displaySpecificDetails();
}

// Student class inheriting from Person
class Student extends Person {
    private String major;
    private double gpa;

    public Student(String id, String name, String major, double gpa) {
        super(id, name);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void displaySpecificDetails() {
        System.out.println("Major: " + major + "\nGPA: " + gpa);
    }
}

// Professor class inheriting from Person
class Professor extends Person {
    private String department;
    private String researchArea;

    public Professor(String id, String name, String department, String researchArea) {
        super(id, name);
        this.department = department;
        this.researchArea = researchArea;
    }

    @Override
    public void displaySpecificDetails() {
        System.out.println("Department: " + department + "\nResearch Area: " + researchArea);
    }
}

// Staff class inheriting from Person
class Staff extends Person {
    private String jobTitle;
    private String department;

    public Staff(String id, String name, String jobTitle, String department) {
        super(id, name);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    @Override
    public void displaySpecificDetails() {
        System.out.println("Job Title: " + jobTitle + "\nDepartment: " + department);
    }
}

// Main class to demonstrate inheritance
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create instances of different types of people
        Person student = new Student("S101", "Alice", "Computer Science", 3.9);
        Person professor = new Professor("P202", "Dr. Smith", "Mathematics", "Algebraic Geometry");
        Person staff = new Staff("ST303", "John", "Administrator", "Admissions");

        // Array of people
        Person[] people = { student, professor, staff };

        // Display details of each person
        System.out.println("University Directory:");
        for (Person person : people) {
            System.out.println("-----------------");
            person.displayBasicDetails();
            person.displaySpecificDetails();
            System.out.println();
        }
    }
}


/*
University Directory:
-----------------
ID: S101
Name: Alice
Major: Computer Science
GPA: 3.9

-----------------
ID: P202
Name: Dr. Smith
Department: Mathematics
Research Area: Algebraic Geometry

-----------------
ID: ST303
Name: John
Job Title: Administrator
Department: Admissions

*/