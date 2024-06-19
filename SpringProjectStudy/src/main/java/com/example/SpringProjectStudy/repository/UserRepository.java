package com.example.SpringProjectStudy.repository;

import com.example.SpringProjectStudy.model.User;
import com.example.SpringProjectStudy.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
