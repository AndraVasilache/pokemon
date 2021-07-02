package com.pokemon.service;

import com.pokemon.model.TrainerCard;
import com.pokemon.repository.TrainerCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TrainerCardService {
    private final TrainerCardRepository trainerCardRepository;

    @Autowired
    public TrainerCardService(TrainerCardRepository trainerCardRepository) {
        this.trainerCardRepository = trainerCardRepository;
    }

    public ResponseEntity<Object> create(TrainerCard trainerCard) {
        TrainerCard tc = trainerCardRepository.save(trainerCard);
        return new ResponseEntity<>(tc, HttpStatus.OK);
    }
}
