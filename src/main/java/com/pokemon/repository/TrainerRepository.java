package com.pokemon.repository;

import com.pokemon.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
    List<Trainer> findAll();
    Boolean deleteById(int id);
}
