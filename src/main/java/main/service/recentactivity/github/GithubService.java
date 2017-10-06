package main.service.recentactivity.github;

import main.domain.recentactivity.GithubAccount;
import org.kohsuke.github.GHEventInfo;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class GithubService {

    private GHUser ghUser;
    private GitHub github;
    private GithubAccount githubAccount;


    public List<GHEventInfo> getActivity(String username) throws IOException {
        github = GitHub.connectUsingPassword("ferint", "newpassword1");
        ghUser = github.getUser(username);

        if (ghUser.listEvents().asList().size() > 10)
            return ghUser.listEvents().asList().subList(0, 10);
        else
            return ghUser.listEvents().asList();
    }

    public GithubAccount getGhUser(String username) throws Exception{
        githubAccount = new GithubAccount();
        github = GitHub.connectUsingPassword("ferint", "newpassword1");
        ghUser = github.getUser(username);

        githubAccount.setFollowers(ghUser.getFollowersCount() + "");
        githubAccount.setAvatarUrl(ghUser.getAvatarUrl());
        githubAccount.setRepos(ghUser.getRepositories().size() + "");

        return githubAccount;
    }
}
