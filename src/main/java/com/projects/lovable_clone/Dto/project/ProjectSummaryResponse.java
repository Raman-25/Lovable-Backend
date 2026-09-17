package com.projects.lovable_clone.Dto.project;

import lombok.*;

import java.time.Instant;

@Data
public record ProjectSummaryResponse(

      Long id,
      String name,
      Long userId,
      Boolean isPublic,
      Instant createdAt,
      Instant updatedAt
){
}
