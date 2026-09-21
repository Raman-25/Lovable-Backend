package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.project.FileContentResponse;
import com.projects.lovable_clone.Dto.project.FileNode;
import com.projects.lovable_clone.service.FileService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public  List<FileNode> getFileTree(Long projectId, Long userId) {
        return null;
    }

    @Override
    public  FileContentResponse getFile(Long projectId, String path, Long userId) {
        return null;
    }
}
