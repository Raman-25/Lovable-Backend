package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.project.ProjectRequest;
import com.projects.lovable_clone.Dto.project.ProjectResponse;
import com.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.projects.lovable_clone.entity.ProjectEntity;
import com.projects.lovable_clone.entity.UserEntity;
import com.projects.lovable_clone.mapper.ProjectMapper;
import com.projects.lovable_clone.repository.ProjectRepository;
import com.projects.lovable_clone.repository.UserRepository;
import com.projects.lovable_clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId){
        UserEntity owner = userRepository.findById(userId).orElseThrow();

        ProjectEntity projectEntity = ProjectEntity.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();
        projectEntity = projectRepository.save(projectEntity);

        return projectMapper.toProjectResponse(projectEntity);
    }

    @Override
    public  List<ProjectSummaryResponse> getAllProjects(Long userId) {

        List<ProjectEntity> projectEntities = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toProjectSummaryResponse(projectEntities);
    }

    @Override
    public  ProjectResponse getProjectById(Long id, Long userId) {
        ProjectEntity project = getAccessibleProjectById(id,userId);
        return projectMapper.toProjectResponse(project);
    }


    @Override
    public  ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {

        ProjectEntity project = getAccessibleProjectById(id,userId);
        project.setName(request.name());
        projectRepository.save(project);

        return projectMapper.toProjectResponse(project);

    }

    @Override
    public void softdelete(Long id, Long userId) {

        ProjectEntity project =getAccessibleProjectById(id,userId);

        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not allowed to delete");
        }
        project.setDeletedAt(Instant.now());
        projectRepository.save(project);
    }


    // INTERNAL FUNCTIONS
    public ProjectEntity getAccessibleProjectById(Long projectId, Long userId){
        return projectRepository.findAllAccessibleProjectById(projectId,userId).orElseThrow();
    }

}
