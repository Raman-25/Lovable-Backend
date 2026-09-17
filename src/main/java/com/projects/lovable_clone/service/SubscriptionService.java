package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.Subscription.CheckoutRequest;
import com.projects.lovable_clone.Dto.Subscription.CheckoutResponse;
import com.projects.lovable_clone.Dto.Subscription.PortalResponse;
import com.projects.lovable_clone.Dto.Subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
    public @Nullable SubscriptionResponse getCurrentSubscription(Long userId) {
    }

    public @Nullable CheckoutResponse creteCheckoutUrl(CheckoutRequest request, Long userId) {
    }

    public @Nullable PortalResponse openCustomerPortal(Long userId) {
    }
}
