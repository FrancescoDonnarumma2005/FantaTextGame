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
 *	@version 1.3.6
**/
public class Protagonista {
	
		
		private boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		private int numLivelloAttuale=0;
		private String titolo;
		private String[] scenari=new String[5]; //Array di stringhe che contiene le descrizioni con le scelte dei vari scenari 
		private int[] CorrectAnswer=new int[5]; //array di stringhe che contiene il numero corrispondente alla scelta corretta
		//TODO variabile che contiene la trama 
		
		/**costruttore che lancia i metodi 
		 *{@link Protagonista#setScenari() setScenari()}, {@link Protagonista#setCorrectAnswer() setCorrectAnswer()} e {@link Protagonista#setTitolo(String)}*/
		public Protagonista(){
			
			this.setScenari();
			this.setCorrectAnswer(); 
			this.setTitolo("La leggenda della voragine");
			
		}
		/**Setta in un array di stringhe i vari scenari corrispondenti ai vari livelli */
		private void setScenari() {
			scenari[0]="Ti sei buttato nella voragine munito di uno zaino con delle provviste e una spada.\n" 
					+ "Ti ritrovi davanti dieci ragazzi appartenenti al ricco Erek Muller e cominciano ad attaccarvi. Cosa fai?\n\n" + 
					"1. Usa la corda che hai usato per scendere per risalire la voragine;\n" + 
					"2. Incoraggia i tuoi compagni e attacca con lo zaino delle provviste;\n" + 
					"3. Incoraggia i tuoi compagni e attacca con la spada;\n" + 
					"4. Cerca delle rocce per nasconderti.\n" + 
					"";
			scenari[1]="Tu e i tuoi compagni decidete di dividervi per ottimizzare il tempo.\n"
					+ "Mentre stai proseguendo ti trovi davanti un serpente a 3 teste di circa 4 metri. Cosa decidi di fare?\n\n" + 
					"1. Usa la tua spada e taglia una delle teste del serpente;\n" + 
					"2. Usa la tua spada e conficcala nel cuore del serpente;\n" + 
					"3. Scappa nella direzione opposta;\n" + 
					"4. Ti accovacci immobile sperando che il serpente non ti noti\n" + 
					"";
			scenari[2]="Il serpente che hai incontrato precedentemente ti ha raggiunto e sei in un vicolo cieco. Al tuo fianco hai un’ascia splendente. Cosa fai?\n\n" + 
					"1. Afferra l’ascia e fai un lancio deciso mirando alle teste\n" + 
					"2. Lancia lo zaino con le provviste oltre il serpente per creare un diversivo \n" + 
					"3. Usa la tua spada e combatti il serpente una volta per tutte\n" + 
					"4. Scappi ancora portando il serpente verso l'accampamento\n" + 
					"";
			scenari[3]="Improvvisamente, sul cammino verso il nuovo accampamento l’ascia inizia a fluttuare trasformandosi in una pala e\n"
					+ "conficcandosi in un punto specifico nel terreno. Cosa fai?\n\n" + 
					"1. Abbandona la pala per ricongiungerti con i tuoi compagni\n" + 
					"2. Inizia a scavare utilizzando la pala\n" + 
					"3. Prendi la pala per tornare dai tuoi compagni con la pala per potergli spiegare cos'è successo\n" + 
					"4. Usa la spada per rompere la pala\n" + 
					"";
			scenari[4]="Ti ritrovi una decina di metri più in basso rispetto a dove hai iniziato a scavare e hai davanti a te un anello.\n"
					+ "L'anello inizia a emettere una luce e a scrivere nell'aria con del fumo:\"Esprimi immediatamente il tuo desiderio,\n"
					+ "a nessun altro sarà concesso questo privilegio. GIOISCI!!\". Allo stesso tempo senti una voce venire dalla tua testa\n"
					+ "che ti ordina di chiedere ricchezza e potere per il tuo padrone. cosa fai?\n\n" + 
					"1. Riprendi la pala per iniziare a scavare l'uscita rifiutando di esprimere il desiderio\n" + 
					"2. Prova ad urlare per farti sentire dalle persone sopra e far sapere loro dell'oggetto magico\n" + 
					"3. Chiedi di esaudire il desiderio proveniente dalla tua testa udito poco prima\n" + 
					"4. Chiedi all'anello di salvare tutte le persone costrette alla voragine e\n " +
					"le famiglie a cui appartengono distruggendo l'enorme dislivello tra ricchi e poveri\n" + 
					"";
		}
		
		/**Stampa la stringa dello scenario rispettivo al livello */
	    private void getScenari() {
	       System.out.println(scenari[numLivelloAttuale-1]); 
	    }
		
		
		/** un get che ritorna a seconda del livello attuale la risposta corretta corrispondente a quel livello 
		 * @return la risposta corretta rispettiva allo scenario */
		
		private int getCorrectAnswer() {
			return CorrectAnswer[numLivelloAttuale-1];
		}
		
		
		/**setta il numero corrispondente alla scelta giusta */
				private void setCorrectAnswer() {
			        CorrectAnswer[0]=3;
			        CorrectAnswer[1]=3;
			        CorrectAnswer[2]=1;
			        CorrectAnswer[3]=2;
			        CorrectAnswer[4]=4; 
			    }
				
		/**funzione che stampa il menu */
		
		public void Menu() {
			System.out.println("Stai giocando a " + this.getTitolo() +" livello " + numLivelloAttuale+1 + " digitare il numero corrispondente all’azione da fare.\n"+ 
					"1) Gioca\n" + 
					"2) Ritirati\n" + 
					"3) Riavvia da capo");
			}
		/** @return true se il giocatore sceglie di restartare il gioco*/
		public boolean isRestarted() {
			return isRestarted;
		}

		
		
		
		/**funzione che controlla se la scelta relativa allo scenario è corretta
		 * @param scelta numero relativo alla scelta dello scenario a schermo
		 * @throws InvalidValueForGameScene lancia un eccezione se la scelta non è compresa tra 1 e 4*/
		public void isCorrectChoise(int scelta) throws InvalidValueForGameScene {
	        if (scelta==this.getCorrectAnswer()) {
	        	System.out.println("BRAVO CE L’HAI FATTA!");
	        }
	        else if(scelta>4 && scelta<1) {
	        	throw new InvalidValueForGameScene();
	        }
	        else {
	            System.out.println("HAI PERSO, RISPOSTA SBAGLIATA, SEI STATO ANNIENTATO!");
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
		 * */
		
		public void GameController(int scelta) throws InvalidValueForGameMenu {
	        switch (scelta) {
	        case 1: numLivelloAttuale++; this.getScenari(); isRestarted=false; break;
	        case 2: System.out.println("HAI PERSO PERCHE’ TI SEI RITIRATO"); System.exit(0); break;
	        case 3: numLivelloAttuale=0; isRestarted=true; break;
	        default: throw new InvalidValueForGameMenu(); 
	        
	   
	     }
	   }
		/** ritorna il titolo del gioco 
		 * @return titolo del gioco*/
		private String getTitolo() {
			return titolo;
		}
		
		/** setta il titolo del gioco 
		 * @param titolo titolo del gioco*/
		private void setTitolo(String titolo) {
			this.titolo = titolo;
		}
		/** ritorna il livello attuale del gioco 
		 * @return livello attuale del gioco*/
		public int getNumLivelloAttuale() {
			return numLivelloAttuale;
		}
		
		
		
		
	

	}

