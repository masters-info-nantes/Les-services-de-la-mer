package fr.univnantes.alma.services.bankservice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	List<CarteBancaire> listeCartes = new ArrayList<CarteBancaire>();
	
	public Bank(){
		listeCartes.add(new CarteBancaire("1234567891234567", "025", 1000, "eur"));
		listeCartes.add(new CarteBancaire("9876543210123456", "456", 1000, "eur"));
		listeCartes.add(new CarteBancaire("5896321478541230", "753", 1000, "usd"));
		listeCartes.add(new CarteBancaire("3579514268791301", "159", 1000, "usd"));
		listeCartes.add(new CarteBancaire("9988774455663322", "349", 1000, "jpy"));
		listeCartes.add(new CarteBancaire("3265987845120258", "167", 1000, "jpy"));
	}
	
	public CarteBancaire getCarte(String numero, String cryptogramme){
		for(CarteBancaire carte : listeCartes){
			if(numero.equalsIgnoreCase(carte.getNumero())&&cryptogramme.equalsIgnoreCase(carte.getCryptogramme())){
				return carte;
			}
		}
		return null;
	}
	
	public boolean debiterCompte(CarteBancaire carte, double montant){
		if(!(montant>carte.getCapital())){
			carte.setCapital(carte.getCapital()-montant);
			return true;
		}
		return false;
	}
	
	public boolean verifierCarte(String numero, String cryptograme){
		if(!numero.matches("[0-9]{16}")){
			return false;
		}
		if(!(cryptograme.matches("[0-9]{3}"))){
			return false;
		}
		return true;
	}
	
	public double convertir(double montant){
		return montant;
	}
	
	public boolean payer(String numero, String cryptograme, String devise, double montant){
		if(verifierCarte(numero, cryptograme)){
			double montant_reel=convertir(montant);
			return debiterCompte(getCarte(numero,cryptograme), montant_reel);
		}
		return false;
	}
}
