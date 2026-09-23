package com.projects.lovable_clone.repository;

import com.projects.lovable_clone.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

    @Query("""
           SELECT p FROM ProjectEntity p
           WHERE p.deletedAt IS NULL
           AND p.owner.id = :userId
           ORDER BY p.updatedAt DESC
           """
    )
    List<ProjectEntity> findAllAccessibleByUser(@Param("userId") Long userId );


    @Query("""
    SELECT p FROM ProjectEntity p
    LEFT JOIN FETCH p.owner
    WHERE p.id = :projectId
      AND p.deletedAt IS NULL
      AND p.owner.id = :userId
    """)
    Optional<ProjectEntity>findAllAccessibleProjectById(@Param("projectId") Long id,@Param("userId") Long userId);
}