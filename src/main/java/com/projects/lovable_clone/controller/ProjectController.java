package com.projects.lovable_clone.controller;

import com.projects.lovable_clone.Dto.project.ProjectRequest;
import com.projects.lovable_clone.Dto.project.ProjectResponse;
import com.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.projects.lovable_clone.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;


    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        Long UserId = 1L;
        return ResponseEntity.ok(projectService.getAllProjects(UserId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        Long UserId = 1L;
        return ResponseEntity.ok(projectService.getProjectById(id, UserId));
    }


    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request) {
        Long userId= 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request){
        Long userId = 1L;
        return ResponseEntity.ok((projectService.updateProject(id,request,userId)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        Long userId = 1L;
        projectService.softdelete(id,userId);
        return ResponseEntity.noContent().build();
    }
}
