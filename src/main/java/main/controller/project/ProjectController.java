package main.controller.project;

import main.domain.project.Project;
import main.service.project.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tayfer01 on 10/5/2017.
 */
@RestController
public class ProjectController {

    ProjectService projectService = new ProjectService();

    @CrossOrigin
    @RequestMapping("/projects")
    public List<Project> getProjects() {
        return  projectService.findAllProjects();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Project postSubmission(@RequestParam(value = "id") String id, @RequestParam(value = "gitLink") String githubLink){

        return null;
    }


}
