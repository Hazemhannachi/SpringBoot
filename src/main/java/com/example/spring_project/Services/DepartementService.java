package com.example.spring_project.Services;

import com.example.spring_project.Entities.Departement;
import com.example.spring_project.Repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartementService implements IService<Departement> {
    @Autowired
    DepartementRepository departementRepository;

    @Override
    public List<Departement> retrieveAll() {
        return departementRepository.findAll();
    }

    @Override
    public Departement add(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement update(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement retrieve(int idDepart) {
        return departementRepository.findById(idDepart).orElse(null);
    }

    @Override
    public void remove(int idDepart) {
        departementRepository.deleteById(idDepart);
    }
}
