package generics.coursemanagement;


import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public void displayCourses() {
        for (T course : courseList) {
            course.evaluateCourse();
        }
    }

    // Wildcard method to display any type of course
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.evaluateCourse();
        }
    }
}
