package com.codeup.codeupspringblog.repositories;

import com.codeup.iconspringblog.models.User;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

