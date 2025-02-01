package com.example.gymmanagementsystem.TrainingProgress;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "training_progress")
public class trainingProgressEntity {

    @Id
    private int trainingProgressId;

}
