package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.Subscription.CheckoutRequest;
import com.projects.lovable_clone.Dto.Subscription.CheckoutResponse;
import com.projects.lovable_clone.Dto.Subscription.PortalResponse;
import com.projects.lovable_clone.Dto.Subscription.SubscriptionResponse;
import com.projects.lovable_clone.service.SubscriptionService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public  SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public  CheckoutResponse creteCheckoutUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public  PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
