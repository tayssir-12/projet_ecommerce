package com.tekup.ecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity 
public class LigneCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;

	@ManyToOne 
	private Article artic ;


	private float prixTotale;

    private float quantite;


	@ManyToOne(cascade = CascadeType.ALL) 
	private Commande commande;



	public LigneCommande() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Article getArtic() {
		return artic;
	}
	public void setArtic(Article artic) {
		this.artic = artic;
	}
	public float getPrixTotale() {
		return prixTotale;
	}
	public void setPrixTotale(float prixTotale) {
		this.prixTotale = prixTotale;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	

}
