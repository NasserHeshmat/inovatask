package com.system.inova.controller;

import com.system.inova.entity.Story;
import com.system.inova.service.framework.StoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor
public class StoryContoller {

    private final StoryService storyService;



    @GetMapping("/stories")
    public Page<Story> getStories(Pageable pageable) {
        return storyService.listStories(pageable);
    }
}
