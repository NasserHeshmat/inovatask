package com.system.inova.service.framework;

import com.system.inova.entity.Story;
import com.system.inova.entity.User;

public interface UserService {
    void addPost(Story story, Long userId);

    void addUser(User user);
}
