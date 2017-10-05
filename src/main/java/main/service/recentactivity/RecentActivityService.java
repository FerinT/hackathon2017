package main.service.recentactivity;

import com.google.code.stackexchange.client.StackExchangeApiClient;
import com.google.code.stackexchange.client.query.QuestionApiQuery;
import com.google.code.stackexchange.client.query.impl.QuestionApiQueryImpl;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.StackExchangeSite;
import main.domain.recentactivity.RecentActivity;
import main.domain.user.User;
import main.service.recentactivity.github.GithubService;
import main.service.recentactivity.stackoverflow.StackoverflowService;
import org.kohsuke.github.GHEventInfo;

import java.util.LinkedList;
import java.util.List;

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

    private void stackActivity(String id){
        QuestionApiQuery questionApiQuery =  new QuestionApiQueryImpl("appId", StackExchangeSite.STACK_OVERFLOW);

        for(Question q : questionApiQuery.listFeaturedQuestions()){
            System.out.println(q.toString());

        }
    }

    public List<RecentActivity> getRecentActivityList(User user) throws Exception{
        recentActivityList = new LinkedList<>();
        githubActivity(user.getGithubUsername());
        // add stackoverflow
        stackActivity("");
        return recentActivityList;
    }
}
