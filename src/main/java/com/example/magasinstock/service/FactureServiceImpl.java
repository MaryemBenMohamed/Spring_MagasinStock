package com.example.magasinstock.service;

import com.example.magasinstock.entities.Facture;
import com.example.magasinstock.entities.Fournisseur;
import com.example.magasinstock.repository.FactureRepository;
import com.example.magasinstock.repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FactureServiceImpl implements ICrudService<Facture>,IFactureService {
    FactureRepository factureRepository;

    FournisseurRepository fournisseurRepository;

    @Override
    public Facture add(Facture object) {
        return factureRepository.save(object);
    }

    @Override
    public Facture update(Facture object) {
        return factureRepository.save(object);
    }

    @Override
    public void delete(long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public List<Facture> getAll() {
        return factureRepository.findAll();
    }

    @Override
    public Facture getOne(long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        return factureRepository.findByFournisseurIdFourni(idFournisseur);

    }

    @Override
    public Facture addFacture(Facture f, Long idFournisseur) {
        Fournisseur fourni = fournisseurRepository.findById(idFournisseur).orElse(null);
        //f.setFournisseur(fourni);
        //fourni.getFactures().add(f);
        fourni.getFactures().add(f);
        return factureRepository.save(f);

    }
}
