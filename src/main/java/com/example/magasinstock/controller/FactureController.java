package com.example.magasinstock.controller;

import com.example.magasinstock.entities.DetailFournisseur;
import com.example.magasinstock.entities.Facture;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class FactureController {

    private final ICrudService<Facture> crudService;

    @PostMapping("/addFacture")
    public Facture add(@RequestBody Facture object) {
        return crudService.add(object);
    }

    @PutMapping("/updateFacture")
    public Facture update(@RequestBody Facture object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteFacture/{idFact}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAllFacture")
    public List<Facture> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneFacture/{id}")
    public Facture getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }
}
