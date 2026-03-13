package StudentApplication;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {

        ArrayList<Course> list = new ArrayList<>();

        list.add(new Course("MATH", "310", 3));
        list.add(new Course("CMSC", "101", 3));
        list.add(new Course("MATH", "250", 3));
        list.add(new Course("CMSC", "350", 3));

        Collections.sort(list); // looked it up

        System.out.println(list);
    }
}
