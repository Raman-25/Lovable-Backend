package com.projects.lovable_clone.Dto.project;

import lombok.*;

import java.time.Instant;

public record ProjectSummaryResponse(

      Long id,
      String name,
      Instant createdAt,
      Instant updatedAt
){
}
