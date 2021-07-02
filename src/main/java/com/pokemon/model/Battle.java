package com.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "battles")
public class Battle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="pokemon1_id")
    private int Pokemon1Id;
    @Column(name="pokemon2_id")
    private int Pokemon2Id;

    private String arenaType;
    private Date date;
}
