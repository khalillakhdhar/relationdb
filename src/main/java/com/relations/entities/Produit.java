package com.relations.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit extends Parent {
private String titre,photo,description;
private double prix;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(referencedColumnName = "title", name = "categorie")
private Categorie categorie;


}
