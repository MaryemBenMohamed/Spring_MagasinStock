package com.example.magasinstock.controller;

import com.example.magasinstock.entities.Operateur;
import com.example.magasinstock.entities.Produit;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProduitController {

    private final ICrudService<Produit> crudService;

    @PostMapping("/addProd")
    public Produit add(@RequestBody Produit object) {
        return crudService.add(object);
    }

    @PutMapping("/updateProd")
    public Produit update(@RequestBody Produit object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteProd/{idProd}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }
    @GetMapping("/getAllProd")
    public List<Produit> getAll() {
        return crudService.getAll();
    }
    @GetMapping("/getOneProd/{id}")
    public Produit getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }
}
