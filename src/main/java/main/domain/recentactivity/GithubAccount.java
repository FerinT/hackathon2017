package main.domain.recentactivity;


/**
 * Created by tayfer01 on 10/6/2017.
 */
public class GithubAccount {

    private String avatarUrl;
    private String followers;
    private String repos;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getRepos() {
        return repos;
    }

    public void setRepos(String repos) {
        this.repos = repos;
    }
}
