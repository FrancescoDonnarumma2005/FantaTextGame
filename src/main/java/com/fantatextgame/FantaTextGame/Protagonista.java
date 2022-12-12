package com.fantatextgame.FantaTextGame;

import java.io.FileReader;
import java.util.Scanner;

public class Protagonista {
		
		public static boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		public static int numLivelloAttuale=0;
		private int numLivelloTotali=5;
		private String titolo;
		public String[] scenari=new String[2]; //Array di stringhe che conterranno le descrizioni con le scelte dei vari scenari per le prove sono 2 ma dovranno essere 5 alla fine
		private int[] CorrectAnswer=new int[2]; //array di stringhe che conterrà il numero corrispondente alla scelta corretta
		
		//costruttore che salva in un array di stringhe i vari scenari corrispondenti ai vari livelli
		public Protagonista(String nameFile){
			FileReader reader = new FileReader(nameFile);
			Scanner scanner =new Scanner(reader);
			
			scenari[0]="";
			scenari[1]="";
			//TODO inizializzare gli altri scenari
			
			//iterazione per poter copiare riga per riga lo scenario nella rispettiva stringa
			for (int i=0; i<2;i++) {
			while(scanner.hasNextLine()) {
				String line=scanner.nextLine();
				
				//se la riga equivale a $ capisce che lo scenario termina non salvando più nulla nella stringa
				if (line.equals("$")) { 
					break;
				}
				scenari[i]=scenari[i]+line+"\n";
			}

		}
			this.setCorrectAnswer(); //TODO un set che da il valore corrispondente alla soluzione ai rispettivi indici dell'array dell'omonima variabile 
			
		}
		
		//TODO un get che ritorna a econda del livello attuale la risposta corretta corrispondente a quel livello
		
		//TODO funzione che stampa il menu (vedere blueprint progetto)
		
		//TODO funzione che controlla le scelte del menu fatte dal giocatore
		

	}

