package com.projects.lovable_clone.repository;

import com.projects.lovable_clone.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}