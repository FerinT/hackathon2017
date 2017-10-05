package main.domain.profile;

import main.domain.user.User;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class Profile {
    private User user;

    public Profile(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
