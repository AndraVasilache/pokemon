package com.pokemon.controller;

import com.pokemon.model.PokemonType;
import com.pokemon.service.PokemonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonTypeController {
    private final PokemonTypeService pokemonTypeService;

    @Autowired
    public PokemonTypeController(PokemonTypeService pokemonTypeService) {
        this.pokemonTypeService = pokemonTypeService;
    }

    @PostMapping("/pokemons/types/create")
    public ResponseEntity<Object> create(@RequestBody PokemonType pokemonType) {
        return pokemonTypeService.create(pokemonType);
    }

    @GetMapping("/pokemons/types")
    public ResponseEntity<Object> getAll() {
        return pokemonTypeService.getAll();
    }

    @PutMapping("/pokemons/types")
    public ResponseEntity<Object> update(@RequestBody PokemonType pokemonType) {
        return pokemonTypeService.create(pokemonType);
    }
}
