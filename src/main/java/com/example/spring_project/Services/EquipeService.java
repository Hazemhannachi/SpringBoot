package com.example.spring_project.Services;

import com.example.spring_project.Entities.Equipe;
import com.example.spring_project.Repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipeService implements IService<Equipe>{
    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAll() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe add(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe update(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieve(int idEquipe) {
        return equipeRepository.findById(idEquipe).orElse(null);
    }

    @Override
    public void remove(int idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }
}

