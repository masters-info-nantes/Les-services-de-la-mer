package org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.domain.service.impl;

import java.util.List;

import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.services.IFournisseurService;
import org.univnantes.alma.services.les_services_de_la_mer.services.Fournisseur.api.valueobject.IProduit;

public class FournisseurService implements IFournisseurService {
	private List<IProduit> listeProduits;
	public List<IProduit> listerProduits() {
		// TODO Auto-generated method stub
		return listeProduits;
	}

	public String reserverProduit(String idProduit, int quantite) {
		// TODO Auto-generated method stub
		return null;
	}

}
