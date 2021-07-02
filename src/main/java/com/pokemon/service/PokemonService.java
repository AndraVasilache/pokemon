package com.pokemon.service;

import com.pokemon.model.Pokemon;
import com.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public ResponseEntity<Object> create(Pokemon pokemon) {
        Pokemon p = pokemonRepository.save(pokemon);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

}
