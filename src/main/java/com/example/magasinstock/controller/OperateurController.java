package com.example.magasinstock.controller;

import com.example.magasinstock.entities.Fournisseur;
import com.example.magasinstock.entities.Operateur;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class OperateurController {

    private final ICrudService<Operateur> crudService;

    @PostMapping("/addOperateur")
    public Operateur add(@RequestBody Operateur object) {
        return crudService.add(object);
    }

    @PostMapping("/updateOperateur")
    public Operateur update(@RequestBody Operateur object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteOperateur/{idOp}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAllOperateur")
    public List<Operateur> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneOperateur/{id}")
    public Operateur getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }
}
