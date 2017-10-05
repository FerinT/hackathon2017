package main;

import main.domain.profile.Profile;
import main.domain.user.User;
import main.service.profile.ProfileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tayfer01 on 10/5/2017.
 */

@SpringBootApplication
public class Main {


    public void insertMockData(){
        ProfileService profileService = new ProfileService();

        User user1 = new User("Ferin", "FerinT", "6245533" );
        user1.setInterest("Java, HTML, CSS");
        user1.setSchool("Milnerton High");
        user1.setRole("Student");

        User user2 = new User("Brandon", "BrandonMay693", "6245533" );
        user2.setInterest("Java, HTML, Big Data");
        user2.setSchool("Milnerton High");
        user2.setRole("Student");

        User user3 = new User("Twaha", "Twahatnz", "6245533" );
        user3.setInterest("C++, NLP, CSS");
        user3.setSchool("Milnerton High");
        user3.setRole("Student");

        User user4 = new User("Luke", "LukeKram", "6245533" );
        user4.setInterest("Java, HTML, CSS");
        user4.setSchool("Milnerton High");
        user4.setRole("Student");

        User user5 = new User("Shiraaz", "Shiraazm", "6245533" );
        user5.setInterest("Machine learning, HTML");
        user5.setRole("Architect");


        Profile profile1 = new Profile(user1);
        Profile profile2 = new Profile(user2);
        Profile profile3 = new Profile(user3);
        Profile profile4 = new Profile(user4);
        Profile profile5 = new Profile(user5);

        profileService.insertProfile(profile1);
        profileService.insertProfile(profile2);
        profileService.insertProfile(profile3);
        profileService.insertProfile(profile4);
        profileService.insertProfile(profile5);
    }

    public static void main(String[] args) {
        //Main main = new Main();
        //main.insertMockData();
        SpringApplication.run(Main.class, args);
    }

}
