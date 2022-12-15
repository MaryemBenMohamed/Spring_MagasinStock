package com.example.magasinstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

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
    //@Enumerated(EnumType.ORDINAL) ken les attributs sont des enties
    private CategorieFournisseur categorieFourrisseur;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

    @OneToOne(cascade=CascadeType.ALL)
    private DetailFournisseur detailFournisseur;

    @ManyToMany
    private Set<SecteurActivite> secteurActivites;

}
