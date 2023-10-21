package com.system.inova.service.framework;

import com.system.inova.entity.Story;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface StoryService {
    Page<Story> listStories(Pageable pageable);
}
