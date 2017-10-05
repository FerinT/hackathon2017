package main.service.profile;

import main.dataaccess.profile.ProfileDao;
import main.domain.profile.Profile;
import main.service.recentactivity.RecentActivityService;
import main.utils.Variables;

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

        return profileDao.findAllProfiles(Variables.STUDENT_COLLECTION);
    }

    public Profile findProfile(String profileId) throws Exception {
        Profile profile =  profileDao.findProfile(profileId);
        profile.setRecentActivity(recentActivityService.getRecentActivityList(profile.getUser()));
        return profile;
    }

    public List<Profile> findAllTutors() {
        return profileDao.findAllProfiles(Variables.TUTOR_COLLECTION);
    }
}
