package main.controller.profile;

import main.domain.profile.Profile;
import main.domain.user.User;
import main.service.recentactivity.github.GithubService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */

@RestController
public class ProfileController {

    @CrossOrigin
    @RequestMapping(path = "/profile/student")
    public Profile getProfile(@RequestParam(value = "id") String id) {


        return new Profile(new User("hey", "hey", "hey"));
    }

    @CrossOrigin
    @RequestMapping(path = "/profiles/students")
    public List<Profile> getProfiles() {
        List<Profile> profileList = new ArrayList<Profile>();

        profileList.add(new Profile(new User("hey", "hey", "hey")));
        profileList.add(new Profile(new User("hey", "hey", "hey")));

        return profileList;
    }

    @CrossOrigin
    @RequestMapping(path = "/createProfile/student/", method = RequestMethod.POST)
    public void insertProfile(@RequestBody Profile profile) {


    }

}
