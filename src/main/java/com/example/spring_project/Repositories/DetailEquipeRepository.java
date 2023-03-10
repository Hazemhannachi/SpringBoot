package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer> {
}
