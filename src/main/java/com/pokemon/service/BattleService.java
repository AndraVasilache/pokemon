package com.pokemon.service;

import com.pokemon.model.Battle;
import com.pokemon.repository.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
}
