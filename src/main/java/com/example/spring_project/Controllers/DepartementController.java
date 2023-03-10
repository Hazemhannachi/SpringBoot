package com.example.spring_project.Controllers;

import com.example.spring_project.Entities.Departement;
import com.example.spring_project.Services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depart")
public class DepartementController {

    @Autowired
    DepartementService dp;

    @GetMapping("/getall")
    public List<Departement> retrieveAll() {
        return dp.retrieveAll();
    }
    @PutMapping("/update")
    public Departement update (@RequestBody Departement d)
    {
        return dp.update(d);
    }
    @PostMapping("/add")
    public  Departement add (@RequestBody Departement d)
    {
        return dp.add(d);
    }
    @GetMapping("/get/{id}")
    public Departement retrieve(@PathVariable(value = "id") int idDepart){
        return dp.retrieve(idDepart);
    }


}
