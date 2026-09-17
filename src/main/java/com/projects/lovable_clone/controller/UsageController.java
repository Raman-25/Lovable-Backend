package com.projects.lovable_clone.controller;

import com.projects.lovable_clone.Dto.Usage.PlanLimitResponse;
import com.projects.lovable_clone.Dto.Usage.UsageTodayResponse;
import com.projects.lovable_clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsageOfUser(){
        long userId = 1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits(){
        long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitOfUser (userId));
    }
}
