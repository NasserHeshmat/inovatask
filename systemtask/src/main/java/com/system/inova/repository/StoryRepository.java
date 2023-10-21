package com.system.inova.repository;

import com.system.inova.entity.Story;
import com.system.inova.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story,Long> {
}
