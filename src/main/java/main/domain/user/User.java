package main.domain.user;



import main.domain.recentactivity.GithubAccount;
import org.kohsuke.github.GHUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class User {
    private String userId;
    private String name;
    private String githubUsername;
    private String stackoverflowLink;
    private String emailAddress;
    private String school;
    private String interest;
    private String role;
    private String reputationPoints;
    private List<String> badges = new ArrayList<>();
    private GithubAccount githubAccount;


    // promotes them to open these accounts
    public User(String name, String githubUsername, String stackoverflowLink) {
        this.name = name;
        this.githubUsername = githubUsername;
        this.stackoverflowLink = stackoverflowLink;
    }

    public GithubAccount getGithubAccount() {
        return githubAccount;
    }

    public void setGithubAccount(GithubAccount githubAccount) {
        this.githubAccount = githubAccount;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    public String getReputationPoints() {
        return reputationPoints;
    }

    public void setReputationPoints(String reputationPoints) {
        this.reputationPoints = reputationPoints;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubUsername() {
        return githubUsername;
    }

    public void setGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
    }

    public String getStackoverflowLink() {
        return stackoverflowLink;
    }

    public void setStackoverflowLink(String stackoverflowLink) {
        this.stackoverflowLink = stackoverflowLink;
    }
}
