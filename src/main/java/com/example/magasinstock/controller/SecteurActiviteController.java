package com.example.magasinstock.controller;

import com.example.magasinstock.entities.Operateur;
import com.example.magasinstock.entities.SecteurActivite;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SecteurActiviteController {
    private final ICrudService<SecteurActivite> crudService;

    @PostMapping("/addSec")
    public SecteurActivite add(@RequestBody SecteurActivite object) {
        return crudService.add(object);
    }

    @PutMapping("/updateSec")
    public SecteurActivite update(@RequestBody SecteurActivite object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteSec/{idSec}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAllSec")
    public List<SecteurActivite> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneSec/{id}")
    public SecteurActivite getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }

}
