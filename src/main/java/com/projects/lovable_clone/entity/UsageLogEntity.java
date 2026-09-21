package com.projects.lovable_clone.entity;

import com.projects.lovable_clone.enums.SubscriptionStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "Usage_Log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLogEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        @ManyToOne
        @JoinColumn(name = "project_id")
        ProjectEntity project_id;

        @ManyToOne
        @JoinColumn(name = "user_id")
        UserEntity user_id;

        String action;

        Integer token_used;

        Instant duration_ms;

        Instant createdAt;

    }



