package com.projects.lovable_clone.controller;


import com.projects.lovable_clone.Dto.Subscription.*;
import com.projects.lovable_clone.service.SubscriptionService;
import com.projects.lovable_clone.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BillingController {

    private final SubscriptionService subscriptionService;
    private final PlanService planService;


    @GetMapping("/plans")
    public ResponseEntity<List<PlanResponse>> getAllActivePlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/me/subscription")
    public ResponseEntity<SubscriptionResponse> getCurrentSubscription(){
        Long userId =1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/stripe/checkout")
    public ResponseEntity<CheckoutResponse> creteCheckoutResponse(@RequestBody CheckoutRequest request){
        Long userId= 1L;
        return ResponseEntity.ok(subscriptionService.creteCheckoutUrl(request,userId));
    }

    @PostMapping("/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal(){
        Long userId= 1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }

}
