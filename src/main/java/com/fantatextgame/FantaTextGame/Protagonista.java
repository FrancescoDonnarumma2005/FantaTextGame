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
 *	@version 1.9.6
**/
public class Protagonista {
	
		
		private boolean isRestarted=false; //attributo che potrebbe trovare la propria utilità nel main per controllare se l'utente sceglie di restartare
		private int numLivelloAttuale=0;
		private String titolo;
		private String[] scenari=new String[5]; //Array di stringhe che contiene le descrizioni con le scelte dei vari scenari 
		private int[] correctChoises=new int[5]; //array di stringhe che contiene il numero corrispondente alla scelta corretta
		private String trama;
		private String[][] answer=new String[5][4];
		
		
		
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
					"3. Prendi la pala per tornare dai tuoi compagni e spiegare loro cos'è successo\n" + 
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
		
		/**ritorna la stringa dello scenario rispettivo al livello attuale
		 *@return la stringa dello scenario rispettivo al livello attuale  */
	    private String getScenari() {
	       return scenari[numLivelloAttuale-1]; 
	    }
		
		
		/** un get che ritorna a seconda del livello attuale la risposta corretta corrispondente a quel livello 
		 * @return la risposta corretta rispettiva allo scenario */
		
		private int getCorrectChoise() {
			return correctChoises[numLivelloAttuale-1];
		}
		
		
		/**setta il numero corrispondente alla scelta giusta */
				private void setCorrectChoise() {
			        correctChoises[0]=3;
			        correctChoises[1]=3;
			        correctChoises[2]=1;
			        correctChoises[3]=2;
			        correctChoises[4]=4; 
			    }
				
		/**funzione che stampa il menu e la trama se il livello è 0 o se il gioco è stato restartato 
		 * @see Protagonista#getTrama()
		 * @see Protagonista#getTitolo()*/
		
		public void Menu() {
			if(numLivelloAttuale==0 || isRestarted) {
				System.out.println(this.getTrama());
			}
			System.out.println("Stai giocando a " + this.getTitolo() +" livello " + numLivelloAttuale+1 + " digitare il numero corrispondente all’azione da fare.\n"+ 
					"1) Gioca\n" + 
					"2) Ritirati\n" + 
					"3) Riavvia da capo");
			}
		/** @return true se il giocatore sceglie di restartare il gioco*/
		public boolean isRestarted() {
			return isRestarted;
		}
		
