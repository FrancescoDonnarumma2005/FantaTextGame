package com.fantatextgame.FantaTextGame;
/**
 * 
* Classe che costruisce la lore del gioco del Jedi 
* 
*  	@author Francesco Donnarumma
* 	@author Vittoria Simonetti
*	@author Giuseppe Liberato Serra
*	@author Giuseppe Borzachiello
*	@author Kevin Gargiulo
*	@version 2.0.0
**/
public class Jedi extends Protagonista {

	/**
	 * 
	 * costruttore che chiama il costruttore del padre {@link Protagonista Protagonista}
	 * 
	 * @see Protagonista#Protagonista()
	 */
	public Jedi(){
		super();
	}
	
	
	@Override
	protected void setScenari() {
		// TODO Auto-generated method stub
		scenari[0]="Ti trovi sul pianeta KeltHat, il primo dei 3 pianeti più pericolosi dell’universo, questo pianeta ospita tutti i mostri più strani \n"
				+ "e potenti di tutto il cosmo.\n "
				+ "Davanti a te è pieno di ingressi, ad ognuno corrisponde una battaglia contro un mostro specifico,\n"
				+ " hai a disposizione solo una spada laser di prova e dovrai trovare un drago Krayt, ucciderlo e portare le perle nel suo stomaco alla navicella. \n "
				+ "Questo è l’unico modo per forgiare e ottenere la tua personalissima spada laser.\n"
				+ " Ci sono 4 ingressi che attirano maggiormente la tua attenzione, mostra spirito di iniziativa e guida gli altri ragazzi. Dove entri?\n" + 
				"\n" + 
				"1. Una grotta che porta in un canyon desertico\n" + 
				"2. Una grotta che porta ad un’immensa distesa di sabbia che si muove continuamente\n" + 
				"3. Una grotta di ghiaccio \n" + 
				"4. Una grotta oscura";
		
		
		
		scenari[1]="Sei uscita dalla grotta e hai creato degli esplosivi usando le carni e gli stomaci dei serpenti suicidi cosa fai ora?\n" + 
				"\n" + 
				"1. Crea una trappola con gli esplosivi davanti alla grotta che porta in un canyon desertico e fai da diversivo.\n" + 
				"2. Crea una trappola con gli esplosivi davanti alla grotta che porta ad un’immensa distesa di sabbia e fai da diversivo.\n" + 
				"3. Crea una trappola con gli esplosivi davanti la grotta di ghiaccio e fai da diversivo\n" + 
				"4. Corri alla navicella con gli esplosivi insieme ai tuoi compagni";
		
		
		
		scenari[2]="Tu e i tuoi compagni siete atterrati su Felucia con le vostre nuovissime e potentissime spade laser,\n "
				+ "il pianeta conosciuto per l’incredibile energia della forza che permea nell’ecosistema e al suo equilibrio con la natura, \n"
				+ "Davanti a te, c’è una scritta sull’albero che recita:\"Awaken the Force within\" e poco oltre ad una distesa di piante di ogni tipo, \n"
				+ "c’è un’area marchiata con piante altissime che formano un cerchio. Cosa fai?\n" + 
				"1. Ti prenoti per prima e ti dirigi all’interno del cerchio con la tua nuova spada laser per prevenire l’attacco di qualche \n"
				+ "creatura originaria del pianeta\n" + 
				"2. Ti prenoti per prima e lasci la spada laser a uno dei tuoi compagni e ti dirigi all’interno del cerchio per meditare\n" + 
				"3. Ti dirigi con un tuo compagno per un duello all’ultimo sangue\n" + 
				"4. Lanci una pietra raccolta da terra per controllare se è sicuro";
		
		
		
		scenari[3]="Siete atterrati sul terzo ed ultimo pianeta chiamato Mustafar. \n"
				+ "Questo pianeta è conosciuto anche dai più piccoli grazie alle tante storie spaventose che girano sul suo conto \n"
				+ " e i numerosissimi tunnel intrecciati che metterebbero difficoltà anche lo scavatore più esperto. \n"
				+ "Negli ultimi anni sono stati distrutti e ricostruiti per la necessità di una prova per proclamare il Gran Maestro; \n"
				+ "Sono stati creati esattamente 20 tunnel distinti con un cartello che indica il nome dell’avventuriero e in ognuno di essi si trova un Nexu,\n"
				+ " predatore dall’agilità straordinaria e con 4 occhi per monitorare costantemente l’ambiente circostante.\n" + 
				"Tu come gli altri, te lo ritrovi davanti nella tua corsia. Cosa fai?\n" + 
				"\n" + 
				"1. Scappa in preda alla paura\n" + 
				"2. Esci dalla grotta per aiutare prima un tuo compagno così da combatterli insieme\n" + 
				"3. Ingaggia uno scontro diretto col Nexu usando la spada laser\n" + 
				"4. Colpisci la grotta con la spada per generare una frana sulla testa del mostro";
		
		
		
		scenari[4]="Appena assestato l’attacco, il Nexu ha subito risposto scaraventandoti lontano da lui e facendoti lasciare la presa della spada, \n"
				+ "ormai alle spalle del mostro che si dirige verso di te. Cosa fai?\n" + 
				"\n" + 
				"1. Prova a scappare\n" + 
				"2. Prova a scivolare tra le gambe del Nexu per riprendere la spada\n" + 
				"3. Affronta il Nexu a mani nude\n" + 
				"4. Usa il potere della forza e richiama la spada laser a te";
	}

	
	@Override
	protected void setCorrectChoise() {
		// TODO Auto-generated method stub
		correctChoises[0]=4;
        correctChoises[1]=1;
        correctChoises[2]=2;
        correctChoises[3]=3;
        correctChoises[4]=4;
	}
	
	
	@Override
	protected void setAnswer() {
		// TODO Auto-generated method stub
		answer[0][0]="Vi siete ritrovati davanti un drago krayt ma le vostre spade non bastano a ucciderne uno. Sei morta!";
		answer[0][1]="Appena avete messo piede nella grotta un enorme Scavasabbia emerge con rapidità e forza inaudita dalle dune e\n"
				+ "ha inghiottito te e i tuoi compagni uccidendovi.";
		answer[0][2]="Vi si sono ghiacciate e le mani non riuscendo più a tenere la tua spada e sei stata uccisa e mangiata da un Wampa, \n"
				+ "creatura enorme dai denti affilati, con 2 corna ricurve e pelliccia bianca.";
		answer[0][3]="All’interno della grotta ci sono una ventina di pipistrelli suicidi dormienti, \n"
				+ "essi sono conosciuti per avere nello stomaco una sostanza esplosiva che attivano quando si sentono in pericolo. Li uccidete tutti senza problemi.";
		answer[1][0]="La tua trappola è stata in grado di uccidere il drago Krayt che si trovava in fondo al canyon. \n"
				+ "Sei scesa insieme agli altri e con le vostre spade aprite lo stomaco del drago recuperando abbastanza perle per tutti";
		answer[1][1]="L’esplosione crea un turbine di sabbia che ti entra negli occhi costrigendoti a chiuderli. Dal terreno emerge uno Scavasabbia che ti attacca. \n"
				+ "Sei morta!";
		answer[1][2]="Arrivi in una zona talmente ghiacciata che ti si congelano mani e piedi, rimani immobile e all’improvviso avvisti un Wampa inferocito, \n"
				+ "che corre nella tua direzione. Sei morta!";
		answer[1][3]="Riponi gli esplosivi creati da te alla rinfusa nella stiva e dopo poco senti un boato. Vieni travolta dall’esplosione. Sei morta!";
		answer[2][0]="Mentre ti dirigevi con la spada laser nel cerchio hai per sbaglio danneggiato una pianta che componeva la natura circostante e,\n"
				+ " non lasciandoti neanche il tempo di un respiro, una gigantesca pianta carnivora ti ha inghiottita. Sei morta.";
		answer[2][1]="Le piante che formavano il cerchio si aprono per permetterti il passaggio per poi chiudersi di nuovo una volta entrata. \n"
				+ "Iniziata la meditazione capisci immediatamente che qualsiasi altra azione, se avventata,\n"
				+ "avrebbe potuto scaturire la tua morte e quella dei tuoi compagni,\n"
				+ "in quanto la stessa natura vi avrebbe ucciso pur di mantenere il pianeta integro. Continuando la tua meditazione,\n"
				+ "riesci sempre più a sentire la forza scorrere dentro di te e negli organismi circostanti,\n"
				+ "fino a quando senti le piante dietro di te aprirsi di nuovo come segno di completamento e ti dirigi di nuovo alla nave.";
		answer[2][2]="All’ingresso del cerchio tu e il tuo compagno, mentre provavate ad entrare, nell’arco di tempo di mezzo secondo,\n"
				+ "sono cresciute delle lunghe spine che vi hanno trafitto e ucciso.";
		answer[2][3]="Hai sbagliato il lancio colpendo una creatura originaria del posto che si è sentita immediatamente minacciata e con \n"
				+ "un ruggito ha fatto smuovere tutta la natura attorno a voi facendovi attaccare e uccidere da essa.";
		answer[3][0]="Appena hai dato le spalle al Nexu questo ne ha approfittato per attaccarti e ucciderti.\r\n" + 
				"";
		answer[3][1]="Riuscita ad uscire dalla grotta sana e salva e, appena entrata nella grotta del tuo compagno, una frana ha bloccato l’entrata,\n"
				+ " distraendovi entrambi dall’obiettivo principale che, appena ha avuto l’occasione vi ha ucciso entrambi.";
		answer[3][2]="Sei riuscita ad assestare un bel colpo al Nexu ferendolo.";
		answer[3][3]="La tua idea ha funzionato generando però una frana che ha coinvolto sia il mostro che te. Sei morta.";
		answer[4][0]="Appena hai dato le spalle al Nexu questo ne ha approfittato per attaccarti e ucciderti.";
		answer[4][1]="Il mostro è troppo agile per un’impresa simile e ti ha ucciso.";
		answer[4][2]="Il mostro è troppo agile e forte per un’impresa simile e ti ha ucciso.";
		answer[4][3]="Mentre l’attenzione del Nexu era rivolta su di te hai richiamato la spada facendola conficcare nella testa del Nexu uccidendolo.\n"
				+ " Sei riuscita a passare anche quest’ultima prova prima e meglio di chiunque altro ed è qui che sul pianeta scendono i maestri jedi \n"
				+ "ad aiutare gli altri compagni ancora alle prese con la battaglia. Alcuni maestri si avvicinano per congratularsi con te che sei riuscita \n"
				+ "nella pazza impresa, \n"
				+ "spiegandoti anche che fingere che fosse un’impresa mortale anziché completamente monitorata era l’unica scelta per allenare velocemente \n"
				+ "da 0 nuove reclute \n"
				+ "e scoprire una persona in grado di guidare tutti gli altri maestri e jedi di rango più basso nell’imminente ingresso alla guerra.";
	}

	
	@Override
	protected void setTitolo() {
		// TODO Auto-generated method stub
		this.titolo="Pain of the Three Path";
		
	}

	
	@Override
	protected void setTrama() {
		// TODO Auto-generated method stub
		this.trama="Ci troviamo nel 17ABY con una situazione interstellare disastrosa per le continue guerre, \n"
				+ "l’Ordine dei jedi, ormai privo di un Gran Maestro, è in cerca di un sostituto il prima possibile,\n"
				+ " che possa essere in grado di guidare tutti gli altri jedi alla vittoria.\n"
				+ " Altri maestri Jedi non si sentivano per nulla pronti a ricoprire tale carica abituati agli scorsi decenni di pace. \n"
				+ "Con questa necessità sempre più grande di avere un Jedi a capo di tutti, è stata creata la \"Pain of three path\", \n "
				+ "una via veloce ma tortuosa che consiste nel viaggiare sui 3 pianeti più pericolosi dell’universo \n"
				+ " e uscirne vivi per scalare più velocemente i 6 ranghi che compongono il \"Jedi Path\": Iniziati, younglings, padawan, cavaliere,\n"
				+ "maestro e Gran Maestro.\n" + 
				"Sono venti i partecipanti alla \"Pain of the three path\" che dovranno prendere la propria strada, \n"
				+ "riuscendo a dimostrare chi è colui o colei in grado di guidare gli altri nelle correnti battaglie e in quelle future che li aspettano.\n" + 
				"La partecipante più in vista è Alyster Alcor, proveniente dal pianeta Ithor, che in vari allenamenti si è dimostrata una jedi con coraggio,\n"
				+ " spirito di gruppo, spirito di sacrificio e risolutezza. L’essenza della forza che arde dentro di lei sarà abbastanza per non lasciarci le penne\n"
				+ "e per poter compensare la mancanza di una guida?";
		
	}

}
