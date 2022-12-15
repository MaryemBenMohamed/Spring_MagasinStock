package com.example.magasinstock.service;

import com.example.magasinstock.entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> getFacturesByFournisseur(Long idFournisseur);
    Facture addFacture(Facture f, Long idFournisseur);
    void cancelFacture(Long id);
}
