package generics.coursemanagement;


public abstract class CourseType {
    protected String courseName;
    protected String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public abstract void evaluateCourse();
}

