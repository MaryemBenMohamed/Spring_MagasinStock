package com.example.magasinstock.controller;

import com.example.magasinstock.entities.Facture;
import com.example.magasinstock.entities.Fournisseur;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class FournisseurController {

    private final ICrudService<Fournisseur> crudService;

    @PostMapping("/addFournisseur")
    public Fournisseur add(@RequestBody Fournisseur object) {
        return crudService.add(object);
    }

    @PostMapping("/updateFournisseur")
    public Fournisseur update(@RequestBody Fournisseur object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteFournisseur/{idFour}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAllFournisseur")
    public List<Fournisseur> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneFournisseur/{id}")
    public Fournisseur getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }
}
