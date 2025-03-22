package generics.coursemanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<CourseType> allCourses = new ArrayList<>();

    public void addCourse(CourseType course) {
        allCourses.add(course);
    }

    public void displayAllCourses() {
        Course.displayAllCourses(allCourses);
    }
}
