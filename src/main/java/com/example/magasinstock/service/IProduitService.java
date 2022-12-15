package com.example.magasinstock.service;

import com.example.magasinstock.entities.Produit;

public interface IProduitService {
    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);
    void assignProduitToStock(Long idProduit, Long idStock);

}
