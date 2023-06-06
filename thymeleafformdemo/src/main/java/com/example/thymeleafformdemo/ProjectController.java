package com.example.thymeleafformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

// sourced from from:
//
// https://attacomsian.com/blog/spring-boot-thymeleaf-form-handling
//

@Controller
public class ProjectController {

    private List<Project> projectList = new ArrayList<>();

    @GetMapping("/create-project")
    public String createProjectForm(Model model) {

        model.addAttribute("project", new Project());
        return "create-project";
    }

    @PostMapping("/save-project")
    public String saveProjectSubmission(@ModelAttribute Project project) {

        // TODO: save project in DB here
            projectList.add(project);
        return "result";
    }

    @GetMapping("/projects")
    public String showProjects(Model model){
        model.addAttribute("projects", projectList);
        return "projects";
    }

    @GetMapping("/view-projects")
    public String viewProjects() {
        return "redirect:/projects";
    }


}