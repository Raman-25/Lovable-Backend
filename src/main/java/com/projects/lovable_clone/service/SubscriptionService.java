package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.Subscription.CheckoutRequest;
import com.projects.lovable_clone.Dto.Subscription.CheckoutResponse;
import com.projects.lovable_clone.Dto.Subscription.PortalResponse;
import com.projects.lovable_clone.Dto.Subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {

    @Nullable SubscriptionResponse getCurrentSubscription(Long userId);

    @Nullable CheckoutResponse creteCheckoutUrl(CheckoutRequest request, Long userId);

    @Nullable PortalResponse openCustomerPortal(Long userId);
}
