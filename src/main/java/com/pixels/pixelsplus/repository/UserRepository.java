package com.pixels.pixelsplus.repository;

import com.pixels.pixelsplus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
