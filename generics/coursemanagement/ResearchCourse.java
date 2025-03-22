package generics.coursemanagement;



public class ResearchCourse extends CourseType {
    private boolean requiresThesis;

    public ResearchCourse(String courseName, String department, boolean requiresThesis) {
        super(courseName, department);
        this.requiresThesis = requiresThesis;
    }

    @Override
    public void evaluateCourse() {
        System.out.println(courseName + " (Research-Based) | Department: " + department + 
                           " | Requires Thesis: " + (requiresThesis ? "Yes" : "No"));
    }
}
