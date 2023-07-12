package com.example.practice2.domain.presistence;

import com.example.practice2.domain.presistence.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
