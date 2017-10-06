package main.service.recentactivity;


import com.google.gson.Gson;
import main.domain.profile.Profile;
import main.domain.project.Project;
import main.domain.recentactivity.RecentActivity;
import main.domain.user.User;
import main.service.recentactivity.github.GithubService;
import main.service.recentactivity.stackoverflow.StackOverFlowReputationWrapper;
import main.service.recentactivity.stackoverflow.StackoverflowService;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHEventInfo;

import java.io.File;
import java.io.IOException;
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

    private void githubActivity(String username) throws Exception {

        ghEventInfoList = githubService.getActivity(username);

        for (int i = 0; (i < ghEventInfoList.size()) && (i < 5); i++) {
            recentActivityList.add(new RecentActivity(ghEventInfoList.get(i).getType().toString(),
                    ghEventInfoList.get(i).getRepository().getHtmlUrl().toString(),
                    ghEventInfoList.get(i).getType().toString() + " event occurred on the following repository."));
        }

    }

    private void stackActivity() {

        try {
            Gson gson = new Gson();
            String stackJson = FileUtils.readFileToString(new File(System.getProperty("user.dir") + File.separator + "stackoverflowactivity.json"));

            StackOverFlowReputationWrapper wrapper = gson.fromJson(stackJson, StackOverFlowReputationWrapper.class);
            System.out.println(wrapper.getItems().get(0).getCreation_date());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<RecentActivity> getRecentActivityList(User user) throws Exception {
        recentActivityList = new LinkedList<>();
        stackActivity();
        githubActivity(user.getGithubUsername());
        // add stackoverflow
        return recentActivityList;
    }


    public String calculateReputationPoints(String username) throws Exception {
        ghEventInfoList = githubService.getActivity(username);
        Random rand = new Random();
        int numberOfProjectCompleted = rand.nextInt(20) + 1;
        int numberOfTotalActivity = ghEventInfoList.size();

        int reputationPoints = (numberOfProjectCompleted * 2 / 3) + (numberOfTotalActivity * 2 / 5);

        return reputationPoints + "";
    }

    public Profile getProfileFromFile(String username) throws Exception{
        Gson gson = new Gson();
        String stackJson = FileUtils.readFileToString(new File(System.getProperty("user.dir") + File.separator + "src/main/java/main/utils/githubresponses/" + username + ".json"));

        Profile wrapper = gson.fromJson(stackJson, Profile.class);

        return wrapper;
    }
}
