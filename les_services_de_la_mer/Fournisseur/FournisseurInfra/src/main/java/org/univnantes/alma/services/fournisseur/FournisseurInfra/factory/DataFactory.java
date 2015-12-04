package org.univnantes.alma.services.fournisseur.FournisseurInfra.factory;

import org.univnantes.alma.services.fournisseur.FournisseurAPI.factory.IDataFactory;
import org.univnantes.alma.services.fournisseur.FournisseurAPI.valueobject.IProduit;
import org.univnantes.alma.services.fournisseur.FournisseurDomain.valueobject.impl.Produit;

public class DataFactory implements IDataFactory {

	public IProduit getProduit(String id, String nom, double prix, int quantite) {
		return new Produit(id,nom,prix,quantite);
	}

}
