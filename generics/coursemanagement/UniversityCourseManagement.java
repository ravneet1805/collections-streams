package generics.coursemanagement;


public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Create course categories
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Create courses
        ExamCourse math101 = new ExamCourse("Math 101", "Mathematics", 70);
        ExamCourse physics102 = new ExamCourse("Physics 102", "Physics", 80);
        AssignmentCourse cs101 = new AssignmentCourse("CS 101", "Computer Science", 5);
        ResearchCourse aiResearch = new ResearchCourse("AI Research", "AI & ML", true);

        // Add courses to respective categories
        examCourses.addCourse(math101);
        examCourses.addCourse(physics102);
        assignmentCourses.addCourse(cs101);
        researchCourses.addCourse(aiResearch);

        // Display courses
        System.out.println("Exam-Based Courses:");
        examCourses.displayCourses();

        System.out.println("\nAssignment-Based Courses:");
        assignmentCourses.displayCourses();

        System.out.println("\nResearch-Based Courses:");
        researchCourses.displayCourses();

        // Manage all courses together
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(math101);
        courseManager.addCourse(physics102);
        courseManager.addCourse(cs101);
        courseManager.addCourse(aiResearch);

        System.out.println("\nAll Courses:");
        courseManager.displayAllCourses();
    }
}

