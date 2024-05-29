package com.example.Fitness_Tracker_App.adminManagement.persistence;

import com.example.Fitness_Tracker_App.adminManagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
}
