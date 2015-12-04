package org.univnantes.alma.services.fournisseur.FournisseurAPI.valueobject;

public interface IProduit {
	public String getId();
	public String getNom();
	public double getPrix();
	public int getQuantite();
	public void setQuantite(int quantite);
}
