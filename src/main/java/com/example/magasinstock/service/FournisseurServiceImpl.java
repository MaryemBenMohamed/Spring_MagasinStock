package com.example.magasinstock.service;

import com.example.magasinstock.entities.Fournisseur;
import com.example.magasinstock.entities.Produit;
import com.example.magasinstock.entities.SecteurActivite;
import com.example.magasinstock.entities.Stock;
import com.example.magasinstock.repository.FournisseurRepository;
import com.example.magasinstock.repository.SecteurActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements ICrudService<Fournisseur>,IFournisseurService{
    FournisseurRepository fournisseurRepository;
    SecteurActiviteRepository secteurActiviteRepository;
    @Override
    public Fournisseur add(Fournisseur object) {
        return fournisseurRepository.save(object);
    }

    @Override
    public Fournisseur update(Fournisseur object) {
        return fournisseurRepository.save(object);
    }

    @Override
    public void delete(long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public List<Fournisseur> getAll() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur getOne(long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

   @Override
   //@Transactional
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
       Fournisseur f=fournisseurRepository.findById(fournisseurId).orElse(null);
       SecteurActivite sec = secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
       f.getSecteurActivites().add(sec);
       fournisseurRepository.save(f); //ou @Transactional


    }
}
