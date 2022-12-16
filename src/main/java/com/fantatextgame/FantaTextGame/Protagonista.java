package com.fantatextgame.FantaTextGame;

import java.io.FileReader;
import java.util.Scanner;

public class Protagonista {
		
		private boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		public static int numLivelloAttuale=0;
		private String titolo;
		public String[] scenari=new String[5]; //Array di stringhe che conterranno le descrizioni con le scelte dei vari scenari 
		private int[] CorrectAnswer=new int[2]; //array di stringhe che conterrà il numero corrispondente alla scelta corretta
		
		//costruttore che salva in un array di stringhe i vari scenari corrispondenti ai vari livelli
		public Protagonista(){
			scenari[0]="";
			scenari[1]="";
			scenari[2]="";
			scenari[3]="";
			scenari[4]="";
			//bisogna riempirli con i rispettivi scenari e scelte
			//this.setCorrectAnswer(); //TODO un set che da il valore corrispondente alla soluzione ai rispettivi indici dell'array dell'omonima variabile 
			
		}
		
		// un get che ritorna a seconda del livello attuale la risposta corretta corrispondente a quel livello
		
		private int getCorrectAnswer() {
			if (numLivelloAttuale==1) {
				return CorrectAnswer[0];
			}
			
			else {
			return CorrectAnswer[1];
			
		}
		}
		
		// funzione che stampa il menu (vedere blueprint progetto)
		
		public void Menu() {
			System.out.println("Stai giocando a " + titolo +" livello " + (numLivelloAttuale+1) + " digitare il numero corrispondente all’azione da fare.\n"+ 
					"1) Gioca\n" + 
					"2) Ritirati\n" + 
					"3) Riavvia da capo");
			}

		public boolean isRestarted() {
			return isRestarted;
		}

		public void setRestarted(boolean isRestarted) {
			this.isRestarted = isRestarted;
		}
		
		//TODO funzione che controlla le scelte del menu fatte dal giocatore
		
		
		

	}

