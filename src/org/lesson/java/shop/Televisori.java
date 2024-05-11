package org.lesson.java.shop;

public class Televisori extends Prodotto {

	private double altezza;
	private double lunghezza;
	private boolean smart;
	
	/////////////////////////////////////
	//////////GETTER AND SETTER/////////
	///////////////////////////////////

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public String isSmart() {
		
		String isSmart;
		
		if (smart == true) {
			isSmart =  "La tv è Smart";
		}else {
		  isSmart = "La tv non è Smart";
		}
		
		return isSmart;
	}
	
	

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	

	/////////////////////////////////////////
	
	public Televisori(String nome, String marca, double prezzo, double altezza, double lunghezza, boolean smart) {
		super(nome, marca, prezzo);

		this.altezza = altezza;
		this.lunghezza = lunghezza;
		this.smart = smart;

	}

	@Override
	public String toString() {
		return super.toString() + "\nAltezza:" + getAltezza() + "\nLunghezza:" + getLunghezza() + "\nSmart:"
				+ isSmart();
	}


	
	
	

}
