package com.example.spring_project.Services;

import com.example.spring_project.Entities.Contrat;
import com.example.spring_project.Repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContratService implements IService<Contrat>{

    @Autowired
    ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat update(Contrat ce) {
        return contratRepository.save(ce);
    }
    @Override
    public Contrat add(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat retrieve(int idContrat) {
        return contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void remove(int idContrat) {
        contratRepository.deleteById(idContrat);
    }
}
