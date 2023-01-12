package com.fantatextgame.FantaTextGame;

/**
* 
* Classe che costruisce la lore del gioco dell'Hobbit 
* 
*  	@author Francesco Donnarumma
* 	@author Vittoria Simonetti
*	@author Giuseppe Liberato Serra
*	@author Giuseppe Borzachiello
*	@author Kevin Gargiulo
*	@version 1.9.8
**/
public class Hobbit extends Protagonista {

	/**
	 * 
	 * costruttore che chiama il costruttore del padre {@link Protagonista Protagonista}
	 * 
	 * @see Protagonista#Protagonista()
	 */
	public Hobbit(){
		super();
	}
	
	
	@Override
	protected void setScenari() {
		
		
	}

	
	@Override
	protected void setCorrectChoise() {
		correctChoises[0]=3;
        correctChoises[1]=1;
        correctChoises[2]=4;
        correctChoises[3]=1;
        correctChoises[4]=3;
		
	}

	
	@Override
	protected void setAnswer() {
		
		
	}

	
	@Override
	protected void setTitolo() {
		this.titolo="L'incarico di Manfred";
		
	}

	@Override
	protected void setTrama() {
		this.trama="La Contea è una regione molto famosa del mondo Arda, governata da un Conte scelto dal popolo degli Hobbit talvolta il conte assegna agli abitanti varie \n"
				+ "mansioni, dalle più semplici alle più mortali. Gli hobbit sono uomini con una corporatura molto minuta, quasi bambinesca, dotati di grandi piedi pelosi \n"
				+ "e resistenti e non indossano mai calzature a causa della loro spessa e coriacea pelle.n" + 
				"Il nostro protagonista è un hobbit di nome Manfrad, appassionato di avventure e pericoli ed anche uno degli abitanti più affidabili della Contea per \n"
				+ "la sua astuzia che in passato gli ha permesso di sopravvivere a diverse guerre. Un giorno a Manfred verrà affidato un nuovo incarico; \n"
				+ "attraversare le terre più ostili della Terra di Mezzo e affrontare creature pericolose per raggiungere la Montagna Solitaria, abitata dal terribile \n"
				+ "drago Smaug che potrebbe rivelarsi un problema per i paesi vicini e anche per la Contea stessa.\n" + 
				"Durante il viaggio, Manfrad dovrà prendere numerose decisioni difficili che potrebbero fare la differenza tra la vita e la morte. \n"
				+ "Riuscirà a tornare a casa sano e salvo, o perirà nel tentativo?";
		
	}

}
