package main.dataaccess.profile;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.sun.scenario.effect.impl.prism.PrFilterContext;
import main.domain.profile.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;


/**
 * Created by tayfer01 on 10/5/2017.
 */
public class ProfileDao {
    MongoTemplate template = new MongoTemplate(new MongoClient("127.0.0.1", 27017), "hackathon2017");


    public void insertProfile(Profile profile) {

        template.insert(profile);

    }

    public Profile findProfile(String profileId) {

        BasicQuery basicQuery = new BasicQuery("{user.id : " + profileId + "}");
        return template.findOne(basicQuery, Profile.class);

    }

    public List<Profile> findAllProfiles() {
        return template.findAll(Profile.class);
    }

}
