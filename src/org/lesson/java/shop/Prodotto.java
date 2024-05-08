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

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		this.nome = nome;
		return nome;

	}

	public String getMarca() {
		return marca;
	}

	public String setMarca(String marca) {
		this.marca = marca;
		return marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public double setPrezzo(double prezzo) {
		this.prezzo = prezzo;
		return prezzo;

	}

	public int getCodice() {

		int nuovoCodice = (int) codiceProdotto;

		return nuovoCodice;
	}

	public double prezzoIvato() {

		double prezzoIvato = getPrezzo() * 1.22;

		return prezzoIvato;

	}

	public String toString() {


		return " Nome: " + nome + "\n Marca: " + marca + "\n Prezzo: " + prezzoIvato() + "€" + "\n Codice Prodotto: " + getCodice();
	}

}