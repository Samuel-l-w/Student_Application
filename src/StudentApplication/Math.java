package StudentApplication;

import java.util.ArrayList;

public class Math implements Major{

    // qualifyForMajor method
    public boolean qualifyForMajor(ArrayList<Course> list) {
        int count = 0;

        for (Course c : list) {

            // check department is MATH
            if (c.getCourseDepartment().equals("MATH")) {

                // convert course number to integer
                int number = Integer.parseInt(c.getCourseNumber());

                if (number > 200) {
                    count += 1;
                }
            }
        }
        return count >= 3;
    }

    // toString
    @Override
    public String toString () {
        return "Math";
    }
}
