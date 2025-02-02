package com.example.gymmanagementsystem.Gym.Controllers;

import com.example.gymmanagementsystem.Gym.Models.gymEntity;
import com.example.gymmanagementsystem.Gym.Models.gymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gyms")
public class gymController {

    @Autowired
    private gymRepository gymRepo;

    @PostMapping("/create-gym")
    public gymEntity createGym(@RequestBody gymEntity gymEntity) {
       return gymRepo.save(gymEntity);
    }

    @GetMapping("/{gym_id}")
    public ResponseEntity<gymEntity> getGym(@PathVariable Long gym_id) {
        return gymRepo.findById(gym_id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
