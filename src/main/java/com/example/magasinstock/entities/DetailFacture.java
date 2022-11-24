package com.example.magasinstock.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVetailFacture;
    private int gteCommandee;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;

    @ManyToOne
    private Facture facture;

    @ManyToOne
    private Produit produit;
}
