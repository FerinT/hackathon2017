package main;

import main.domain.profile.Profile;
import main.domain.project.Project;
import main.domain.tipofday.TipOfTheDay;
import main.domain.user.User;
import main.service.profile.ProfileService;
import main.service.project.ProjectService;
import main.service.tipoftheday.TipOfTheDayService;
import main.utils.Variables;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

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
        project1.setInstructions("1. Create a Github repo called TDD_activity\n2. For every class you create create there should be a test\n3. You are to submit a test coverage report\n4. Goodluck");

        Project project2 = new Project();
        project2.setName("SOLID");
        project2.setDescription("Demonstrate an app using all SOLID principles");
        project2.setPoints("60");
        project2.setInstructions("1. Create a Github repo called SOLID_activity\n2. You are to create a program that demonstrates the usage ALL SOLID principles\n3. You are to submit a test coverage report\n4. Goodluck");

        Project project3 = new Project();
        project3.setName("Angular 2");
        project3.setDescription("Create an Angular app using ROUTING");
        project3.setPoints("80");
        project3.setInstructions("1. Create a Github repo called ROUTING_activity\n2. Create a program that shows at least 4 routing paths\n3. You are to submit a test coverage report\n4. Goodluck");

        profileService.insertProject(project1);
        profileService.insertProject(project2);
        profileService.insertProject(project3);
    }


    public void insertStudents(){
        ProfileService profileService = new ProfileService();


        User user1 = new User("Ferin", "FerinT", "6245533" );
        user1.setInterest("Java, HTML, CSS");
        user1.setSchool("Milnerton High");
        user1.setRole("Student");
        user1.getBadges().add(Variables.ARCHITECT);
        user1.getBadges().add(Variables.GRADUATE_DEVELOPER);
        user1.getBadges().add(Variables.JAVA);

        User user2 = new User("Brandon", "BrandonMay693", "6666423" );
        user2.setInterest("Java, HTML, Big Data");
        user2.setSchool("Milnerton High");
        user2.setRole("Student");
        user2.getBadges().add(Variables.GRADUATE_DEVELOPER);
        user2.getBadges().add(Variables.DOCKER);

        User user3 = new User("Twaha", "Twahanz", "6049869" );
        user3.setInterest("C++, NLP, CSS");
        user3.setSchool("Milnerton High");
        user3.setRole("Student");
        user3.getBadges().add(Variables.ARCHITECT);
        user3.getBadges().add(Variables.INTERMEDIATE_DEVELOPER);
        user3.getBadges().add(Variables.PRINCIPLE_ARCHITECT);

        User user4 = new User("Luke", "LukeKramer", "8731304" );
        user4.setInterest("Java, HTML, CSS");
        user4.setSchool("Milnerton High");
        user4.setRole("Student");
        user4.getBadges().add(Variables.DTM);
        user4.getBadges().add(Variables.SENIOR_DEVELOPER);

        User user5 = new User("Shiraaz", "ShiraazMoollatjie", "6245533" );
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
        user5.setRole(Variables.SENIOR_DEVELOPER);

        Profile profile5 = new Profile(user5);
        profileService.insertProfile(profile5);

        User user6 = new User("Shane", "Shiraazm", "6245533" );
        user6.setInterest("Scrum Master, Angular");
        user6.setRole("Tutor");

        Profile profile6 = new Profile(user6);
        profileService.insertProfile(profile6);
    }

    private void insertDailyTips(){
        TipOfTheDayService service = new TipOfTheDayService();

        TipOfTheDay tipOfTheDay = new TipOfTheDay();
        tipOfTheDay.setTheme("Docker");
        tipOfTheDay.setTipText("Make use of Dockerfiles\n" +
                "Deploying a Docker container can get really cumbersome because the commands are often unwieldy (and a serious challenge to remember). Instead of working from the command line, you should be making use of Dockerfiles. A Dockerfile is a short recipe that describes the files, environment, and commands that make up an image. Once you've created the Dockerfile, it can be easily used with a command like: docker build -t dockerfilename .");

        service.insertDailyTip(tipOfTheDay);

        tipOfTheDay = new TipOfTheDay();
        tipOfTheDay.setTheme("Docker");
        tipOfTheDay.setTipText("Running Docker without root (or sudo)\n" +
                "By default, the Docker command can only be run by root or with the help of sudo. You might have users that need to run Docker, but don't have access to the root user. For that, you need to add those users to the Docker group with the following commands: sudo gpasswd -a USERNAME docker");

        service.insertDailyTip(tipOfTheDay);

        tipOfTheDay = new TipOfTheDay();
        tipOfTheDay.setTheme("Docker");
        tipOfTheDay.setTipText("Aliases\n" +
                "Many Linux admins create their own aliases for various commands. Because some Docker commands can get a bit long (or just hard to remember), it's always best to create aliases. These aliases are added to either your ~/.bashrc or ~/.bash_aliases file and can look like:\n" +
                "\n" +
                "alias drm=\"docker rm\"\n" +
                "\u200Balias dps=\"docker ps\"\n" +
                "\u200Balias dl='docker ps -l -q'\n" +
                "Now you only would have to remember the aliases drm, dps, and dl. A much easier route to working with Docker.");

        service.insertDailyTip(tipOfTheDay);
    }

    public static void main(String[] args) {
/*      Main main = new Main();
      main.insertStudents();
      main.insertTutors();
      main.insertProject();
      main.insertDailyTips();*/
      SpringApplication.run(Main.class, args);

    }

}
