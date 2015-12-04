package org.univnantes.alma.services.banque.BanqueDomain.valueobject.impl;

import org.univnantes.alma.services.banque.API.valueobject.ICompte;

public class Compte implements ICompte {

	private double solde;
	private String IBAN;
	
	public Compte(double solde, String iban) {
		super();
		this.solde = solde;
		this.IBAN = iban;
	}

	public double getSolde() {
		return solde;
	}

	public String getIBAN() {
		return IBAN;
	}

}
