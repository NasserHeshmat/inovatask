package com.system.inova.service.impl;

import com.system.inova.entity.Story;
import com.system.inova.entity.User;
import com.system.inova.repository.StoryRepository;
import com.system.inova.repository.UserRepository;
import com.system.inova.service.framework.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final StoryRepository storyRepository;
    private final UserRepository userRepository;

    @Override
    public void addPost(Story story, Long userId) {
        User user = userRepository.findById(userId).get();

        story.setUser(user);
        storyRepository.save(story);

    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }


}
