package com.example.gymmanagementsystem.Users.Models;

import com.example.gymmanagementsystem.Gym.Models.gymEntity;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "Users")
public class usersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usr_id;

    @Column(nullable = false)
    private String usr_name;

    private Date birthDate;
    private String email;
    private String password;
    private String phone;
    private String gender;
    private String role;


    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private gymEntity gym;

    
}
