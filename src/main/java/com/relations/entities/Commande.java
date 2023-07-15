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
public class Commande extends Parent {
private String produit;
private int quantite;
private String date;
private String etat;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "id_user")

private User user;
}
