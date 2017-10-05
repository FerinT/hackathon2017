package main.domain.user;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class User {
    private String id;
    private String name;
    private String githubLink;
    private String stackoverflowLink;
    private String emailAddress;
    private String school;
    private String interest;

    // promotes them to open these accounts
    public User(String name, String githubLink, String stackoverflowLink) {
        this.name = name;
        this.githubLink = githubLink;
        this.stackoverflowLink = stackoverflowLink;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getStackoverflowLink() {
        return stackoverflowLink;
    }

    public void setStackoverflowLink(String stackoverflowLink) {
        this.stackoverflowLink = stackoverflowLink;
    }
}
