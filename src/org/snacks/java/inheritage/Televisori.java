package org.snacks.java.inheritage;

public class Televisori extends Prodotto {
	
	
	private String dimensioni;
	private Boolean smart;
	
	public Televisori(String codice, String nome, String marca, int prezzo, int iva, String dimensioni, Boolean smart) {
		
		super(codice, nome, marca, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmart(smart);
		
	
	//n---------------------- dimensioni ---------------------n//	
		
	}
	
	public String getDimensioni() {
		return dimensioni;
	}
	
	public void setDimensioni(String dimensioni) {
		this.dimensioni= dimensioni;
	}
	
	//n---------------------- smart --------------------------n//
	
	public Boolean getSmart() {
		return smart;
	}
	
	public void setSmart(Boolean smart) {
		this.smart= smart;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codice: " + this.getCodice() +  " Nome: " + this.getNome() + " Marca: " + this.getMarca() + " Prezzo : " + this.getPrezzo() + " Iva : " + this.getPrezzo() + " Dimensioni : " + this.getDimensioni() + " Smart: " + this.getSmart();
		
}}
