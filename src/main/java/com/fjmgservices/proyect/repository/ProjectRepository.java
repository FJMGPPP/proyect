package com.fjmgservices.proyect.repository;

import com.fjmgservices.proyect.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Integer>
{

}
