package org.univnantes.alma.services.fournisseur.FournisseurAPI.factory;

import org.univnantes.alma.services.fournisseur.FournisseurAPI.valueobject.IProduit;

public interface IDataFactory {
	public IProduit getProduit(String id, String nom, double Prix, int quantite);
}
