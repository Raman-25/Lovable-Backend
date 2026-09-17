package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.projects.lovable_clone.entity.ProjectEntity;
import com.projects.lovable_clone.entity.UserEntity;
import com.projects.lovable_clone.repository.ProjectRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
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
    private final EntityManager entityManager;

    @Transactional
    public ProjectSummaryResponse createProject(ProjectSummaryResponse projectDto) {
        ProjectEntity project = modelMapper.map(projectDto, ProjectEntity.class);
        project.setId(null);
        setProjectUser(project, projectDto.getUserId());
        Instant now = Instant.now();
        project.setCreatedAt(now);
        project.setUpdatedAt(now);
        return toDto(projectRepository.save(project));
    }

    @Transactional(readOnly = true)
    public List<ProjectSummaryResponse> getAllProjects(Long userId) {
        return projectRepository.findAll().stream().map(this::toDto).toList();
    }

    @Transactional(readOnly = true)
    public ProjectSummaryResponse getProjectById(Long id) {
        return toDto(findProject(id));
    }

    @Transactional
    public ProjectSummaryResponse updateProject(Long id, ProjectSummaryResponse projectDto) {
        ProjectEntity project = findProject(id);
        modelMapper.map(projectDto, project);
        project.setId(id);
        setProjectUser(project, projectDto.getUserId());
        project.setUpdatedAt(Instant.now());
        return toDto(projectRepository.save(project));
    }

    @Transactional
    public void deleteProject(Long id) {
        projectRepository.delete(findProject(id));
    }

    private ProjectEntity findProject(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Project not found"));
    }

    private void setProjectUser(ProjectEntity project, Long userId) {
        project.setUser(userId == null ? null : entityManager.getReference(UserEntity.class, userId));
    }

    private ProjectSummaryResponse toDto(ProjectEntity project) {
        ProjectSummaryResponse projectDto = modelMapper.map(project, ProjectSummaryResponse.class);
        projectDto.setUserId(project.getUser() == null ? null : project.getUser().getId());
        return projectDto;
    }
}
