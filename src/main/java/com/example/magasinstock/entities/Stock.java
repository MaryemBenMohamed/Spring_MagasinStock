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
@ToString
@Builder
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock;
    private int qte;
    private int qteMin;
    private String libelleStock;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "stock")
    @ToString.Exclude
    private Set<Produit> produits;

}
