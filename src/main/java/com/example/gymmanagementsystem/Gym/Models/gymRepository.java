package com.example.gymmanagementsystem.Gym.Models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gymRepository extends JpaRepository<gymEntity,Long> {
}
