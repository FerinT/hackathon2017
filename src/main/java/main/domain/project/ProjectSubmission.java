package main.domain.project;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class ProjectSubmission {

    private String submissionLink;
    private Project project;
    private String userId;


    public String getSubmissionLink() {
        return submissionLink;
    }

    public void setSubmissionLink(String submissionLink) {
        this.submissionLink = submissionLink;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
