package StudentApplication;

public class SchoolTester {

    // Tester
    public static void main(String[] args) {

        // Creating Courses
        Course cs101 = new Course("CS", "101", 3);
        Course math201 = new Course("MATH", "201", 4);
        Course hist150 = new Course("HIST", "150", 3);
        Course phys100 = new Course("PHYS", "100", 4);
        Course bio101 = new Course("BIO", "101", 3);

        // Creating Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Creating WorkStudy Student
        Workstudy_Student charlie = new Workstudy_Student("Charlie", 10);

        // Adding Courses
        alice.addCourse(cs101);
        alice.addCourse(math201);
        alice.addCourse(hist150);
        alice.addCourse(cs101); // duplicate
        alice.addCourse(phys100);
        alice.addCourse(bio101); // should fail (over 4)

        // Dropping Courses
        alice.dropCourse(cs101);
        alice.dropCourse(bio101); // not enrolled
        alice.addCourse(cs101);   // add back

        // Bob
        bob.addCourse(cs101);
        bob.addCourse(phys100);

        // Charlie
        charlie.addCourse(cs101);
        charlie.addCourse(math201);
        charlie.addCourse(hist150);
        charlie.addHoursWorked(5);

        // Printing Everything
        System.out.println("\n--- STUDENTS ---");
        System.out.println(alice);
        System.out.println(bob);
        System.out.println(charlie);
    }
}

