package com.sparta.review.repository;

import com.sparta.review.domain.User;
import com.sparta.review.domain.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
    UserTime findByUser(User user);
}