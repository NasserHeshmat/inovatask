package com.system.inova.service.impl;

import com.system.inova.entity.Story;
import com.system.inova.repository.StoryRepository;
import com.system.inova.service.framework.StoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;




@Service
@AllArgsConstructor
public class StoryServiceImpl implements StoryService {

    private final StoryRepository storyRepository;
    @Override
    public Page<Story> listStories(Pageable pageable) {
        return storyRepository.findAll(pageable);
    }

}
