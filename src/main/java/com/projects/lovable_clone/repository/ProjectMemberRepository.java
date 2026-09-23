package com.projects.lovable_clone.repository;

import com.projects.lovable_clone.entity.ProjectMemberEntity;
import com.projects.lovable_clone.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMemberEntity, ProjectMemberId> {

    List<ProjectMemberEntity> findByIdProjectId(Long projectId);//gives us project-member entity

}