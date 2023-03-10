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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant ;
    private String prenomE ;
    private String nomE ;
    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(mappedBy = "etudiant")
    @JsonIgnore
    private List<Contrat> contrats;
    @ManyToOne
    @JsonIgnore
    private Departement departement;
    @ManyToMany (mappedBy = "etudiants")
    @JsonIgnore
    private List<Equipe> equipes ;

}
