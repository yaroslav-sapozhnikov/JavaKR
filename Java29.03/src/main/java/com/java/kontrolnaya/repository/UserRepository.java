package com.java.kontrolnaya.repository;

import com.java.kontrolnaya.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>  {
}
