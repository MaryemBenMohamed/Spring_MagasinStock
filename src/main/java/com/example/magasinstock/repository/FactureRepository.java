package com.example.magasinstock.repository;

import com.example.magasinstock.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {
    List<Facture> findByFournisseurIdFourni(Long idFournisseur);

}
