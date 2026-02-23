package StudentApplication;

import java.util.ArrayList;

public class Student {

    // instance variables
    private String name;
    private final int idNumber;

    // attributes variable
    private ArrayList<Course> courses;

    // static variable
    private static int nextID = 1;

    // constructor
    public Student(String name, final int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        courses = new ArrayList<>();
    }

    // second constructor using nextID
    public Student(String name) {
        this.name = name;
        this.idNumber = nextID;
        nextID += 1; // increase by 1 for next student
        courses = new ArrayList<>();
    }

    // addCourse method
    public boolean addCourse(Course course) {
        // checks if the course is already there
        if (courses.contains(course)) {
            return false;
        }
        // checks if there's 4 or more courses already in
        if (courses.size() >= 4) {
            return false;
        }
        // adds the course
        courses.add(course);
        return true;
    }

    // dropCourse method
    public boolean dropCourse(Course course) {
        // checks if the course is not already in
        if (!courses.contains(course)) {
            return false;
        }
        // removes the course
        courses.remove(course);
        return true;
    }

    // student name changer method
    public void setName(String newName) {
        this.name = newName;
    }

    // studentID comparison method
    public boolean precedesById(Student other) {
        return this.idNumber < other.idNumber;
    }

    // for getting or getters
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }

    // to-string method
    public String toString() {
        String out = "Name: " + name + " | IdNumber: " + idNumber + " | Courses: " + courses;
        if (courses.size() == 0) {
            out += ". Student has no courses!";
        }
        else if  (courses.size() < 3) {
            out += ". Load is not full-time!";
        }
        return out;
    }

    // main method for testing
//    public static void main(String[] args) {
//        Student bob1 = new Student("Bob Smith", 971);
//        Student bob2 = new Student("Bob Jones", 4321);
//
//        // Creating some courses
//        Course cs101 = new Course("CS", "101", 3);
//        Course math201 = new Course("MATH", "201", 4);
//        Course hist150 = new Course("HIST", "150", 3);
//        Course phys100 = new Course("PHYS", "100", 4);
//        Course bio101 = new Course("BIO", "101", 3);
//
//        // Creating student
//        Student alice = new Student("Alice", 98);
//
//        // Test adding courses
//        System.out.println("Adding CS101 to Alice: " + alice.addCourse(cs101)); // true
//        System.out.println("Adding MATH201 to Alice: " + alice.addCourse(math201)); // true
//        System.out.println("Adding CS101 again to Alice: " + alice.addCourse(cs101)); // false (duplicate)
//
//        // Test dropping a course
//        System.out.println("Dropping HIST150 from Alice: " + alice.dropCourse(hist150)); // false (not enrolled)
//        System.out.println("Dropping CS101 from Alice: " + alice.dropCourse(cs101)); // true
//
//        // Test adding back a dropped course
//        System.out.println("Adding CS101 back to Alice: " + alice.addCourse(cs101)); // true
//
//        // Test max 4 courses
//        System.out.println("Adding HIST150: " + alice.addCourse(hist150)); // true
//        System.out.println("Adding PHYS100: " + alice.addCourse(phys100)); // true
//        System.out.println("Adding BIO101: " + alice.addCourse(bio101)); // false (already 4 courses)
//        System.out.println(alice.toString());
//
//        System.out.println(bob1.precedesById(bob2));
//        System.out.println(bob2.precedesById(bob1));
//    }
}
