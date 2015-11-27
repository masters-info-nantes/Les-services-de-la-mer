package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.domain.valueobject.impl;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.valueobject.ICompte;

public class Compte implements ICompte {

	private double solde;
	private String IBAN;
	
	public Compte(double solde, String iban) {
		super();
		this.solde = solde;
		this.IBAN = iban;
	}

	@Override
	public double getSolde() {
		return solde;
	}

	@Override
	public String getIBAN() {
		return IBAN;
	}

}
