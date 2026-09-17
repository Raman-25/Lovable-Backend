package com.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //this will make all fields private
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true)
    String email;   //UK

    @Column(nullable = false)
    String passwordHash;

    @Column(nullable = false)
    String name;


    String avatarUrl;

    @Column(nullable = false, updatable = false)
    Instant createdAt;


    Instant updatedAt;


    Instant deletedAt;
}