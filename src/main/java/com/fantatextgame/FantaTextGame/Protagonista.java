package com.fantatextgame.FantaTextGame;

import java.io.FileReader;
import java.util.Scanner;

public class Protagonista {
		
		private boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		public static int numLivelloAttuale=0;
		private String titolo;
		public String[] scenari=new String[5]; //Array di stringhe che conterranno le descrizioni con le scelte dei vari scenari 
		private int[] CorrectAnswer=new int[5]; //array di stringhe che conterrà il numero corrispondente alla scelta corretta
		
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
			
			else if(numLivelloAttuale==2) {
			return CorrectAnswer[1];
			
		}
			else if(numLivelloAttuale==3) {
				return CorrectAnswer[2];
				
			}
			else if(numLivelloAttuale==4) {
				return CorrectAnswer[3];
				
			}
			else {
				return CorrectAnswer[4];
				
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
		
		//setta il numero corrispondente alla scelta giusta
		private void setCorrectAnswer() {
	        CorrectAnswer[0]=1;
	        CorrectAnswer[1]=2;
	        CorrectAnswer[2]=1;
	        CorrectAnswer[3]=2;
	        CorrectAnswer[4]=2; //il numero assegnato è solo dimostrativo
	    }
		
		//funzione che controlla se la scelta relativa allo scenario è corretta
		public void isCorrectChoise(int scelta) throws Exception {
	        if (scelta==this.getCorrectAnswer()) {
	        System.out.println("BRAVO CE L’HAI FATTA!");
	        }
	        else if(scelta>4 && scelta<1) {
	            throw new Exception();
	        }
	        else {
	            System.out.println("HAI PERSO, RISPOSTA SBAGLIATA, SEI STATO ANNIENTATO!");
	            System.exit(0);
	        }
	    }
		

	}

