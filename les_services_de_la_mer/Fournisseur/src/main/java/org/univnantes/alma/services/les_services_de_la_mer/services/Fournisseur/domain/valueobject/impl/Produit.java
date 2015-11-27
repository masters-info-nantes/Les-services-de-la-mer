package org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.domain.valueobject.impl;

import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.valueobject.IProduit;

public class Produit implements IProduit {
	
	private String id;
	private String nom;
	private double prix;
	private int quantite;

	public Produit(String id, String nom, double prix, int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	public double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}

	public int getQuantite() {
		// TODO Auto-generated method stub
		return quantite;
	}

	public void setQuantite(int quantite) {
		// TODO Auto-generated method stub
		this.quantite = quantite;
	}

}
