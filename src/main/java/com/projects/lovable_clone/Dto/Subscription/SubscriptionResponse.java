package com.projects.lovable_clone.Dto.Subscription;

import com.projects.lovable_clone.enums.SubscriptionStatus;

import java.time.Instant;

public record SubscriptionResponse(

        Long id,

        PlanResponse plan,

        SubscriptionStatus status,

        String stripeCustomerId,
        String stripeSubscription,

        Instant currentPeriodStart,
        Instant currentPeriodEnd,

       Long tokenUsedThisCycle


) {
}
