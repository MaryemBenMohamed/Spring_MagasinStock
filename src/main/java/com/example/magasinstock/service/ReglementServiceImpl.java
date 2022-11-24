package com.example.magasinstock.service;

import com.example.magasinstock.entities.Facture;
import com.example.magasinstock.entities.Reglement;
import com.example.magasinstock.repository.FactureRepository;
import com.example.magasinstock.repository.ReglementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReglementServiceImpl implements ICrudService<Reglement>,IReglementService {
    ReglementRepository reglementRepository;
    FactureRepository factureRepository;
    @Override
    public Reglement add(Reglement object) {
        return reglementRepository.save(object);
    }

    @Override
    public Reglement update(Reglement object) {
        return reglementRepository.save(object);
    }

    @Override
    public void delete(long id) {
        reglementRepository.deleteById(id);
    }

    @Override
    public List<Reglement> getAll() {
        return reglementRepository.findAll();
    }

    @Override
    public Reglement getOne(long id) {
        return reglementRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Reglement> retrieveReglementByFacture(Long idFacture) {
        Facture facture = factureRepository.findById(idFacture).orElse(null);
        return facture.getReglements();
    }
}
