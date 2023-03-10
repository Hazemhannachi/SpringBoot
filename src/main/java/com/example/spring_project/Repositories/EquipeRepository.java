package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
}
