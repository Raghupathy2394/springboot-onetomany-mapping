package com.example.Project.service;

import java.util.Optional;

import com.example.Project.entity.Project;

public interface ProjectServiceImp {

	public Project create(Project project);

	public Optional<Project> get(int id);

	public Project update(Project project);


}
