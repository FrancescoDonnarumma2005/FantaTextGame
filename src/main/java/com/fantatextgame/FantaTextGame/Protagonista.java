package com.fantatextgame.FantaTextGame;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/** 
 * Classe che gestisce la lore dei vari giochi utillizzando 3 diversi file JSON
 * 
 *  @author Francesco Donnarumma
 * 	@author Vittoria Simonetti
 *	@author Giuseppe Liberato Serra
 *	@author Giuseppe Borzachiello
 *	@author Kevin Gargiulo
 *	@version 2.0.0
**/
public class Protagonista {
	
		
		protected boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		protected int numLivelloAttuale=0;
		JSONObject storia=new JSONObject();
		
		
		
		/**
		 * Costruttore che asseconda della storia che l'utente vuole avviare legge da un file json diverso
		 * @throws ParseException exception del JSONPARSER se non può convertire
		 * @throws IOException exception del FileReader se non trova il file
		 * @param sceltaAvventura scelta dell'avventura che si vuole giocare tra le disponibili*/
		public Protagonista(int sceltaAvventura) throws IOException, ParseException{
			JSONParser parser=new JSONParser();
			FileReader reader=null;
			if(sceltaAvventura==1) {
			 reader = new FileReader("src/resources/Jedi.json");
			}
			else if(sceltaAvventura==2) {
				reader = new FileReader("src/resources/Mago.json");
			}
			else if(sceltaAvventura==3) {
				reader = new FileReader("src/resources/Hobbit.json");
			}
			
	        Object obj = parser.parse(reader);
	        storia=new JSONObject();
	        storia= (JSONObject) obj;
		}
	
		
		/**ritorna la stringa dello scenario rispettivo al livello attuale leggendo dal file json
		 *@return la stringa dello scenario rispettivo al livello attuale  */
	    protected String getScenari() {
	       return (String)storia.get("scenario"+(numLivelloAttuale-1)); 
	    }
		
		
		/** un get che ritorna a seconda del livello attuale la risposta corretta corrispondente a quel livello leggendo dal file json
		 * @return la risposta corretta rispettiva allo scenario */
		
		protected int getCorrectChoise() {
			 Integer t=Integer.parseInt((String)storia.get("correctChoise"+(numLivelloAttuale-1)));
			 int t1=t;
			 return t1;
		}
		
		
				
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
		
		
		/**ritorna la stringa della risposta rispettiva alla scelta e al livello attuale
		 * @param scelta numero relativo alla scelta dello scenario a schermo
		 * @return la stringa della risposta rispettiva alla scelta e al livello attuale*/
		protected String getAnswer(int scelta) {
			return (String)storia.get("answer"+(numLivelloAttuale-1)+(scelta-1));
		}
		
		
		/**funzione che controlla se la scelta relativa allo scenario è corretta e stampa una risposta relativa scelta del giocatore
		 * @param scelta numero relativo alla scelta dello scenario a schermo
		 * @throws InvalidValueForGameScene lancia un eccezione se la scelta non è compresa tra 1 e 4
		 * @see Protagonista#getAnswer(int)*/
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
		/** ritorna il titolo del gioco leggendo da file json
		 * @return titolo del gioco*/
		protected String getTitolo() {
			return (String)storia.get("titolo");
		}
		
		/** ritorna il livello attuale del gioco leggendo da file json
		 * @return livello attuale del gioco*/
		public int getNumLivelloAttuale() {
			return numLivelloAttuale;
		}
		
		/** ritorna la trama del gioco leggendo da file json
		 * @return trama del gioco */
		protected String getTrama() {
			return (String)storia.get("trama");
		}
		
	

	}

