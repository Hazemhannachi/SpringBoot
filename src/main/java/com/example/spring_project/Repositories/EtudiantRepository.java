package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer>
{

}
