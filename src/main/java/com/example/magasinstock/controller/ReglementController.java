package com.example.magasinstock.controller;

import com.example.magasinstock.entities.Operateur;
import com.example.magasinstock.entities.Reglement;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReglementController {
    private final ICrudService<Reglement> crudService;

    @PostMapping("/addReg")
    public Reglement add(@RequestBody Reglement object) {
        return crudService.add(object);
    }

    @PutMapping("/updateReg")
    public Reglement update(@RequestBody Reglement object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteReg/{idReg}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAllReg")
    public List<Reglement> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneReg/{id}")
    public Reglement getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }


}
