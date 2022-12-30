package com.fjmgservices.proyect.service;

import com.fjmgservices.proyect.model.Project;
import com.fjmgservices.proyect.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAll()
    {
        return (List<Project>) projectRepository.findAll();
    }
    public String saveProject(Project project)
    {
        try {
            projectRepository.save(project);
        }
        catch(Exception e)
        {
            return "error";
        }
        return "ok";
    }
}
