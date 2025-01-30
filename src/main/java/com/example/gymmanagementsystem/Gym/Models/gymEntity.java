package com.example.gymmanagementsystem.Gym.Models;
import jakarta.persistence.*;

@Entity(name = "Gym")
public class gymEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gym_id;

    @Column(nullable = false, unique = true)
    private String gym_name;

    @Column(nullable = false, unique = true)
    private String gym_location;
    @Column(nullable = true, unique = true)
    private String gym_description;



}

