package org.snacks.java.inheritage;

public class Cuffie extends Prodotto {
	
	
	private String colore;
	private Boolean wirefull;
	
	public Cuffie(String codice, String nome, String marca, int prezzo, int iva, String colore, Boolean wirefull) {
		
		super(codice, nome, marca, prezzo, iva);
		
		setColore(colore);
		setWirefull(wirefull);
		
	
	//n---------------------- colore ---------------------n//	
		
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore= colore;
	}
	
	//n---------------------- wirefull ---------------------n//
	
	public Boolean getWirefull() {
		return wirefull;
	}
	
	public void setWirefull(Boolean wirefull) {
		this.wirefull= wirefull;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codice: " + this.getCodice() +  " Nome: " + this.getNome() + " Marca: " + this.getMarca() + " Prezzo : " + this.getPrezzo() + " Iva : " + this.getPrezzo() + " Colore : " + this.getColore() + " Memoria: " + this.getWirefull();
		


}}