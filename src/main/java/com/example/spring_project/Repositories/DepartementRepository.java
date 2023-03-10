package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}
