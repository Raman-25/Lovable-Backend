package com.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "Preview")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PreviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "user_id")
    UserEntity user_id;

    String namespace;

    String pod_name;

    Boolean status;

    Instant createdAt;

    Instant updated_at;


}