		/**setta la risposta relativa alle scelte prese dal giocatore riguardanti i vari scenari*/
		private void setAnswer() {
			answer[0][0]="I ricchi ti hanno subito notato provare a scappare ed hanno ucciso te e la tua famiglia";
			answer[0][1]="I ragazzi appartenenti a Muller ti ridono in faccia e senza troppi movimenti uccidono te e tutti i tuoi compagni";
			answer[0][2]="Tu e i tuoi compagni avete distrutto tutti i ragazzi di Muller. Complimenti!";
			answer[0][3]="In questa parte della voragine non c'è nessuna roccia con cui nasconderti e i ragazzi di muller ti hanno ucciso";
			answer[1][0]="Il serpente nonostante una testa mozzata non sembra aver ricevuto alcun danno e ti ha ucciso";
			answer[1][1]="La tua spada non è arrivata al cuore del serpente. Il serpente ha approfittato della situazione di stallo e ti ha ucciso";
			answer[1][2]="Sei scappato, per ora non c'è traccia del serpente. Sei scampato di nuovo alla morte complimenti!";
			answer[1][3]="I serpenti riescono a vederti perfettamente anche se sei immobile. Sei stato ucciso!";
			answer[2][0]="Complimenti bel lancio!! Hai tagliato perfettamente tutte e 3 le teste e lo hai finalmente ucciso";
			answer[2][1]="Il serpente ha completamente ignorato il tuo zaino e ti ha ucciso";
			answer[2][2]="La tua spada è rimasta bloccata tra le carni del serpente e sei stato ucciso";
			answer[2][3]="Sei in un vicolo cieco, il tuo tentativo di fuga è stato inutile e ti sei fatto ammazzare";
			answer[3][0]="Durante il cammino per ricongiungerti con i tuoi amici, dei ragazzi appartenenti ad un altro ricco ti hanno preso di mira e ti hanno ucciso";
			answer[3][1]="Incredibile! riesci a scavare con una facilità e una velocità mai viste";
			answer[3][2]="Questa volta nessun ascia! Durante il cammino per ricongiungerti con i tuoi amici, dei ragazzi appartenenti ad un altro ricco ti hanno preso di mira e ti hanno ucciso";
			answer[3][3]="La pala non si è rotta ma il tuo attacco ti si è ritorto contro e sei stato ucciso";
			answer[4][0]="Il ricco a cui appartenevi ha notato il tuo comportamento ribelle e un raggio provenente dall'alto della voragine ti ha ucciso";
			answer[4][1]="Non ci è voluto molto per far si che arrivassero tutte le altre persone nei dintorni e che iniziassero una lotta nel buco che hai scavato.\n"
					+ "Sei rimasto coinvolto dalla lotta e sei stato ucciso";
			answer[4][2]="Sei stato ucciso. Il ricco a cui appartieni gioisce e preso dall'euforia, non ha impiegato molto tempo prima di iniziare la distruzione della voragine\n"
					+ " e di tutti i ragazzi coinvolti";
			answer[4][3]="Tutti i ragazzi sono stati trasportati immediatamente fuori dalla voragine, assistendo ad un mondo completamente nuovo.\n"
					+ "Il dislivello tra ricchi e poveri è stato colmato, le famiglie più povere messe in salvo e al posto della voragine ora c'è un immenso prato fiorito dalla bellezza\n"
					+ "indescrivibile, quasi come se di tutta questa avventura, non fosse mai esistito nulla...";
		}
		/**ritorna la stringa della risposta rispettiva alla scelta e al livello attuale
		 * @param scelta numero relativo alla scelta dello scenario a schermo
		 * @return la stringa della risposta rispettiva alla scelta e al livello attuale*/
		private String getAnswer(int scelta) {
			return answer[numLivelloAttuale-1][scelta-1];
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
		/** ritorna il titolo del gioco 
		 * @return titolo del gioco*/
		private String getTitolo() {
			return titolo;
		}
		
		/** setta il titolo del gioco */
		private void setTitolo() {
			this.titolo = "La leggenda della voragine";
		}
		/** ritorna il livello attuale del gioco 
		 * @return livello attuale del gioco*/
		public int getNumLivelloAttuale() {
			return numLivelloAttuale;
		}
		
		/** ritorna la trama del gioco
		 * @return trama del gioco */
		private String getTrama() {
			return trama;
		}
		/** setta la trama del gioco */
		private void setTrama() {
			this.trama = "In un mondo dove il comando è in mano a figure dall’identità ignota, gran parte della popolazione soffre la fame. Le uniche famiglie ad andare avanti sono coloro\n"
					+ "che si affidano ai pochi ricchi ed essi, bramosi di ulteriore potere e ricchezza, ne sfruttano i primogeniti che arrivano a compiere i diciotto anni per seguire una leggenda\n"
					+ "e crearne un intrattenimento a loro insaputa.\n" + 
					"Ad iniziare questa storia è Nivek, primogenito di una delle famiglie a cui è toccata la peggior sorte, e che si ritroverà a dover affrontare creature mai \n"
					+ "viste prima d’ora insieme ad altri nove ragazzi presi in custodia dal ricco Nilon Auschvagen.\n" + 
					"La leggenda narra che, in fondo ad una voragine posta al centro del mondo con molteplici entrate, si trovi un oggetto sconosciuto in grado di esaudire ogni desiderio.\n"
					+ "La leggenda si rivelerà vera o una speranza creata dai ricchi per poter usufruire al meglio della povera gente?\n" + 
					"";
		}
		
		
	

	}

