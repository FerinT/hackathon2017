package main.dataaccess.project;

import com.mongodb.MongoClient;
import main.domain.project.Project;
import main.utils.Variables;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class ProjectDao {

    MongoTemplate template = new MongoTemplate(new MongoClient("127.0.0.1", 27017), "hackathon2017");


    public void insertProject(Project project){
        String projectId = template.findAll(Project.class, Variables.PROJECT_COLLECTION).size() + 1 + "";
        project.setProjectId(projectId);
        template.insert(project, Variables.PROJECT_COLLECTION);
    }

    public List<Project> getAllProjects(String projectCollection){
        return template.findAll(Project.class, projectCollection);
    }

}
