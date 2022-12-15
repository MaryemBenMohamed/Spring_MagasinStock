package com.example.magasinstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

@Builder
public class DetailFournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;

    @OneToOne(mappedBy = "detailFournisseur")
    @JsonIgnore  //bech njibou detail m3a lfournisseur mouch l3akes
    private Fournisseur fournisseur;

}
