package com.fantatextgame.FantaTextGame;
/**
 * 
* Classe che costruisce la lore del gioco del Mago 
* 
*  	@author Francesco Donnarumma
* 	@author Vittoria Simonetti
*	@author Giuseppe Liberato Serra
*	@author Giuseppe Borzachiello
*	@author Kevin Gargiulo
*	@version 2.0.0
**/
public class Mago extends Protagonista {

	/**
	 * 
	 * costruttore che chiama il costruttore del padre {@link Protagonista Protagonista}
	 * 
	 * @see Protagonista#Protagonista()
	 */
	
	public Mago(){
		super();
	}
	
	
	
	@Override
	protected void setScenari() {
		scenari[0]="Sei venuto a conoscenza della corrente situazione tra magia e tecnologia e prima che sia troppo tardi decidi di parlare con il\n"
				+ "presidente del mondo tecnologico, una delle persone più potenti e più formate a livello informatico. Arrivi all’interno della struttura e\n"
				+ "noti quanto la situazione sia critica e tesa, con tecnologi in preda al panico che smanettano ai loro computer. Osservi anche il presidente\n"
				+ "spazientirsi alla tua vista. Ti avvicini per provare a convincerlo che sei in grado di fermare la situazione e di non farla evolvere in maniera\n"
				+ "irrecuperabile, ma sembra che lui non voglia saperne. Cosa fai?\n" + 
				"1. Continui a convincerlo in modo arrogante e con toni altezzosi perchè i maghi sono superiori e non accetti che un tecnologo ti si rivolga in questo\n"
				+ "modo.\n" + 
				"2. Decidi di andartene e di mollare la presa\n" + 
				"3. Continui a convincerlo in modo pacato e rispettoso, facendo capire che sei in grado di gestire la situazione e che una guerra non\n"
				+ "sarebbe vantaggiosa per nessuna delle due parti\n" + 
				"4. Rompi il computer in cui il mago è riuscito ad entrare e che il presidente ha sulla sua scrivania.\n";
		
		
		
		scenari[1]=" Ti trovi nel computer, immediatamente noti il mago che è entrato, decidi di avvicinarti e provi a parlarci. L’altro mago credendo che\n"
				+ "tu sia stato mandato dai tecnologi ti attacca. Cosa fai?\n" + 
				"1. Ti difendi e provi a bloccare i suoi movimenti con un incantesimo\n" + 
				"2. Lo attacchi con un incantesimo mortale\n" + 
				"3. Te la dai a gambe\n" + 
				"4. Provi a spiegargli la situazione all’esterno\n";
		
		
		
		scenari[2]="Dopo avergli spiegato la situazione lo convinci ad uscire insieme a te dal pc, lo convinci dicendogli che una singola azione di questo \n"
				+ "tipo può rovinare le vite a migliaia e migliaia di persone. Il mago, ragionando, si convince ma dichiara di essere stanco della situazione \n"
				+ "e di tutte le proibizioni per entrambe le fazioni. Sciogli così l’incantesimo che\n"
				+ "teneva prigioniero il mago e ad interrompere la vostra discussione è \n"
				+ "l’antivirus del pc che vi vede come elementi che mettono a rischio la propria sicurezza. Cosa fai?\n" + 
				"1. Scappi\r\n" + 
				"2. Lanci un incantesimo che romperà il sistema di antivirus\n" + 
				"3. Lanci un incantesimo di protezione su entrambi\n" + 
				"4. Lanci un incantesimo di invisibilità su entrambi\n";
		
		
		
		scenari[3]="Siete al sicuro e chiedi all’altro mago come è riuscito ad entrare. Lui ti risponde che entrare è facile ma uscire è la cosa più complicata ma ti \n"
				+ "piega comunque di essere entrato nel pc con un incantesimo di traslazione tramite lo schermo. Cosa fai?\n" + 
				"1. Usi lo stesso metodo e ti avvicini allo schermo\n" + 
				"2. Decidi di avviarti alle porte di I/O e uscire da li\n" + 
				"3. Decidi di avviarti alla memoria ROM per farti dire come uscire da li\n" + 
				"4. Vai nella zona in cui si trova la scheda madre per uscire da li\n";
		
		
		
		scenari[4]="Tu e l'altro mago, che hai appena scoperto chiamarsi Ash, vi abbracciate felici di esser riusciti ad uscire ma presto vi trovate a dover discutere \n"
				+ "con il capo del mondo della tecnologia che appena si accorge di voi corre nella vostra direzione e comincia a litigare con Ash e a \n"
				+ "minacciarlo di iniziare una guerra. Cosa decidi di fare?\n" + 
				"1. Non fai nulla e non ti metti in mezzo, lasci che discutano da soli.\n" + 
				"2. Provi a far ragionare il presidente.\n" + 
				"3. Vai dal presidente della magia.\n" + 
				"4. Gli lanci un incantesimo per stordirlo\n";
		
	}

	
	@Override
	protected void setCorrectChoise() {
		correctChoises[0]=3;
        correctChoises[1]=1;
        correctChoises[2]=4;
        correctChoises[3]=2;
        correctChoises[4]=2;
		
	}

	
	@Override
	protected void setAnswer() {
		answer[0][0]="Il presidente si spazientisce e ordina alle guardie di portarti fuori e di ucciderti.";
		answer[0][1]="E’ scoppiata la guerra e tra colpi di fucile e armi nucleari sei rimasto coinvolto e sei morto.";
		answer[0][2]="Il presidente ha ancora qualche dubbio ma decide comunque di lasciarti provare e ti fa avvicinare\n"
				+ "alla sua scrivania con il computer in cui il mago è riuscito ad entrare.";
		answer[0][3]="Il presidente su tutte le furie ordina alle guardie di ucciderti, sei morto!";
		answer[1][0]="Gli lanci un incantesimo che lo rinchiude dentro una bolla e ne approfitti per spiegargli la situazione all’esterno";
		answer[1][1]="Uccidi il mago provocando un danno all’interno del sistema che non ti permette di uscirne. Muori di fame e di stenti.";
		answer[1][2]="L’incantesimo che ti ha lanciato è mirato per cui non puoi scappare. Vieni colpito alle spalle dall’incantesimo. Sei morto!";
		answer[1][3]="Prima che tu possa aprire bocca vieni colpito da un incantesimo fatale che ti uccide.";
		answer[2][0]="L’antivirus vi cattura e vi annienta.";
		answer[2][1]="L’antivirus non è più in grado di proteggere l’intero sistema e in poco tempo il pc per difendersi inizia a lanciare una serie di errori. \n"
				+ "Cominciate a vedere tutto nero e venite annientati.";
		answer[2][2]="L’antivirus vi colpisce senza alcuna difficoltà etichettandovi come minacce eliminate. Siete morti!";
		answer[2][3]="L’antivirus non è più in grado di rilevarvi e dunque non vede più alcun pericolo allontanandosi preso da voi";
		answer[3][0]="Nonostante i vari tentativi non riesci ad uscire. Sei morto!";
		answer[3][1]="Riesci ad uscire da li e ti ritrovi sulla scrivania del presidente del mondo della tecnologia";
		answer[3][2]="La memoria non riesce a darvi alcuna informazione e non riuscite ad uscire, sei morto!";
		answer[3][3]="Non riuscite ad uscire tramite la scheda madre. Sei morto di fame e di stenti.";
		answer[4][0]="Le cose cominciano a sfuggire di mano, la discussione si anima e il preside decise di iniziare una guerra. Vieni ucciso all'interno dell'edificio.";
		answer[4][1]="Provi a convincerlo nel modo più calmo possibile dicendogli che per una singola infrazione delle regole non si possono mettere in \n"
				+ "pericolo milioni di vite e che bisognerebbe solo cercare di eliminare le due fazioni per diventare un unico popolo unito. \n"
				+ "Il presidente decide di calmarsi e di discutere con il capo del mondo magico, dove, dopo il giusto tempo, si deciderà di permettere ai maghi di usare\n"
				+ "la tecnologia come meglio credono e verrà permesso ai tecnologi di usare oggetti magici. Finalmente, grazie alle tue scelte corrette, non c’è più il \n"
				+ "clima di odio e di sfiducia tra i due mondi e regna la pace.";
		answer[4][2]="Il presidente della magia decide lui stesso di dichiarare guerra al mondo tecnologico. Vieni ucciso durante la guerra	";
		answer[4][3]="Vieni ucciso dalle guardie.";
		
	}

	
	@Override
	protected void setTitolo() {
		
	this.titolo="Witchcraft Vs Technology: The Final War";
	}

