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
*	@version 2.0.0
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
		scenari[0]="Sei partito con il tuo zaino sulle spalle pieno di provviste e di oggetti che potrebbero rivelarsi utili e la tua spada. \n"
				+ "Nel cammino verso la montagna solitaria ti ritrovi in una caverna di Goblin, ormai perso. Cosa fai per uscire?\n" + 
				"\n" + 
				"1. Combatti i goblin con la tua spada.\n" + 
				"2. Fuggi dalla caverna correndo verso l'uscita.\n" + 
				"3. Cerchi un'altra via d'uscita, come un passaggio segreto o una porta nascosta\n" + 
				"4. Ti nascondi e aspetti che i goblin se ne vadano\n";
		scenari[1]="Dopo essersi liberato dalla caverna di Goblin, ormai in piena notte, Manfrad si ritrova nella pericolosa Foresta del Mirkwood, infestata da orchi,\n"
				+ "lupi mannari ed altre malvagie creature. Cosa fai?\n" + 
				"1. Decidi di chiedere aiuto agli Elfi che si trovano nella foresta per guidarti\n" + 
				"2. Attraversi la foresta di notte, quando i pericoli sono meno visibili.\n" + 
				"3. Costruisci un rifugio per aspettare che sorga il sole.\n" + 
				"4. Segui un sentiero che sembra portare fuori dalla foresta.\n";
		scenari[2]="Tu e gli Elfi che avevano deciso di accompagnarti nella tua impresa, arrivate alla Montagna Solitaria, dove dovrai affrontare il pericolo rappresentato \n"
				+ "dallo Smaug, un drago enorme dal color oro rosso che vive lì, perennemente adagiato sulle ricchezze dei nani che un tempo abitavano lì, \n"
				+ "ormai abbattuti dal drago. Cosa tenti di fare?\n" + 
				"\n" + 
				"1. Ingaggia uno scontro con il drago Smaug e provi ad ucciderlo.\n" + 
				"2. Fuggi dalla montagna.\n" + 
				"3. Ti nascondi e aspetti che Smaug se ne vada.\n" + 
				"4. Cerchi un modo per addormentare o distrarre Smaug per poter passare inosservati.\n";
		scenari[3]="Dopo aver sconfitto il drago Smaug e recuperato parte del tesoro della Montagna Solitaria, ti prepari per il viaggio di ritorno a casa e a salutare gli \n"
				+ "elfi ma ben presto si insinua nella tua testa un problema per il viaggio.Cosa fai?\n" + 
				"1. Andate in un paese vicino e chiedi l'aiuto di una guida esperta per tornare.\n" + 
				"2. Partite di notte, per nascondervi dai pericoli e dalle creature notturne.\n" + 
				"3. Viaggiate da soli, senza il supporto di nessun altro.\n" + 
				"4. Partite per il ritorno di giorno, per avere più luce e maggiori possibilità di orientarsi.\n";
		scenari[4]="Durante il loro viaggio, Manfrad e la guida stanno tornando alla Contea. Tuttavia, a poca distanza dalla Contea, dei banditi si rivelano,\n"
				+ " minacciando di uccidervi se non gli verrà consegnato il tesoro trovato poco prima sotto il drago. Il capo dei banditi rivela anche di aver ascoltato\n"
				+ " la sua conversazione con la guida, venendo a sapere anche delle monete.\n" + 
				"Cosa fai?\n" + 
				"Gli consegni il tesoro senza combattere.\n" + 
				"Cacci la tua spada dal fodero per combatterli\n" + 
				"Fai finta di consegnargli il tesoro per poi attaccarli mentre sono distratti\n" + 
				"Decidi di correre il più veloce possibile per arrivare alla contea e uscirne indenni\n";
		
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
		answer[0][0]="Combatti i goblin, ma sono troppi e riescono a ucciderti.";
		answer[0][1]="Fuggi, ma inciampi su una pietra e cadi. I goblin ti raggiungono e ti uccidono";
		answer[0][2]="Trovi un passaggio segreto che ti porta fuori dalla caverna e ti permette di scappare indenne dai goblin";
		answer[0][3]="Ti nascondi ma i goblin ti trovano e ti uccidono\n";
		answer[1][0]="Trovi gli Elfi e chiedi il loro aiuto. Loro, ormai abitanti della foresta da lungo tempo, ti accompagnano fuori dalla foresta senza problemi.";
		answer[1][1]="Segui il sentiero, ma ad un certo punto si interrompe e ti perdi. Muori di fame e di stenti.";
		answer[1][2]="Mentre stai cercando di costruire un rifugio vieni attaccato da insetti velenosi che ti uccidono in pochi secondi. Sei morto!";
		answer[1][3]="Avanzi nella foresta nel buio della notte, con la luna come unica luce ad illuminare il sentiero. Vieni attaccato da un lupo mannaro e muori.";
		answer[2][0]="Tenti di sconfiggere Smaug, ma il drago è troppo potente e ti uccide con il suo fiato di fuoco.";
		answer[2][1]="Tu e gli Elfi tentate di fuggire, ma venite raggiunti e uccisi dal drago Smaug.\n";
		answer[2][2]="Vi nascondete, ma il drago Smaug vi trova e vi uccide";
		answer[2][3]="La tua idea ha funzionato, infatti usando un sonnifero che avevi nel tuo zaino, che solo gli hobbit sono in grado di creare,\n"
				+ "ti avvicini a lui facendolo ruggire in segno di avvertimento. Approfitti quindi della sua bocca spalancata per lanciargli con tutta la tua forza\n"
				+ " l’ampolla contenente il sonnifero. Smaug si addormenta in pochi secondi e tu e i tuoi compagni Elfi riuscite a passare incolumi e a uscire dalla montagna";
		answer[3][0]="Riesci a trovare una guida esperta che ti aiuta a navigare attraverso le strade della Terra di Mezzo.";
		answer[3][1]="Tenti di viaggiare di notte, ma sul cammino incontri un precipizio. Sei morto!";
		answer[3][2]="Viaggi da solo, ma ti perdi e, dopo aver esaurito le tue provviste, muori di fame e di stenti.";
		answer[3][3]="Tenti di viaggiare di giorno, ma vieni attaccato da un orco e vieni ucciso.";
		answer[4][0]="Dopo aver consegnato il tesoro proseguiti, siete quasi arrivati fino a che i banditi, spietatamente, decidono di uccidervi.";
		answer[4][1]="I banditi sono in troppi e dopo averne sconfitti due vieni sopraffatto e ucciso.\n";	
		answer[4][2]="Mentre i banditi sono troppo impegnati a festeggiare per il tesoro e a contare l’ammontare del bottino, decidi di attaccarli. \n"
				+ "Riesci a sopravvivere senza molti danni e a mettere in salvo anche la guida. Arrivi alla Contea dopo poco e\n"
				+ " fai una relazione di tutto ciò che è successo. Consegni il tesoro con la relazione alla gilda che si occupa di assegnare gli incarichi in\n"
				+ "nome del conte e vieni premiato con un riconoscimento internazionale per aver intrapreso la più impavida e rischiosa delle avventure salvando\n"
				+ " la Contea e le regioni vicine.\n";
		answer[4][3]=" I banditi sono di più e più veloci, vieni raggiunto e ucciso.";
		
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
