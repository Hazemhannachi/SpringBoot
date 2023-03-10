package com.example.spring_project.Controllers;

import com.example.spring_project.Entities.Contrat;
import com.example.spring_project.Services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratControllers {
    @Autowired
    ContratService c;
    @GetMapping("/getall")
    public List<Contrat> retrieveAll() {
        return c.retrieveAll();
    }
    @PutMapping("/update")
    public Contrat update (@RequestBody Contrat ce)
    {
        return c.update(ce);
    }
    @PostMapping("/add")
    public  Contrat add (@RequestBody Contrat ce)
    {
        return c.add(ce);
    }
    @GetMapping("/get/{id}")
    public Contrat retrieve(@PathVariable(value = "id") int idContrat){
        return c.retrieve(idContrat);
    }
    @DeleteMapping("/supp/{id}")
    public void remove(@PathVariable (value = "id") int idContrat)
    {
        c.remove(idContrat);
    }
}
