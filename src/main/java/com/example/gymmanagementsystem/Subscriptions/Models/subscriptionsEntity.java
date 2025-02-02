package com.example.gymmanagementsystem.Subscriptions.Models;

import com.example.gymmanagementsystem.DietPlans.Models.dietPlanEntity;
import com.example.gymmanagementsystem.TrainingSchedules.Models.trainingScheduleEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "subscriptions")
public class subscriptionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscription_id;

    @OneToOne
    @JoinColumn(name = "diet_plan")
    private dietPlanEntity diet_plan;

    @Getter
    @Setter
    @Column(nullable = false)
    private int price;

    @Getter
    @Setter
    @Column(nullable = false)
    private Date duration;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "trianing_schedule")
    private trainingScheduleEntity training_schedule;
}
