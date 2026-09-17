package com.projects.lovable_clone.entity;

import com.projects.lovable_clone.enums.SubscriptionStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "subscription")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubscriptionEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        @ManyToOne
        UserEntity user;

        @ManyToMany
        PlanEntity plan;

        SubscriptionStatus status; //used enum

        String stripeCustomerId;
        String stripeSubscription;


        Instant currentPeriodStart;
        Instant currentPeriodEnd;
        Instant cancelledAtPeriodEnd;

        Instant createdAt;
        Instant updatedAt;
    }

