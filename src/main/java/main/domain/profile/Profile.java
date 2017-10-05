package main.domain.profile;

import main.domain.recentactivity.RecentActivity;
import main.domain.user.User;

import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class Profile {
    private User user;
    private List<RecentActivity> recentActivity;

    public Profile(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RecentActivity> getRecentActivity() {
        return recentActivity;
    }

    public void setRecentActivity(List<RecentActivity> recentActivity) {
        this.recentActivity = recentActivity;
    }
}
