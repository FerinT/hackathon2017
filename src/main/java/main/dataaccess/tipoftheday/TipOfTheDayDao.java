package main.dataaccess.tipoftheday;

import com.mongodb.MongoClient;
import main.domain.tipofday.TipOfTheDay;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * Created by maybra01 on 10/5/2017.
 */
public class TipOfTheDayDao {
    MongoTemplate template = new MongoTemplate(new MongoClient("127.0.0.1", 27017), "hackathon2017");

    public void insertTipOfTheDay(TipOfTheDay tipOfTheDay) {
        template.insert(tipOfTheDay);
    }

    public List<TipOfTheDay> findAllTips() {
        return template.findAll(TipOfTheDay.class);
    }

}
