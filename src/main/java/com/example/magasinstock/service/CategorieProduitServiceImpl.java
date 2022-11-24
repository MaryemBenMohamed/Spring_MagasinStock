package com.example.magasinstock.service;

import com.example.magasinstock.entities.CategorieProduit;
import com.example.magasinstock.repository.CategorieProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieProduitServiceImpl implements ICrudService<CategorieProduit>{
    CategorieProduitRepository categorieProduitRepository;


    @Override
    public CategorieProduit add(CategorieProduit object) {
        return categorieProduitRepository.save(object);
    }

    @Override
    public CategorieProduit update(CategorieProduit object) {
        return categorieProduitRepository.save(object);
    }

    @Override
    public void delete(long id) {
        categorieProduitRepository.deleteById(id);
    }

    @Override
    public List<CategorieProduit> getAll() {
        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit getOne(long id) {
        return categorieProduitRepository.findById(id).orElse(null);
    }
}
