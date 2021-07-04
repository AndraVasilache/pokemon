package com.pokemon.service;

import com.pokemon.model.TrainerCard;
import com.pokemon.repository.TrainerCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public ResponseEntity<Object> getAll() {
        List<TrainerCard> cards = trainerCardRepository.findAll();
        return new ResponseEntity<>(cards, HttpStatus.OK);
    }

    public ResponseEntity<Object> delete(int id) {
        Boolean response = trainerCardRepository.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
