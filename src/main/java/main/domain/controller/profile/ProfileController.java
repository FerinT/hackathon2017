package main.domain.controller.profile;

import main.domain.profile.Profile;
import main.domain.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tayfer01 on 10/5/2017.
 */

@RestController
public class ProfileController {

    @RequestMapping(path = "/profile")
    public Profile getProfile(){

        return  new Profile(new User("hey", "hey", "hey"));
    }

}
