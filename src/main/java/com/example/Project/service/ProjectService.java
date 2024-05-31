package com.example.Project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.entity.Project;
import com.example.Project.repository.ProjectRepository;

@Service
public class ProjectService implements ProjectServiceImp {

	@Autowired
	ProjectRepository projectrepo;

	@Override
	public Project create(Project project) {
	return projectrepo.save(project);
		
	}

	@Override
	public Optional<Project> get(int id) {
		return projectrepo.findById(id);
		
	}

	@Override
	public Project update(Project project) {
		return projectrepo.save(project);
	}

	

}
