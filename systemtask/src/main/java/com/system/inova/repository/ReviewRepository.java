package com.system.inova.repository;

import com.system.inova.entity.Review;
import com.system.inova.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
