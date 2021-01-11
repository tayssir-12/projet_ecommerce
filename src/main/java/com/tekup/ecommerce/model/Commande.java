package com.tekup.ecommerce.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id ;
private Date date ;
@ManyToOne 
private Utilisateur client ;
@OneToMany(mappedBy = "commande", cascade = CascadeType.ALL) 
private Set<LigneCommande> lignecommandes;
private float prix ;

public Commande() {
	
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Utilisateur getClient() {
	return client;
}

public void setClient(Utilisateur client) {
	this.client = client;
}

public Set<LigneCommande> getLignecommandes() {
	return lignecommandes;
}

public void setLignecommandes(Set<LigneCommande> lignecommandes) {
	this.lignecommandes = lignecommandes;
}

public float getPrix() {
	return prix;
}

public void setPrix(float prix) {
	this.prix = prix;
}


}
