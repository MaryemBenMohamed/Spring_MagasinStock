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
public class CategorieProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategorieProduit;
    private String codeProduit;
    private String libelleCategorieProduit;

    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produits;




}
