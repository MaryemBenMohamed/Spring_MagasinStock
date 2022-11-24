package com.example.magasinstock.controller;

import com.example.magasinstock.entities.Operateur;
import com.example.magasinstock.entities.Stock;
import com.example.magasinstock.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StockController {
    private final ICrudService<Stock> crudService;

    @PostMapping("/addStock")
    public Stock add(@RequestBody Stock object) {
        return crudService.add(object);
    }

    @PutMapping("/updateStock")
    public Stock update(@RequestBody Stock object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteStock")
    public void delete(@PathVariable long id) {
        crudService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Stock> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneStock/{id}")
    public Stock getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }

}
