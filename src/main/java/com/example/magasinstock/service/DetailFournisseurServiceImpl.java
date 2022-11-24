package com.example.magasinstock.service;

import com.example.magasinstock.entities.DetailFournisseur;
import com.example.magasinstock.repository.DetailFournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailFournisseurServiceImpl implements ICrudService<DetailFournisseur> {
    DetailFournisseurRepository detailFournisseurRepository;
    @Override
    public DetailFournisseur add(DetailFournisseur object) {
        return detailFournisseurRepository.save(object);
    }

    @Override
    public DetailFournisseur update(DetailFournisseur object) {
        return detailFournisseurRepository.save(object);
    }

    @Override
    public void delete(long id) {
        detailFournisseurRepository.deleteById(id);
    }

    @Override
    public List<DetailFournisseur> getAll() {
        return detailFournisseurRepository.findAll();
    }

    @Override
    public DetailFournisseur getOne(long id) {
        return detailFournisseurRepository.findById(id).orElse(null);
    }
}
