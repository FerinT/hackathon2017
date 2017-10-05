package main.controller.profile;

import main.domain.profile.Profile;
import main.domain.user.User;
import main.service.profile.ProfileService;
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

    ProfileService profileService = new ProfileService();

    @CrossOrigin
    @RequestMapping(path = "/profile/student")
    public Profile getProfile(@RequestParam(value = "id") String id) throws Exception {

        return profileService.findProfile(id);
    }

    @CrossOrigin
    @RequestMapping(path = "/profiles/students")
    public List<Profile> getProfiles() {
       return profileService.findAllProfiles();
    }

    @CrossOrigin
    @RequestMapping(path = "/createProfile/student/", method = RequestMethod.POST)
    public void insertProfile(@RequestBody Profile profile) {

    }

    @CrossOrigin
    @RequestMapping(path = "/profiles/tutors")
    public List<Profile> getTutors() {
        List<Profile> result = new ArrayList<Profile>();

        result.add(new Profile(getUserWith("Brandon", "https://github.com/ShiraazMoollatjie", "https://stackoverflow.com/users/761035/shiraaz-m", "mllshi011@gmail.com", "Java")));
        result.add(new Profile(getUserWith("Ferin", "https://github.com/ShiraazMoollatjie", "https://stackoverflow.com/users/761035/shiraaz-m", "mllshi011@gmail.com", "Java")));

        return result;
    }

    private User getUserWith(String name, String githubLink, String stackoverflowLink, String emailAddress, String interest) {
        final User result = new User(
                name,
                githubLink,
                stackoverflowLink);

        result.setEmailAddress(emailAddress);
        result.setId(result.getName());
        result.setInterest(interest);

        return result;
    }

}
