package com.example.magasinstock.controller;

import com.example.magasinstock.entities.CategorieProduit;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategorieProduitController {
    private final ICrudService<CategorieProduit> crudService;
    @PostMapping("/addCategorieProduit")
    public CategorieProduit add(@RequestBody CategorieProduit object) {
        return crudService.add(object);
    }

    @PutMapping("/updateCategorieProduit")
    public CategorieProduit update(@RequestBody CategorieProduit object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteCategorieProduit/{idCat}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAllCategorieProduit")
    public List<CategorieProduit> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneCategorieProduit/{id}")
    public CategorieProduit getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }
}
