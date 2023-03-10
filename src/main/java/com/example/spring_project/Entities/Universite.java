package com.example.spring_project.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter


public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniv;
    private String nomUniv;

    @OneToMany
    private List<Departement> departements;
}
