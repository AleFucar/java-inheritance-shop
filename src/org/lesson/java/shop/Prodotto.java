package org.lesson.java.shop;

public class Prodotto {

	private double codiceProdotto = Math.random() * 10000000;
	private String nome;
	private String marca;
	private double prezzo;
	public static double iva = 0.2;
	
	
	public Prodotto(String nome, String marca, double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	
	public Prodotto(String name) {
		this.nome = name;
	}
	
	/////////////////////////////////////
	//////////GETTER AND SETTER/////////
	///////////////////////////////////

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
///////////////////////////////////////////////	

	public int getCodice() {

		int nuovoCodice = (int) codiceProdotto;

		return nuovoCodice;
	}

	public double prezzoIvato() {

		double prezzoIvato = getPrezzo() * 1.22;

		return prezzoIvato;

	}

	public String toString() {


		return "Nome: " + nome + "\nMarca: " + marca + "\nPrezzo: " + prezzoIvato() + "€" + "\nCodice Prodotto: " + getCodice();
	}

}