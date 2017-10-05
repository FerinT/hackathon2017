package main.domain.user;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class User {
    private String name;
    private String githubLink;
    private String stackoverflowLink;

    // promotes them to open these accounts
    public User(String name, String githubLink, String stackoverflowLink) {
        this.name = name;
        this.githubLink = githubLink;
        this.stackoverflowLink = stackoverflowLink;
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
