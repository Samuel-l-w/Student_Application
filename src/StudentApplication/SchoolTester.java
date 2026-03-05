package StudentApplication;

public class SchoolTester {

    // Tester
    public static void main(String[] args) {

//        // Creating Courses
//        Course cs101 = new Course("CS", "101", 3);
//        Course math201 = new Course("MATH", "201", 4);
//        Course hist150 = new Course("HIST", "150", 3);
//        Course phys100 = new Course("PHYS", "100", 4);
//        Course bio101 = new Course("BIO", "101", 3);
//
//        // Creating Students
//        Student alice = new Student("Alice");
//        Student bob = new Student("Bob");
//
//        // Creating WorkStudy Student
//        Workstudy_Student charlie = new Workstudy_Student("Charlie", 10);
//
//        // Adding Courses
//        alice.addCourse(cs101);
//        alice.addCourse(math201);
//        alice.addCourse(hist150);
//        alice.addCourse(cs101); // duplicate
//        alice.addCourse(phys100);
//        alice.addCourse(bio101); // should fail (over 4)
//
//        // Dropping Courses
//        alice.dropCourse(cs101);
//        alice.dropCourse(bio101); // not enrolled
//        alice.addCourse(cs101);   // add back
//
//        // Bob
//        bob.addCourse(cs101);
//        bob.addCourse(phys100);
//
//        // Charlie
//        charlie.addCourse(cs101);
//        charlie.addCourse(math201);
//        charlie.addCourse(hist150);
//        charlie.addHoursWorked(5);
//
//        // Printing Everything
//        System.out.println("\n--- STUDENTS ---");
//        System.out.println(alice);
//        System.out.println(bob);
//        System.out.println(charlie);
//    }
        // Courses
        Course m150 = new Course("MATH", "150", 3);
        Course m250 = new Course("MATH", "250", 3);
        Course m310 = new Course("MATH", "310", 3);
        Course m420 = new Course("MATH", "420", 3);

        Course c101 = new Course("CMSC", "101", 3);
        Course c201 = new Course("CMSC", "201", 3);
        Course c350 = new Course("CMSC", "350", 3);
        Course c420 = new Course("CMSC", "420", 3);

        Major math = new Math();
        Major cmsc = new CMSC();

        // A. Few Courses (Should NOT qualify)

        Student s1 = new Student("Alice", 1, math);
        s1.addCourse(m150);
        s1.addCourse(m250);

        // B. Qualifies for Math

        Student s2 = new Student("Bob", 2, math);
        s2.addCourse(m250);
        s2.addCourse(m310);
        s2.addCourse(m420);

        // C. Mixed Complicated Combo (Does NOT qualify CMSC)

        Student s3 = new Student("Charlie", 3, cmsc);
        s3.addCourse(c101);
        s3.addCourse(c201);
        s3.addCourse(m310);
        s3.addCourse(m420);

        // D. Qualifies for CMSC (3 CMSC, 1 above 300)

        Student s4 = new Student("David", 4, cmsc);
        s4.addCourse(c101);
        s4.addCourse(c201);
        s4.addCourse(c350);

        // E. Many Courses (More than 4)

        Student s5 = new Student("Emma", 5, math);
        s5.addCourse(m150);
        s5.addCourse(m250);
        s5.addCourse(m310);
        s5.addCourse(m420);
        s5.addCourse(c350);
        s5.addCourse(c420);

        // Print results
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}

