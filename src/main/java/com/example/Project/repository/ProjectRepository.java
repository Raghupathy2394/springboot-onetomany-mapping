package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Project.entity.Project;



@Repository
public interface ProjectRepository  extends JpaRepository<Project,Integer>{

}
