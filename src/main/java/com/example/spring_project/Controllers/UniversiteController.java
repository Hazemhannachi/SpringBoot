package com.example.spring_project.Controllers;

import com.example.spring_project.Entities.Universite;

import com.example.spring_project.Services.UniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/Universite")
public class UniversiteController {
    @Autowired
    UniversiteService un;

    @GetMapping("/getall")
    public List<Universite> retrieveAll() {
        return un.retrieveAll();
    }

    @PutMapping("/update")
    public Universite update(@RequestBody Universite u) {
        return un.update(u);
    }

    @PostMapping("/add")
    public Universite add(@RequestBody Universite u) {
        return un.add(u);
    }

    @GetMapping("/get/{id}")
    public Universite retrieve(@PathVariable(value = "id") int idUniversite) {
        return un.retrieve(idUniversite);
    }
    @PostMapping("/assign")
    public void Universite (@PathParam(value = "univ")Integer idUniversite , @PathParam(value = "depart") Integer idDepartement){
         un.assignUniversiteToDepartement(idUniversite, idDepartement);
    };
}


