package com.pokemon.service;

import com.pokemon.model.Battle;
import com.pokemon.model.Trainer;
import com.pokemon.repository.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattleService {
    private final BattleRepository battleRepository;

    @Autowired
    public BattleService(BattleRepository battleRepository) {
        this.battleRepository = battleRepository;
    }

    public ResponseEntity<Object> create(Battle battle) {
        Battle b = battleRepository.save(battle);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    public ResponseEntity<Object> getAll() {
        List<Battle> battles = battleRepository.findAll();
        return new ResponseEntity<>(battles, HttpStatus.OK);
    }

    public ResponseEntity<Object> delete(int id) {
        Boolean response = battleRepository.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
