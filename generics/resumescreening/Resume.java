package generics.resumescreening;



public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + jobRole.getCandidateName());
        jobRole.evaluate();
    }
}
