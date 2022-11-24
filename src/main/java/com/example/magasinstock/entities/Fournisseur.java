package com.example.magasinstock.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

@Builder

public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFournisseur;
    private String codeFournisseur;

    private String libelleFourisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFourrisseur;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

    @OneToOne
    private DetailFournisseur detailFournisseur;

    @ManyToMany
    private Set<SecteurActivite> secteurActivites;

}
