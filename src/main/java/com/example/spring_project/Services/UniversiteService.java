package com.example.spring_project.Services;

import com.example.spring_project.Entities.Departement;
import com.example.spring_project.Entities.Universite;
import com.example.spring_project.Repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversiteService implements IService<Universite> {
    @Autowired
    UniversiteRepository universiteRepository;

    DepartementService d=new DepartementService();
    @Override
    public List<Universite> retrieveAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite add(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite update(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieve(int idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void remove(int idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }


    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = this.retrieve(idUniversite);
        Departement departement = d.retrieve(idDepartement);
        if (universite!= null && departement !=null){
            universite.getDepartements().add(departement);
        }
    }

    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = this.retrieve(idUniversite);
        return universite!=null ? universite.getDepartements(): null;
    }
}
