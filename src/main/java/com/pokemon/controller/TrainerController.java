package com.pokemon.controller;

import com.pokemon.model.Trainer;
import com.pokemon.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping("/trainers/create")
    public ResponseEntity<Object> create(@RequestBody Trainer trainer) {
        return trainerService.create(trainer);
    }

    @GetMapping("/trainers")
    public ResponseEntity<Object> getAll() {
        return trainerService.getAll();
    }

    @PutMapping("/trainers")
    public ResponseEntity<Object> update(@RequestBody Trainer trainer) {
        return trainerService.create(trainer);
    }

    @DeleteMapping("trainers/:id")
    public ResponseEntity<Object> delete(@RequestParam int id) {
        return trainerService.delete(id);
    }
}
