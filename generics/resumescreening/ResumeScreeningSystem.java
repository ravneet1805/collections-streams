package generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating resumes for different job roles
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie"));

        // Storing resumes in a list
        List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
        resumeList.add(seResume);
        resumeList.add(dsResume);
        resumeList.add(pmResume);

        // ✅ Process resumes using wildcards
        ResumeProcessor.screenResumes(resumeList);
    }
}
