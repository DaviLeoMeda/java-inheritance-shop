package org.snacks.java.inheritage;

public  class Smartphone extends Prodotto {
	
	
	private String IMEI;
	private String Memoria;
	
	public Smartphone(String codice, String nome, String marca, int prezzo, int iva, String IMEI, String Memoria) {
		
		super(codice, nome, marca, prezzo, iva);
		
		setImei(IMEI);
		setMemoria(Memoria);
		
		
		//n---------------------- IMEI ---------------------n//
		
	}
	
	public String getImei() {
		return IMEI;
	}
	
	public void setImei(String IMEI) {
		this.IMEI= IMEI;
	}
	
	//n---------------------- memoria ---------------------n//
	
	public String getMemoria() {
		return Memoria;
	}
	
	public void setMemoria(String Memoria) {
		this.Memoria= Memoria;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codice: " + this.getCodice() +  " Nome: " + this.getNome() + " Marca: " + this.getMarca() + " Prezzo : " + this.getPrezzo() + " Iva : " + this.getPrezzo() + " IMEI : " + this.getImei() + " Memoria: " + this.getMemoria();
		
		
		
	}
}

	
	

