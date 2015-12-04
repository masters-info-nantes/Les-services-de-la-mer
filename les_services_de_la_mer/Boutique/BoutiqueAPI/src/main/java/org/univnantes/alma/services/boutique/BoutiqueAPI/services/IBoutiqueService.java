package org.univnantes.alma.services.boutique.BoutiqueAPI.services;

import org.univnantes.alma.services.boutique.BoutiqueAPI.valueobject.IClient;

public interface IBoutiqueService {

	public IClient creerClient();
	public boolean effectuerPaiement(String nomCrediteur, double somme);
}
