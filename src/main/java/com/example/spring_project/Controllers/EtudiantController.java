package com.example.spring_project.Controllers;

import com.example.spring_project.Entities.Etudiant;
import com.example.spring_project.Services.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    ServiceImp s ;

    @GetMapping("/getall")
    public List<Etudiant> retrieveAllEtudiants() {
        return s.retrieveAll();
    }
    @PostMapping("/addetu")
    public  Etudiant addEtudiant (@RequestBody Etudiant e)
    {
        return s.add(e);
    }

    @PutMapping("/updateetud")
    public Etudiant updateEtudiant (@RequestBody Etudiant e)
    {
        return s.update(e);
    }
    @GetMapping("/getetud/{id}")
    public Etudiant retrieveEtudiant(@PathVariable(value = "id") int idEtudiant){
        return s.retrieve(idEtudiant);
    }
    @DeleteMapping("/supp/{id}")
    public void removeEtudiant(@PathVariable (value = "id") int idEtudiant)
    {
        s.remove(idEtudiant);
    }

    }
