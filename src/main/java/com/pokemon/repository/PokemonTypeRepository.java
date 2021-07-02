package com.pokemon.repository;

import com.pokemon.model.PokemonType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonTypeRepository extends JpaRepository<PokemonType, Integer> {
    List<PokemonType> findAll();
}
