package com.example.magasinstock.controller;

import com.example.magasinstock.entities.DetailFacture;
import com.example.magasinstock.entities.DetailFournisseur;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class DetailFournisseurController {
    private final ICrudService<DetailFournisseur> crudService;

    @PostMapping("/addDetailFournisseur")
    public DetailFournisseur add(@RequestBody DetailFournisseur object) {
        return crudService.add(object);
    }

    @PutMapping("/updateDetailFournisseur")
    public DetailFournisseur update(@RequestBody DetailFournisseur object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteDetailFournisseur/{idDetF}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }
    @GetMapping("/getAllDetailFournisseur")
    public List<DetailFournisseur> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneDetailFournisseur/{id}")
    public DetailFournisseur getOne(long id) {
        return crudService.getOne(id);
    }

}
