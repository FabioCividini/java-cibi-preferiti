package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		//inizializzazione array
		String[] classificaCibi = {"Pizza" ,"Cozza gratinate" ,"Carbonara" ,"Astice" ,"Grigliata di carne" ,"Sushi" ,"Grigliata di pesce" ,"Formaggio e miele" ,"Risotto pere taleggio"};
		
		//lunghezza della classifica
		System.out.println("Numero totale classifica dei cibi preferiti: " + classificaCibi.length);
		
		//stampare il cibo top tra i preferiti
		System.out.println("Cibo top: " + classificaCibi[0]);
		
		//stampare il cibo meno top tra i preferiti
		System.out.println("Cibo meno top: " + classificaCibi[8]);
		
		//stampare il cibo di metà classifica
		System.out.println("Cibo di metà classifica: " + classificaCibi[4]);
	}

}
