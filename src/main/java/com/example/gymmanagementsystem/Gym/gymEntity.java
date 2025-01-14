package com.example.gymmanagementsystem.Gym;
import com.example.gymmanagementsystem.Users.employee;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Gym")
@Table(name = "Gym")
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

