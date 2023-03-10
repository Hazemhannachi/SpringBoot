package com.example.spring_project.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private int montantContrat;
    @ManyToOne
    private Etudiant etudiant;

}
