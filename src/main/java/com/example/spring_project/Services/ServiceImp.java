package com.example.spring_project.Services;

import com.example.spring_project.Entities.Etudiant;
import com.example.spring_project.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements IService <Etudiant>{
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant add(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant update(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieve(int idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void remove(int idEtudiant) {
      etudiantRepository.deleteById(idEtudiant);
    }
}
