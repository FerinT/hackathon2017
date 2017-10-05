package main.service.project;

import main.dataaccess.project.ProjectDao;
import main.domain.project.Project;
import main.utils.Variables;

import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class ProjectService {
    private ProjectDao projectDao = new ProjectDao();


    public void insertProject(Project project){
        projectDao.insertProject(project);
    }

    public List<Project> findAllProjects() {
        return projectDao.getAllProjects(Variables.PROJECT_COLLECTION);
    }

}
