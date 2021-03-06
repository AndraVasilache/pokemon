package com.pokemon.repository;

import com.pokemon.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    List<Pokemon> findAll();
    Boolean deleteById(int id);
}
