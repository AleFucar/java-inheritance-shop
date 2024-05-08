package org.lesson.java.shop;

public class Smartphone extends Prodotto {
    
	private String codiceImei;
	public int memoria;

	

	public Smartphone(String nome, String marca, String codiceImei , int memoria , double codiceProdotto) {
		super (nome, marca, codiceProdotto);
		
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}
	
	
	public String toString() {
		
		return super.toString() + "\n Codice IMEI: " + codiceImei + "\n Memoria (in GB): " + memoria;
	}
	
}
