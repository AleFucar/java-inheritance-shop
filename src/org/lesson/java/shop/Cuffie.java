package org.lesson.java.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean cablate;
	
	public Cuffie(String nome, String marca, double prezzo, String colore, boolean cablate) {
		super(nome, marca, prezzo);
		
		this.colore = colore;
		this.cablate = cablate;
		
	}
	
	/////////////////////////////////////
	//////////GETTER AND SETTER/////////
	///////////////////////////////////

	public String getColore() {
		return colore;
	}




	public void setColore(String colore) {
		this.colore = colore;
	}




	public String isCablate() {
		
		String isCablate;
		
		if (cablate == true) {
			isCablate = "Le cuffie sono dotate di cavo";
		}else {
			isCablate = "Le cuffie sono wireless";
		}
		
		return isCablate;
	}




	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}

///////////////////////////////////////////////////


	@Override
	public String toString() {
		return super.toString() + "\nColore: " + colore + "\nCablate/Wireless: " + isCablate();
	}
	
	

}
