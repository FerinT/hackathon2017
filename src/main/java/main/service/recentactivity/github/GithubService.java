package main.service.recentactivity.github;

import org.kohsuke.github.GHEvent;
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
    GitHub github;

    public List<GHEventInfo> getActivity(String username) throws IOException {
        github = GitHub.connectAnonymously();
        ghUser = github.getUser(username);

        return  ghUser.listEvents().asList().subList(0,10);
    }

}
