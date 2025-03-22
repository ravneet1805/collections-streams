package generics.resumescreening;

import java.util.List;

public class ResumeProcessor {

    // ✅ Wildcard to handle multiple job roles dynamically
    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        System.out.println("\n📝 Screening Resumes...\n");
        for (Resume<? extends JobRole> resume : resumes) {
            resume.processResume();
        }
    }
}
