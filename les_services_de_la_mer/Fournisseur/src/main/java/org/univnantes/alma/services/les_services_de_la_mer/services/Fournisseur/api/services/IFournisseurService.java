package org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.services;

import java.util.List;

import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.valueobject.*;
public interface IFournisseurService {
	public List<IProduit> listerProduits();
	public String reserverProduit(String idProduit, int quantite);
}
