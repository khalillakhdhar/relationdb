package com.relations.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends Parent {
private String nom,email,mdp,grade,adresse;
@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,
mappedBy = "user"
		)

private Adresse adress;
@ManyToMany
@JoinTable(name = "usersBooks",joinColumns = @JoinColumn(name="author_id"),inverseJoinColumns = @JoinColumn(name="book_id"))
private Set<Books> books=new HashSet<Books>();

}
