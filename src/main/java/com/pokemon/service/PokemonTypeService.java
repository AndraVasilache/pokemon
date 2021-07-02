package com.pokemon.service;

import com.pokemon.model.PokemonType;
import com.pokemon.model.Trainer;
import com.pokemon.repository.PokemonTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PokemonTypeService {
    private final PokemonTypeRepository pokemonTypeRepository;

    @Autowired
    public PokemonTypeService(PokemonTypeRepository pokemonTypeRepository) {
        this.pokemonTypeRepository = pokemonTypeRepository;
    }

    public ResponseEntity<Object> create(PokemonType pokemonType) {
        PokemonType pt = pokemonTypeRepository.save(pokemonType);
        return new ResponseEntity<>(pt, HttpStatus.OK);
    }

    public ResponseEntity<Object> getAll() {
        List<PokemonType> pokemonTypes = pokemonTypeRepository.findAll();
        return new ResponseEntity<>(pokemonTypes, HttpStatus.OK);
    }
}
