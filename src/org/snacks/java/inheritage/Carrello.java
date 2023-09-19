package org.snacks.java.inheritage;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Carrello {
	
	public static void main(String[] args) {
		
		
//		Smartphone ItsSmartphone = new Smartphone(null, null, null, 0, 0, null, null);
//		Televisori ItsTelevisore = new Televisori (null, null, null, 0, 0, null, false);
//		Cuffie ItsCuffia = new Cuffie(null, null, null, 0, 0, null, false);
		
		Prodotto [] Carrello = new Prodotto[50];
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		String[] randomStrings = new String[5];
		
		Boolean ancora =  true;
		
		int i = 0;
		
		
		while(ancora) {
			
			System.out.print("Cosa vuoi inserire tra Televisori, Smartphone e Cuffie?");
			String selezione = sc.nextLine();
			
			String codice = null;
			String nome = null;
			String marca = null;
			String prezzo = null;
			String iva = null;
			
			String imei = null;
			String memoria = null;
			
			String dimensioni = null;
			
			String colore = null;
			
			switch(selezione) {
			case "smartphone": 
				System.out.print("smartphone");
				
				System.out.print("Inserisci codice prodotto");
				codice = sc.nextLine();
				
				System.out.println("Inserisci nome prodotto");
				nome = sc.nextLine();
				
				System.out.println("Inserisci marca prodotto");
				marca = sc.nextLine();
				
				System.out.println("Inserisci prezzo prodotto");
				prezzo = sc.nextLine();
				
				System.out.println("Inserisci iva prodotto");
				iva = sc.nextLine();
				
				System.out.println("Inserisci imei prodotto");
				imei = sc.nextLine();
				
				System.out.println("Inserisci memoria prodotto");
				memoria = sc.nextLine();
				
				Carrello [i] = new Smartphone(codice, nome, marca, Integer.parseInt(prezzo), Integer.parseInt(iva), imei, memoria);
				
				i++;
				
				break;
				
			case "televisioni":
				System.out.print("televisioni");
				
				System.out.println("Inserisci codice prodotto");
				codice = sc.nextLine();
				
				System.out.println("Inserisci nome prodotto");
				nome = sc.nextLine();
				
				System.out.println("Inserisci marca prodotto");
				marca = sc.nextLine();
				
				System.out.println("Inserisci prezzo prodotto");
				prezzo = sc.nextLine();
				
				System.out.println("Inserisci iva prodotto");
				iva = sc.nextLine();
				
				System.out.println("Inserisci dimensioni prodotto");
				dimensioni = sc.nextLine();
				
				System.out.println("Il prodotto è smart?");
				boolean isSmart = sc.nextBoolean();
				
				Carrello [i] = new Televisori(codice, nome, marca, Integer.parseInt(prezzo), Integer.parseInt(iva), dimensioni, isSmart);
				
				i++;
				
				break;
				
				
				
			case "cuffie": 
				System.out.print("cuffie");
				
				System.out.println("Inserisci codice prodotto");
				codice = sc.nextLine();
				
				System.out.println("Inserisci nome prodotto");
				nome = sc.nextLine();
				
				System.out.println("Inserisci marca prodotto");
				marca = sc.nextLine();
				
				System.out.println("Inserisci prezzo prodotto");
				prezzo = sc.nextLine();
				
				System.out.println("Inserisci iva prodotto");
				iva = sc.nextLine();
				
				System.out.println("Inserisci colore prodotto");
				colore = sc.nextLine();
				
				System.out.println("Il prodotto è wirefull?");
				boolean isWirefull = sc.nextBoolean();
				
				Carrello [i] = new Cuffie(codice, nome, marca, Integer.parseInt(prezzo), Integer.parseInt(iva), colore, isWirefull);
				
				i++;
				
				break;
				
			case "fine": 
				System.out.println("fine");
				ancora = false;
				break;
			}
		
//			if(selezione == "Smartphone") {
//				
//				System.out.print("Nome smartphone?");
//				String namePhone = sc.nextLine();
//				
//				System.out.print("Marca smartphone?");
//				String marcaPhone = sc.nextLine();
//				
//				System.out.print("Marca smartphone?");
//				float prezzoPhone = sc.nextInt();
//				
//				
//				
//				Smartphone Smart1 = new Smartphone(randomStrings, namePhone, marcaPhone, 0, 0, selezione, selezione);
			
			
				
//			}
			
		}
		
		sc.close();
		
		for(int x=0; x<Carrello.length; x++) {
		
			if(Carrello[x] != null) {
				System.out.println(Carrello[x]);
			}
			
		}
		
	}

}
