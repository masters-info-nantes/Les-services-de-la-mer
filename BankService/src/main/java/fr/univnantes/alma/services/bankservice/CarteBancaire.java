package fr.univnantes.alma.services.bankservice;

public class CarteBancaire {
	private String numero;
	private String cryptogramme;
	private double capital;
	private String devise;
	
	public CarteBancaire(String numero, String cryptogramme, double capital, String devise) {
		super();
		this.numero = numero;
		this.cryptogramme = cryptogramme;
		this.capital = capital;
		this.devise = devise;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCryptogramme() {
		return cryptogramme;
	}

	public void setCryptogramme(String cryptogramme) {
		this.cryptogramme = cryptogramme;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}
	
}
