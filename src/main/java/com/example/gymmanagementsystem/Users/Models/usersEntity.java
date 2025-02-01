package com.example.gymmanagementsystem.Users.Models;

import com.example.gymmanagementsystem.DietPlans.dietPlanEntity;
import com.example.gymmanagementsystem.Subscriptions.subscriptionsEntity;
import com.example.gymmanagementsystem.Gym.Models.gymEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity(name = "Users")
public class usersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int usr_id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String usr_name;

    @Getter
    @Setter
    @Column(nullable = false)
    private Date birthDate;

    @Getter
    @Setter
    @Column(nullable = false)
    private String email;

    @Getter
    @Setter
    @Column(nullable = false)
    private String password;

    @Getter
    @Setter
    @Column(nullable = false)
    private String phone;

    @Getter
    @Setter
    @Column(nullable = false)
    private String gender;

    private enum Role{
        admin,
        trainer,
        trainee,
        employee
    }
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private gymEntity gym;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "diet_id")
    private dietPlanEntity dietPlan;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "subscription_id")
    private subscriptionsEntity subscription;



}
