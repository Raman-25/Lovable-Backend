package com.projects.lovable_clone.Dto.project;

import java.time.Instant;

public record FileNode(

      String path,
      Instant modifiedAt,
      Long Size,
      String type

) {
}
