package StudentApplication;

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

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course otherCourse = (Course) obj;
            return courseDepartment.equals(otherCourse.courseDepartment) &&
                    courseNumber.equals(otherCourse.courseNumber)  &&
                    creditHours == otherCourse.creditHours;
        } else return false;
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
        return courseDepartment + " " + courseNumber + " (" + creditHours + ")";
    }

    // main method for testing
    public static void main(String[] args) {
        Course phi100 = new Course("PHI", "100", 3);
        Course hist100 = new Course("HIST", "100", 4);
        System.out.println(phi100.equals(hist100));
    }
}
