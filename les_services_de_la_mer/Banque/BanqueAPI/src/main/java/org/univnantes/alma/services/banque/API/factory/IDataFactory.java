package org.univnantes.alma.services.banque.API.factory;

import org.univnantes.alma.services.banque.API.valueobject.ICompte;

public interface IDataFactory {
	public ICompte getCompte(String IBAN, double solde);
}
