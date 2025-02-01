package com.example.gymmanagementsystem.Equipments.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "equipments")
public class equipmentEntity {
    @Id
    private int equipment_id;
}
