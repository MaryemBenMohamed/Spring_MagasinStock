package com.example.magasinstock.repository;

import com.example.magasinstock.entities.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReglementRepository extends JpaRepository<Reglement,Long> {
}
