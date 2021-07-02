package com.pokemon.controller;

import com.pokemon.model.Battle;
import com.pokemon.service.BattleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BattleController {
    private final BattleService battleService;

    @Autowired
    public BattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @PostMapping("/battles/create")
    public ResponseEntity<Object> create(@RequestBody Battle battle) {
        return battleService.create(battle);
    }

    @GetMapping("/battles")
    public ResponseEntity<Object> getAll() {
        return battleService.getAll();
    }
}
