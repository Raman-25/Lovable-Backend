package com.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "ProjectFile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectFileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    ProjectEntity project;          // FK

    @Column(unique = true)
    String path;             // UK

    String minioObjectKey;

    @ManyToOne
    @JoinColumn(name = "created_by")
    UserEntity createdBy;         // FK

    @ManyToOne
    @JoinColumn(name = "updated_by")
    UserEntity updatedBy;           // FK

    Instant createdAt;

    Instant updatedAt;
}

