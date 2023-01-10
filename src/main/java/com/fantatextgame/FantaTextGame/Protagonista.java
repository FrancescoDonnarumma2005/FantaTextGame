package com.fantatextgame.FantaTextGame;

import java.io.FileReader;
import java.util.Scanner;

/** 
 * Classe che gestisce la lore del gioco e le scelte prese riguardanti il gioco stesso 
 * 
 *  @author Francesco Donnarumma
 * 	@author Vittoria Simonetti
 *	@author Giuseppe Liberato Serra
 *	@author Giuseppe Borzachiello
 *	@author Kevin Gargiulo
 *	@version 1.9.8
**/
public abstract class Protagonista {
	
		
		protected boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		protected int numLivelloAttuale=0;
		protected String titolo;
		protected String[] scenari=new String[5]; //Array di stringhe che contiene le descrizioni con le scelte dei vari scenari 
		protected int[] correctChoises=new int[5]; //array di stringhe che contiene il numero corrispondente alla scelta corretta
		protected String trama;
		protected String[][] answer=new String[5][4];
		
		
		
		/**costruttore che lancia i metodi 
		 *{@link Protagonista#setScenari() setScenari()}, {@link Protagonista#setCorrectChoise() setCorrectAnswer()}, {@link Protagonista#setTitolo() setTitolo()}, {@link Protagonista#setTrama() setTrama()}
		 *e {@link Protagonista#setAnswer() setAnswer()}*/
		public Protagonista(){
			
			this.setScenari();
			this.setCorrectChoise(); 
			this.setTitolo();
			this.setTrama();
			this.setAnswer();
			
		}
		/**Setta in un array di stringhe i vari scenari corrispondenti ai vari livelli */
		protected abstract void setScenari();
		
		/**ritorna la stringa dello scenario rispettivo al livello attuale
		 *@return la stringa dello scenario rispettivo al livello attuale  */
	    protected String getScenari() {
	       return scenari[numLivelloAttuale-1]; 
	    }
		
		
		/** un get che ritorna a seconda del livello attuale la risposta corretta corrispondente a quel livello 
		 * @return la risposta corretta rispettiva allo scenario */
		
		protected int getCorrectChoise() {
			return correctChoises[numLivelloAttuale-1];
		}
		
		
		/**setta il numero corrispondente alla scelta giusta */
				protected abstract void setCorrectChoise();
				
		/**funzione che stampa il menu e la trama se il livello è 0 o se il gioco è stato restartato 
		 * @see Protagonista#getTrama()
		 * @see Protagonista#getTitolo()*/
		
		public void Menu() {
			if(numLivelloAttuale==0 || isRestarted) {
				System.out.println(this.getTrama());
			}
			System.out.println("Stai giocando a " + this.getTitolo() +" livello " + (numLivelloAttuale+1) + " digitare il numero corrispondente all’azione da fare.\n"+ 
					"1) Gioca\n" + 
					"2) Ritirati\n" + 
					"3) Riavvia da capo");
			}
		/** @return true se il giocatore sceglie di restartare il gioco*/
		public boolean isRestarted() {
			return isRestarted;
		}
		
		/**setta la risposta relativa alle scelte prese dal giocatore riguardanti i vari scenari*/
		protected abstract void setAnswer();
		/**ritorna la stringa della risposta rispettiva alla scelta e al livello attuale
		 * @param scelta numero relativo alla scelta dello scenario a schermo
		 * @return la stringa della risposta rispettiva alla scelta e al livello attuale*/
		protected String getAnswer(int scelta) {
			return answer[numLivelloAttuale-1][scelta-1];
		}
		
		
		/**funzione che controlla se la scelta relativa allo scenario è corretta e stampa una risposta relativa scelta del giocatore
		 * @param scelta numero relativo alla scelta dello scenario a schermo
		 * @throws InvalidValueForGameScene lancia un eccezione se la scelta non è compresa tra 1 e 4
		 * @see Protagonista#getAnswer(scelta)*/
		public void isCorrectChoise(int scelta) throws InvalidValueForGameScene {
	        if (scelta==this.getCorrectChoise()) {
	        	System.out.println(this.getAnswer(scelta));
	        }
	        else if(scelta>4 && scelta<1) {
	        	throw new InvalidValueForGameScene();
	        }
	        else {
	        	System.out.println(this.getAnswer(scelta));
	            System.exit(0);
	        }
	    }
		
		/** funzione che gestisce le varie scelte prese dal giocatore:
		 * <UL><LI>Aumenta il livello attuale di 1 se la scelta è 1
		 * <LI>Stampa lo scenario relativo al livello se la scelta è 1
		 * <LI>Setta la variabile {@link Protagonista#isRestarted isRestarted} a true o a false se la scelta è uguale ad 1 o a 3
		 * <LI>Termina il programma se la scelta è 2
		 * </UL>
		 * @param scelta numero relativo alla scelta del menu a schermo
		 * @throws InvalidValueForGameMenu lancia un'eccezione se la scelta non è compresa tra 1 e 3*
		 * @see Protagonista#Menu()
		 * @see Protagonista#getScenari()
		 * */
		
		public void GameController(int scelta) throws InvalidValueForGameMenu {
	        switch (scelta) {
	        case 1: numLivelloAttuale++; System.out.println(this.getScenari()); isRestarted=false; break;
	        case 2: System.out.println("HAI PERSO PERCHE’ TI SEI RITIRATO"); System.exit(0); break;
	        case 3: numLivelloAttuale=0; isRestarted=true; break;
	        default: throw new InvalidValueForGameMenu(); 
	        
	   
	     }
	   }
		/** ritorna il titolo del gioco 
		 * @return titolo del gioco*/
		protected String getTitolo() {
			return titolo;
		}
		
		/** setta il titolo del gioco */
		protected abstract void setTitolo();
		/** ritorna il livello attuale del gioco 
		 * @return livello attuale del gioco*/
		protected int getNumLivelloAttuale() {
			return numLivelloAttuale;
		}
		
		/** ritorna la trama del gioco
		 * @return trama del gioco */
		protected String getTrama() {
			return trama;
		}
		/** setta la trama del gioco */
		protected abstract void setTrama();
		
	

	}

