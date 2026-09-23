package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.project.ProjectRequest;
import com.projects.lovable_clone.Dto.project.ProjectResponse;
import com.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {

    List<ProjectSummaryResponse> getAllProjects(Long userId);

   ProjectResponse getProjectById(Long id, Long userId);

   ProjectResponse createProject(ProjectRequest request, Long userId);

   ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softdelete(Long id, Long userId);
}
