package com.example.magasinstock.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

@Builder
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    //@Temporal(TemporalType.TIMESTAMP) tet3ada par défaut akeka ta3tik date kemla b heure o seconde o kol  don nbedlouha bely fou9ha
    private Date dateDerniereModification;
    private boolean archivee;

    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglements;

    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;

    @ManyToOne
    private Fournisseur fournisseur;

}
