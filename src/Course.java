public class Course {

    // instance variables
    private final String courseDepartment;
    private final String courseNumber;
    private final int creditHours;

    // constructor
    public Course(String courseDepartment, String courseNumber, int creditHours) {
        this.courseDepartment = courseDepartment;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }

    // for getting or the getters
    public String getCourseDepartment() {
        return courseDepartment;
    }
    public String getCourseNumber() {
        return courseNumber;
    }
    public int getCreditHours() {
        return creditHours;
    }

    // to-string method

    public String toString() {
        return courseDepartment + "\t" + courseNumber + "\t" + creditHours;
    }
}
