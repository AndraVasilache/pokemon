package com.pokemon.service;

import com.pokemon.model.Trainer;
import com.pokemon.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public ResponseEntity<Object> create(Trainer trainer) {
        Trainer t = trainerRepository.save(trainer);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
}
