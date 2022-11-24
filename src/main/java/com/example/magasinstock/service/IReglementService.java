package com.example.magasinstock.service;

import com.example.magasinstock.entities.Reglement;

import java.util.List;
import java.util.Set;

public interface IReglementService {
     Set<Reglement> retrieveReglementByFacture(Long idFacture);
}
