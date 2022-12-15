package com.example.magasinstock.service;

import com.example.magasinstock.entities.CategorieProduit;
import com.example.magasinstock.entities.Produit;
import com.example.magasinstock.entities.Stock;
import com.example.magasinstock.repository.CategorieProduitRepository;
import com.example.magasinstock.repository.ProduitRepository;
import com.example.magasinstock.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ICrudService<Produit>, IProduitService {
    ProduitRepository produitRepository;
    StockRepository stockRepository;

    CategorieProduitRepository categorieProduitRepository;
    @Override
    public Produit add(Produit object) {
        return produitRepository.save(object);
    }

    @Override
    public Produit update(Produit object) {
        return produitRepository.save(object);
    }

    @Override
    public void delete(long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getOne(long id) {
        return produitRepository.findById(id).orElse(null);
    }


    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit categorieProduit = categorieProduitRepository.findById(idCategorieProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setCategorieProduit(categorieProduit);
        p.setStock(stock);
        return produitRepository.save(p);
   }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setStock(stock);
        produitRepository.save(p);

    }
}
