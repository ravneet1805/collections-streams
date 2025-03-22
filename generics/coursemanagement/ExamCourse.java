package generics.coursemanagement;


public class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String courseName, String department, int examWeightage) {
        super(courseName, department);
        this.examWeightage = examWeightage;
    }

    @Override
    public void evaluateCourse() {
        System.out.println(courseName + " (Exam-Based) | Department: " + department + 
                           " | Exam Weightage: " + examWeightage + "%");
    }
}
