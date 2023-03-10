package com.example.spring_project.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetaiEquipe;
    private String thematique;

    @OneToOne
    private Equipe equipe ;

}
