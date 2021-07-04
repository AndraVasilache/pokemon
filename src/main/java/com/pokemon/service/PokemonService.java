package com.pokemon.service;

import com.pokemon.model.Pokemon;
import com.pokemon.model.Trainer;
import com.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public ResponseEntity<Object> getAll() {
        List<Pokemon> pokemons = pokemonRepository.findAll();
        return new ResponseEntity<>(pokemons, HttpStatus.OK);
    }

    public ResponseEntity<Object> delete(int id) {
        Boolean response = pokemonRepository.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
