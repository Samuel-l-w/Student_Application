package StudentApplication;

import java.util.ArrayList;

public class CMSC implements Major{

    // qualifyForMajor method
    public boolean qualifyForMajor (ArrayList<Course> list) {
        int cmscCount = 0;
        boolean hasMorethan300 = false;

        for (Course c : list) {

            // check Department in CMSC
            if (c.getCourseDepartment().equals("CMSC")) {
                cmscCount += 1;

                // convert course number to integer
                int number = Integer.parseInt(c.getCourseNumber());
                if (number == 300) {
                    hasMorethan300 = true;
                }
            }
        }
        return cmscCount >= 300 && hasMorethan300;
    }

    // toString method
    public String toString() {
        return "CMSC";
    }
}
