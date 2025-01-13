package com.example.gymmanagementsystem.Gym;
import com.example.gymmanagementsystem.Users.employee;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class gymEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gym_id;

    @Column(nullable = false,unique=true)
    private String gym_name;

    @Column(nullable = false,unique=true)
    private String gym_location;
    @Column(nullable = true,unique=true)
    private String gym_description;
//    @Column
//    @OneToMany(mappedBy = gymEntity, cascade = CascadeType.ALL)
//    private List<employee> gym_employees;
    
}
