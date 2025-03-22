package generics.coursemanagement;


public class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String courseName, String department, int numberOfAssignments) {
        super(courseName, department);
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public void evaluateCourse() {
        System.out.println(courseName + " (Assignment-Based) | Department: " + department + " | Number of Assignments: " + numberOfAssignments);
    }
}
