package org.univnantes.alma.services.fournisseur.FournisseurDomain.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.univnantes.alma.services.fournisseur.FournisseurAPI.service.IFournisseurService;
import org.univnantes.alma.services.fournisseur.FournisseurAPI.valueobject.IProduit;

public class FournisseurService implements IFournisseurService {
	private List<IProduit> listeProduits;
	private Map<String,Integer> stocks;
	
	public FournisseurService(){
		listeProduits = new ArrayList<IProduit>();
		stocks = new HashMap<String,Integer>();
	}
	
	public List<IProduit> listerProduits() {
		return listeProduits;
	}

	public void reserverProduit(String idProduit, int quantite) {
		stocks.put(idProduit, stocks.get(idProduit)-quantite);
		
	}

}
