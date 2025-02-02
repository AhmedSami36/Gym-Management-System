package com.example.gymmanagementsystem.DietPlans.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "diet_plan")
public class dietPlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dietPlanId;

    @Getter
    @Setter
    @Column(nullable = false)
    private String dietPlanName;

    @Getter
    @Setter
    @Column(nullable = false)
    private String dietPlanDescription;
}
