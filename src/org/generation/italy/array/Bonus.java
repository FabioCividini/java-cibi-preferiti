package org.generation.italy.array;

public class Bonus {

	public static void main(String[] args) {
		//inizializzazione array
		String[] classificaCibi = {"Pizza" ,"Cozza gratinate" ,"Carbonara" ,"Astice" ,"Grigliata di carne" ,"Sushi" ,"Grigliata di pesce" ,"Formaggio e miele" ,"Risotto pere taleggio"};
				
		//lunghezza della classifica
		System.out.println("Numero totale classifica dei cibi preferiti: " + classificaCibi.length);
				
		//stampare il cibo top tra i preferiti
		System.out.println("Cibo top: " + classificaCibi[classificaCibi.length *0]);
				
		//stampare il cibo meno top tra i preferiti
		System.out.println("Cibo meno top: " + classificaCibi[classificaCibi.length -1]);
		
		//stampare il cibo di met� classifica
		System.out.println("Cibo di met� classifica: " + classificaCibi[classificaCibi.length /2]);

	}

}
