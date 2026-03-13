package StudentApplication;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    // instance variables
    private String name;
    private final int idNumber;
    private Major studentMajor;
    private boolean isSorted;

    // attributes variable
    private ArrayList<Course> courses;

    // static variable
    private static int nextID = 1;

    // constructor
    public Student(String name, final int idNumber, Major studentMajor) {
        this.name = name;
        this.idNumber = idNumber;
        this.studentMajor = studentMajor;
        courses = new ArrayList<>();
        isSorted = true;
    }

    // second constructor using nextID
    public Student(String name) {
        this.name = name;
        this.idNumber = nextID;
        nextID += 1; // increase by 1 for next student
        courses = new ArrayList<>();
        isSorted = true;
    }

    // addCourse method
    public boolean addCourse(Course course) {
        // checks if the course is already there
        if (courses.contains(course)) {
            return false;
        }

        // adds the course
        courses.add(course);
        isSorted = false;
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
        isSorted = false;
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
        // sort only if the list is unsorted
        if (!isSorted) {
            Collections.sort(courses); // uses Course's compareTo()
            isSorted = true;
        }

        String out = "Name: " + name + " | IdNumber: " + idNumber + " | Courses: " + courses;

        if (courses.size() == 0) {
            out += ". Student has no courses!";
        }
        else if  (courses.size() < 3) {
            out += ". Load is not full-time!";
        }

        // shows if they qualify or not
        if (studentMajor != null) {
            boolean qualifies = studentMajor.qualifyForMajor(courses);
            out += " | Major: " + studentMajor +
                    " | Qualifies: " + qualifies;
        }
        return out;
    }
}
