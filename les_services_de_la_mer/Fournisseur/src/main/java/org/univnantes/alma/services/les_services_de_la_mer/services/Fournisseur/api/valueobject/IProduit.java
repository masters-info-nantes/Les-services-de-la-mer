package org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.valueobject;

public interface IProduit {
	public String getId();
	public String getNom();
	public double getPrix();
	public int getQuantite();
	public void setQuantite(int quantite);
}