	@Override
	protected void setTrama() {
	this.trama="In un mondo in cui tecnologia e magia coesistono, un mago, in grado di usare la tecnologia al suo massimo e anche di entrare nei libri che\n"
			+ "trovava più interessanti e di diventarne un personaggio grazie alla sua magia, preso dalla voglia di rivoluzione entra in un computer collegato online\n"
			+ ", infrangendo così facendo una delle leggi che ha portato la pace tra le due schiere createsi anni addietro.\n" + 
			"Una delle due schiere è quella caratterizzata principalmente da persone senza poteri magici. Questa schiera deve la sua nascita ai continui soprusi subiti, \n"
			+ "infatti “non-maghi” venivano continuamente scherniti e lasciati in disparte dai maghi. Decisero di rifarsi quindi con l’invenzione della tecnologia per \n"
			+ "migliorare la loro posizione e per riuscire a stare al passo con coloro che sono stati baciati dalla magia. Come fosse una sorta di vendetta, ai maghi fù\n"
			+ "vietato l’uso della tecnologia in qualsiasi situazione.\n"
			+ "Tra i sostenitori di questo pensiero c’erano anche figli di famiglie di maghi nati però senza poteri\n"
			+ " magici e sempre trattati come le pecore nere, anche all’interno della stessa famiglia, e persone in grado di distruggere intere nazioni con un semplice \n"
			+ "click.\n" + 
			"L'altra schiera, quella dei maghi, era caratterizzata dai pochi predestinati ma incredibilmente potenti, soprattutto tra le famiglie di alto rango.\n" + 
			"I conflitti tra di esse cessarono a seguire del patto “Technemagheìa”, basato\n"
			+ " su una debole fiducia in quanto consisteva nel concedere l’uso della tecnologia\n"
			+ "ai maghi vietando loro l'uso della magia sui dispositivi connessi online: I maghi non disponendo di abbastanza informazioni sulla tecnologia non poterono \n"
			+ "creare dei sigilli adatti a fornire sicurezza sul mantenimento di tale patto.\n" + 
			"Eppure il nostro protagonista Rowan, contro ogni tipo di conflitto e appartenente a una delle famiglie magiche più potenti, si troverà a dover risolvere 1n"
			+ "la guerra che sta per nascere dopo la rottura del divieto. Riuscirà a fermare il mago che ha causato tutto ciò e soprattutto a fermare le due parti prima\n"
			+ "che sia troppo tardi?\n";
		
	}

}
