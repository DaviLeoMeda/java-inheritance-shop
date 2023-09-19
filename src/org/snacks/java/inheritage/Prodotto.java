package org.snacks.java.inheritage;

public class Prodotto {
	
	
		
		
		
		private String codice;
		private String nome;
		private String marca;
		private int prezzo;
		private int iva;
		
//		public String getAncora(){
//			
//			return ancora = false;
//		}
		
		public Prodotto(String codice, String nome, String marca, int prezzo, int iva) {
			this.codice = codice;
			setNome(nome);
			setMarca(marca);
			setPrezzo(prezzo);
			setIva(iva);
		}
		
		
		
		public String getCodice() {
			return codice;
		}
		
		
		//n----------------------- nome --------------------n//
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome= nome;
		}
	
		
		//n----------------------- marca --------------------n//
		
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
			this.marca= marca;
		}
		
		//n---------------------- prezzo ---------------------n//
		
		public int getPrezzo() {
			return prezzo;
		}
		
		public void setPrezzo(int prezzo) {
			this.prezzo= prezzo;
		}
		
		//n---------------------- iva ---------------------n//
		
		
		public int getIva() {
			return iva;
		}
		
		public void setIva(int iva) {
			this.iva= iva;
		}
		
		//n------------------------------------------------n//
		
		public int getPrezzoIntero() {
			return getPrezzo() + (getPrezzo() / 100 * getIva());
		}
		
//		public int getCosto() {
//			
//			return getPrezzo() + "+IVA | Prezzo complessivo: " +  
//		}
		
	}
	
//NN-------------------------------------------------------------------------------------------NN//
	
	
	
	
//NN-------------------------------------------------------------------------------------------NN//
	
	

	
	
	
	
	


