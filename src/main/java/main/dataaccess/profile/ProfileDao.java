package main.dataaccess.profile;

import com.mongodb.MongoClient;
import main.domain.profile.Profile;
import main.utils.Variables;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;

import java.util.List;


/**
 * Created by tayfer01 on 10/5/2017.
 */
public class ProfileDao {
    MongoTemplate template = new MongoTemplate(new MongoClient("127.0.0.1", 27017), "hackathon2017");


    public void insertProfile(Profile profile) {

        if (profile.getUser().getRole().equalsIgnoreCase(Variables.STUDENT)) {
            String userId = template.findAll(Profile.class, Variables.STUDENT_COLLECTION).size() + 1 + "";
            profile.getUser().setId(userId);
            template.insert(profile, Variables.STUDENT_COLLECTION);
        } else {
            String userId = template.findAll(Profile.class, Variables.TUTOR_COLLECTION).size() + 1 + "";
            profile.getUser().setId(userId);
            template.insert(profile, Variables.TUTOR_COLLECTION);
        }
    }

    public Profile findProfile(String profileId) {

        BasicQuery basicQuery = new BasicQuery("{user.id : " + profileId + "}");
        return template.findOne(basicQuery, Profile.class);

    }

    public List<Profile> findAllProfiles(String studentCollection) {
        return template.findAll(Profile.class, studentCollection);
    }

}
