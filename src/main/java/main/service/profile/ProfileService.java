package main.service.profile;

import main.dataaccess.profile.ProfileDao;
import main.domain.profile.Profile;
import main.service.recentactivity.RecentActivityService;

import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class ProfileService {

    private ProfileDao profileDao = new ProfileDao();

    private RecentActivityService recentActivityService = new RecentActivityService();

    public void insertProfile(Profile profile) {

        profileDao.insertProfile(profile);
    }

    public List<Profile> findAllProfiles() {

        return profileDao.findAllProfiles();
    }

    public Profile findProfile(String profileId) throws Exception {
        Profile profile =  profileDao.findProfile(profileId);
        profile.setRecentActivity(recentActivityService.getRecentActivityList(profile.getUser()));
        return profile;
    }

}
