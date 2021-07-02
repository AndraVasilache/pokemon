package com.pokemon.controller;

import com.pokemon.model.Pokemon;
import com.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @PostMapping("/pokemons/create")
    public ResponseEntity<Object> create(@RequestBody Pokemon pokemon) {
        return pokemonService.create(pokemon);
    }
}
