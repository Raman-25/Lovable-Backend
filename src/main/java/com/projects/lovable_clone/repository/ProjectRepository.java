package com.projects.lovable_clone.repository;

import com.projects.lovable_clone.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}