package com.fjmgservices.proyect.controller;

import com.fjmgservices.proyect.model.Project;
import com.fjmgservices.proyect.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController
{
    @Autowired
    private ProjectService projectService;

    @GetMapping("/All")
    public List<Project> getAll()
    {
        return projectService.getAll();
    }
    @PostMapping("/save")
    public String  saveProct(@RequestBody Project project)
    {
        return projectService.saveProject(project);
    }
}
