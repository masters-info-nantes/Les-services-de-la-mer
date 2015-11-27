package org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.infra.factory;

import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.factory.IDataFactory;
import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.valueobject.IProduit;
import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.domain.valueobject.impl.Produit;

public class DataFactory implements IDataFactory {

	public IProduit getProduit(String id, String nom, double prix, int quantite) {
		return new Produit(id,nom,prix,quantite);
	}

}
