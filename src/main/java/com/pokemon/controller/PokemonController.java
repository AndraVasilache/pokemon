package com.pokemon.controller;

import com.pokemon.model.Pokemon;
import com.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/pokemons")
    public ResponseEntity<Object> getAll() {
        return pokemonService.getAll();
    }

    @PutMapping("/pokemons")
    public ResponseEntity<Object> update(@RequestBody Pokemon pokemon) {
        return pokemonService.create(pokemon);
    }

    @DeleteMapping("pokemons/:id")
    public ResponseEntity<Object> delete(@RequestParam int id) {
        return pokemonService.delete(id);
    }
}
