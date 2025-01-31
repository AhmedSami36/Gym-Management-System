package com.example.gymmanagementsystem.Gym.Models;
import jakarta.persistence.*;
import org.apache.catalina.User;
import com.example.gymmanagementsystem.Users.Models.usersEntity;

import java.util.ArrayList;
import java.util.List;

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

    /*@OneToMany(mappedBy = "gymEntity", cascade = CascadeType.ALL)
    private List<usersEntity> gym_users = new ArrayList<>();*/


}

