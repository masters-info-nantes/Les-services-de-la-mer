package org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.factory;

import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.valueobject.IProduit;

public interface IDataFactory {
	public IProduit getProduit(String id, String nom, double Prix, int quantite);
}
