package com.hchw.management.controller;

import com.hchw.management.entity.Project;
import com.hchw.management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectsdetails")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping("/add")
    public Project addProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }
}
