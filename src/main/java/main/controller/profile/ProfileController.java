package main.controller.profile;

import main.domain.profile.Profile;
import main.service.profile.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */

@RestController
public class ProfileController {

    ProfileService profileService = new ProfileService();

    @CrossOrigin
    @RequestMapping(path = "/profile/student/{id}")
    public Profile getProfile(@PathVariable("id") String id) throws Exception {

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
        return profileService.findAllTutors();
    }
}
