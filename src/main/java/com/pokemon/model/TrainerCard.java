package com.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "trainer_cards")
public class TrainerCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int trainerId;
    private String team;
    private int power;
}
