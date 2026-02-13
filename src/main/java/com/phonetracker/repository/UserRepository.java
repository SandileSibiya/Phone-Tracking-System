package com.phonetracker.repository;

import com.phonetracker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId (Long id);
    User findByEmail (String email);
}
