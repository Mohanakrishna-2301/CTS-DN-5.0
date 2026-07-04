package com.exercise.repository;

import java.util.List;

import com.exercise.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
    List<User> findByName(String name);
}
