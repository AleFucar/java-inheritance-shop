package org.lesson.java.shop;

public class Prodotto {
	
	private double codice = Math.random()*10000000;
	private String nome;
	private String descrizione;
	private double prezzo;
	public static double iva = 0.2;
	
	
	
	public String getNome() {
		return nome;
	}
	
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
		

	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public String setDescrizione(String descrizione) {
		this.descrizione = descrizione;
		return descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public double setPrezzo(double prezzo) {
		this.prezzo = prezzo;
		return prezzo;
		
	}
	
	public int getCodice() {
		
		int nuovoCodice = (int)codice;
		
		return nuovoCodice;
	}
	
	public double prezzoIvato() {
		
		double prezzoIvato = getPrezzo() * 1.22;
		
		return prezzoIvato;
		
	}

	
	


}