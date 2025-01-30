package com.example.gymmanagementsystem.Users.Models;

import com.example.gymmanagementsystem.Gym.Models.gymEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<gymEntity,Long> {
}
