package org.univnantes.alma.services.banque.API.services;

public interface IBanqueService {
	boolean payerEnLigne(String compte, double montant);
}
