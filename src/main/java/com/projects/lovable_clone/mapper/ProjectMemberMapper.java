package com.projects.lovable_clone.mapper;


import com.projects.lovable_clone.Dto.Member.MemberResponse;
import com.projects.lovable_clone.entity.ProjectMemberEntity;
import com.projects.lovable_clone.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "projectRole",constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(UserEntity owner);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "name", source = "user.name")
    MemberResponse toProjectMemberResponseFromProjectMember(ProjectMemberEntity projectMember);
}
