package com.example.spring_project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany
    @JsonIgnore
    private List<Etudiant> etudiants ;
    @OneToOne(mappedBy = "equipe",cascade = CascadeType.ALL)
    @JsonIgnore
    private DetailEquipe detailEquipe;
}
