package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.project.ProjectRequest;
import com.projects.lovable_clone.Dto.project.ProjectResponse;
import com.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.projects.lovable_clone.entity.ProjectEntity;
import com.projects.lovable_clone.entity.UserEntity;
import com.projects.lovable_clone.repository.ProjectRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;


    public @Nullable List<ProjectSummaryResponse> getAllProjects(Long userId) {
    }

    public @Nullable ProjectResponse getProjectById(Long id, Long userId) {
    }

    public @Nullable ProjectResponse createProject(ProjectRequest request, Long userId) {
    }

    public @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
    }

    public void softdelete(Long id, Long userId) {
    }
}
