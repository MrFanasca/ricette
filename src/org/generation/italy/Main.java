package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Scrivere un programma che consente di creare delle ricette personalizzate. All'avvio del programma è 
		 * presente un elenco di ingredienti predefiniti. Per ogni ingrediente è specificato:
		 * -nome dell'ingrediente
		 * -calorie per unità (gr o ml)
		 * L'utente inserisce il nome della ricetta, e sceglie tra l'elenco degli ingredienti disponibili (da 
		 * visualizzare) uno o più ingredienti, indicando:
		 * -nome dell'ingrediente
		 * -quantità
		 * Dopo ogni ingrediente chiedere se ne vuole aggiungere un altro.
		 * Alla fine dell'inserimento, mostrare il numero di calorie totali.
		 */
		
		Scanner sc = new Scanner(System.in);
		HashMap <String, Integer> ingredienti = new HashMap <>();
		ArrayList <String> ingredientiScelti = new ArrayList <>();
		
		float calorieTotali=0, calorie=0;
		int quantità;
		String altro, elemento, nomeRicetta;
		boolean presente;
		
		ingredienti.put("pane", 265);
		ingredienti.put("uovo", 128);
		ingredienti.put("avocado", 231);
		ingredienti.put("insalata", 15);
		ingredienti.put("pomodoro", 18);
		ingredienti.put("Hamburger di manzo", 305);
		ingredienti.put("bacon", 541);
		ingredienti.put("pomodorini secchi", 213);
		ingredienti.put("cheddar", 402);
		ingredienti.put("cetriolini", 11);
		
		System.out.println("Benvenuto Chef, questi sono gli ingredienti a disposizione");
		for(String t:ingredienti.keySet())
			System.out.println(t);

		do
		{
			presente=false;
			System.out.println("\nQuale ingrediente gradisci");
			elemento=sc.nextLine();
			if (ingredienti.containsKey(elemento))
			 	{
			 		presente=true;
				 	ingredientiScelti.add(elemento);
			 		System.out.println("Quanti grammi gradisci?");
			 		quantità=Integer.parseInt(sc.nextLine());
			 		calorie=quantità*(ingredienti.get(elemento)/100);
			 	}
			else
				System.out.println("Ingrediente non presente");
			calorieTotali=calorieTotali+calorie;
			System.out.println("Gradisci aggiungere altro? (s/n)");
			altro=sc.nextLine();
		}	while (altro.equals("s"));
		
		System.out.println("Come vorresti chiamare questa tua creazione?");
		nomeRicetta=sc.nextLine();
		System.out.println("\nPer la tua ricetta " + nomeRicetta + ", gli ingedienti scelti sono: ");
		for (String i:ingredientiScelti)
			System.out.println(i);
		System.out.println("Le calorie complessive sono: " + calorieTotali);
		sc.close();
	}

}
