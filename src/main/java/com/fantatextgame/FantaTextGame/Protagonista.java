package com.fantatextgame.FantaTextGame;

import java.io.FileReader;
import java.util.Scanner;

public class Protagonista {
		
		private boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		private int numLivelloAttuale=0;
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
			this.setCorrectAnswer(); 
			this.setTitolo("La leggenda della voragine");
			
		}
		
		//Stampa la stringa dello scenario rispettivo al livello
	    private void getScenari() {
	        if (numLivelloAttuale==1) {
	             System.out.println(scenari[0]);
	        }
	        else if (numLivelloAttuale==2) {
	            System.out.println(scenari[1]);
	        }
	        else if (numLivelloAttuale==3) {
	            System.out.println(scenari[2]);
	        }
	        else if (numLivelloAttuale==4) {
	            System.out.println(scenari[3]);
	        }
	        else if (numLivelloAttuale==5) {
	            System.out.println(scenari[4]);
	        }
	        
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
			System.out.println("Stai giocando a " + this.getTitolo() +" livello " + (this.getNumLivelloAttuale()+1) + " digitare il numero corrispondente all’azione da fare.\n"+ 
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
		
		//Controlla le varie scelte relative al menù
		
		public void GameController(int scelta) throws Exception {
	        switch (scelta) {
	        case 1: this.setNumLivelloAttuale(getNumLivelloAttuale()+1); this.getScenari(); isRestarted=false; break;
	        case 2: System.out.println("HAI PERSO PERCHE’ TI SEI RITIRATO"); System.exit(0); break;
	        case 3: this.setNumLivelloAttuale(0); isRestarted=true; break;
	        default: throw new Exception(); 
	        
	   
	     }
	   }

		private String getTitolo() {
			return titolo;
		}

		private void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public int getNumLivelloAttuale() {
			return numLivelloAttuale;
		}

		private void setNumLivelloAttuale(int numLivelloAttuale) {
			this.numLivelloAttuale = numLivelloAttuale;
		}
		
	

	}

