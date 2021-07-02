package com.pokemon.controller;

import com.pokemon.model.PokemonType;
import com.pokemon.model.TrainerCard;
import com.pokemon.service.TrainerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainerCardController {
    private final TrainerCardService trainerCardService;

    @Autowired
    public TrainerCardController(TrainerCardService trainerCardService) {
        this.trainerCardService = trainerCardService;
    }

    @PostMapping("/trainers/cards/create")
    public ResponseEntity<Object> create(@RequestBody TrainerCard trainerCard) {
        return trainerCardService.create(trainerCard);
    }

    @GetMapping("/trainers/cards")
    public ResponseEntity<Object> getAll() {
        return trainerCardService.getAll();
    }

    @PutMapping("/trainers/cards")
    public ResponseEntity<Object> update(@RequestBody TrainerCard trainerCard) {
        return trainerCardService.create(trainerCard);
    }
}
