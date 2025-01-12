package com.hchw.management.controller;

import com.hchw.management.entity.Project;
import com.hchw.management.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProjectUIController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/projectsdetails/view")
    public String viewProjects(Model model) {
        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);
        return "projects";
    }
}

