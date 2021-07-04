package com.pokemon.repository;

import com.pokemon.model.TrainerCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerCardRepository extends JpaRepository<TrainerCard, Integer> {
    List<TrainerCard> findAll();
    Boolean deleteById(int id);
}
