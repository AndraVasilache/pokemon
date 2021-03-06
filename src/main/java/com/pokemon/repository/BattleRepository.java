package com.pokemon.repository;

import com.pokemon.model.Battle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BattleRepository extends JpaRepository<Battle, Integer> {
    List<Battle> findAll();
    Boolean deleteById(int id);
}
