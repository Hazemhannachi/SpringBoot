package com.example.spring_project.Controllers;


import com.example.spring_project.Entities.Equipe;
import com.example.spring_project.Services.EquipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired

    EquipeService eq;
    @GetMapping("/getall")
    public List<Equipe> retrieveAll() {
        return eq.retrieveAll();
    }
    @PutMapping("/update")
    public Equipe update (@RequestBody Equipe e)
    {
        return eq.update(e);
    }
    @PostMapping("/add")
    public  Equipe add (@RequestBody Equipe e)
    {
        return eq.add(e);
    }
    @GetMapping("/get/{id}")
    public Equipe retrieve(@PathVariable(value = "id") int idEquipe){
        return eq.retrieve(idEquipe);
    }
}
