package com.example.Project.controller;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.entity.Project;

import com.example.Project.service.ProjectServiceImp;


@RestController
@RequestMapping("/api/project")
public class ProjectController {
	@Autowired
      ProjectServiceImp projectserviceimp;
	
	
	@PostMapping("/post")
	public Project create(@RequestBody Project project) {
		return projectserviceimp.create(project);
	}
	@GetMapping("/get/{id}")
	public Optional<Project> get(@PathVariable int id) {
		return projectserviceimp.get(id);
	}
	@PutMapping("/update")
	public Project update(@RequestBody Project project) {
		return projectserviceimp.update(project);
		}
}
