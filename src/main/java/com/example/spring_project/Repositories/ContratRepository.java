package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}
