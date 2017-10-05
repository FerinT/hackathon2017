package main;

import main.domain.profile.Profile;
import main.domain.project.Project;
import main.domain.user.User;
import main.service.profile.ProfileService;
import main.service.project.ProjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tayfer01 on 10/5/2017.
 */

@SpringBootApplication
public class Main {


    public void insertProject(){
        ProjectService profileService = new ProjectService();

        Project project1 = new Project();
        project1.setName("TDD");
        project1.setDescription("Create an app using TDD (Test Driven Development)");
        project1.setPoints("40");

        Project project2 = new Project();
        project2.setName("SOLID");
        project2.setDescription("Demonstrate an app using all SOLID principles");
        project2.setPoints("60");

        Project project3 = new Project();
        project3.setName("Angular 2");
        project3.setDescription("Create an Angular app using ROUTING");
        project3.setPoints("80");

        profileService.insertProject(project1);
        profileService.insertProject(project2);
        profileService.insertProject(project3);
    }


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

    public void insertTutors(){
        ProfileService profileService = new ProfileService();

        User user5 = new User("Stellasie", "Shiraazm", "6245533" );
        user5.setInterest("Java, Continuous Integration");
        user5.setRole("Tutor");

        Profile profile5 = new Profile(user5);
        profileService.insertProfile(profile5);

        User user6 = new User("Shane", "Shiraazm", "6245533" );
        user6.setInterest("Scrum Master, Angular");
        user6.setRole("Tutor");

        Profile profile6 = new Profile(user6);
        profileService.insertProfile(profile6);
    }

    public static void main(String[] args) {
//      Main main = new Main();
//      main.insertMockData();
//      main.insertTutors();
//      main.insertProject();
        SpringApplication.run(Main.class, args);
    }

}
