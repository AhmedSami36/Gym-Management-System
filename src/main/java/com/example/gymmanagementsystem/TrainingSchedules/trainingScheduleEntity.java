package com.example.gymmanagementsystem.TrainingSchedules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "training_schedule")
public class trainingScheduleEntity {
    @Id
    private int training_id;
}
