package org.lesson.java.shop;

public class Smartphone extends Prodotto {
    
	private String codiceImei;
	public int memoria;

	

	public Smartphone(String nome, String marca, String codiceImei , int memoria , double prezzo) {
		super (nome, marca, prezzo);
		
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}
	
	
	public String toString() {
		
		return super.toString() + "\nCodice IMEI: " + codiceImei + "\nMemoria (in GB): " + memoria;
	}
	
}
