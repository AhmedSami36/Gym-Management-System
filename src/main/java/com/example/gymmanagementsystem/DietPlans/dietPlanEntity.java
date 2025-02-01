package com.example.gymmanagementsystem.DietPlans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "diet_plan")
public class dietPlanEntity {

    @Id
    private int dietPlanId;
}
