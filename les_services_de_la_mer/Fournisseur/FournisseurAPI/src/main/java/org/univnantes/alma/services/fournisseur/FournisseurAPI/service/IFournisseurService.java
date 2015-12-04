package org.univnantes.alma.services.fournisseur.FournisseurAPI.service;

import java.util.List;

import org.univnantes.alma.services.fournisseur.FournisseurAPI.valueobject.*;

public interface IFournisseurService {
	public List<IProduit> listerProduits();
	public void reserverProduit(String idProduit, int quantite);
}
