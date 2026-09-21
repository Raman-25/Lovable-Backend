package com.projects.lovable_clone.mapper;


import com.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.projects.lovable_clone.Dto.project.ProjectResponse;
import com.projects.lovable_clone.entity.ProjectEntity;
import com.projects.lovable_clone.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(ProjectEntity projectEntity);
    UserProfileResponse toUserProfileResponse(UserEntity owner);

}
