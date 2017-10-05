package main.service.recentactivity;

import main.domain.recentactivity.RecentActivity;
import main.domain.user.User;
import main.service.recentactivity.github.GithubService;
import main.service.recentactivity.stackoverflow.StackoverflowService;
import org.kohsuke.github.GHEventInfo;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class RecentActivityService {

    private GithubService githubService = new GithubService();
    private StackoverflowService stackoverflow;
    private List<GHEventInfo> ghEventInfoList = new LinkedList<>();

    private List<RecentActivity> recentActivityList;

    private void githubActivity(String username) throws Exception{

        ghEventInfoList = githubService.getActivity(username);

        for(int i = 0; (i < ghEventInfoList.size()) || (i < 5); i++){
            recentActivityList.add(new RecentActivity(ghEventInfoList.get(i).getType().toString(),
                    ghEventInfoList.get(i).getRepository().getHtmlUrl().toString()));
        }

    }

    public List<RecentActivity> getRecentActivityList(User user) throws Exception{
        recentActivityList = new LinkedList<>();
        githubActivity(user.getGithubUsername());
        // add stackoverflow
        return recentActivityList;
    }


    public String calculateReputationPoints(String username)throws Exception{
        ghEventInfoList = githubService.getActivity(username);
        Random rand = new Random();
        int numberOfProjectCompleted = rand.nextInt(20) + 1;
        int numberOfTotalActivity = ghEventInfoList.size();

        int reputationPoints = (numberOfProjectCompleted * 2 / 3) + (numberOfTotalActivity * 2 / 5);

        return reputationPoints + "";
    }
}
