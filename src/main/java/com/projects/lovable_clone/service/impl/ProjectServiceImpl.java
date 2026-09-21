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
import org.jspecify.annotations.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
        UserEntity owner = userRepository.findById(1L).orElseThrow();

        ProjectEntity projectEntity = ProjectEntity.builder()
                .name(request.name())
                .owner(owner)
                .build();
        projectEntity = projectRepository.save(projectEntity);

        return projectMapper.toProjectResponse(projectEntity);
    }

    @Override
    public  List<ProjectSummaryResponse> getAllProjects(Long userId) {
        return null;
    }

    @Override
    public  ProjectResponse getProjectById(Long id, Long userId) {
        return null;
    }


    @Override
    public  ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softdelete(Long id, Long userId) {
    }
}
