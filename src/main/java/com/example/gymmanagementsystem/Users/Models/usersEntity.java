package com.example.gymmanagementsystem.Users.Models;

import com.example.gymmanagementsystem.Gym.Models.gymEntity;
import jakarta.persistence.*;

@Entity(name = "Users")
public class usersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usr_id;

    @Column(nullable = false)
    private String usr_name;

    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private gymEntity gym;
}
