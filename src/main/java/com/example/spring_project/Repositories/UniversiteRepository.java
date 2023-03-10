package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
}
