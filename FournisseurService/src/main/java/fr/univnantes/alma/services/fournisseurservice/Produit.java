package fr.univnantes.alma.services.fournisseurservice;

public class Produit {
	private String id;
	private String nom;
	private double prix;
	private Boolean reserve;
	
	public Produit(String id, String nom, double prix) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.reserve = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Boolean getReserve() {
		return reserve;
	}

	public void setReserve(Boolean reserve) {
		this.reserve = reserve;
	}
	
}
