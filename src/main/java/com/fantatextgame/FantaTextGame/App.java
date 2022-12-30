package com.fantatextgame.FantaTextGame;

import java.util.Scanner;


public class App 
{
	/**
	 * main che utilizza i metodi e gli attributi della classe {@link Protagonista Protagonista} per far funzionare tutto il gioco e prevenendo gli errori
	 * @param args contiene gli argomenti della riga di comando 
	 * @throws Exception lancia al sistema operativo qualsiasi tipo di errore avviene nel main
	 */
    public static void main( String[] args ) throws Exception
    {
       
        
        Protagonista protagonista = new Protagonista();  //istanzia la classe Protagonista
        Scanner scanner =new Scanner(System.in); //istanzia la classe Scanner
        String scelta="0"; //variabile string che contiene la scelta fatta dal giocatore
        //do while che si ripeterà finchè il livello del gioco non arriva a 5
        do {
       
        protagonista.Menu(); //stampa il menù iniziale del gioco
        //do while che si ripete fino a quando la scelta non sarà 1, 2 o 3
        do {
        scelta=scanner.nextLine();
        } while (!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));
        protagonista.GameController(Integer.parseInt(scelta)); //passa la scelta al gamecontroller trasformandola in int
        //entra nell'if se il gioco viene restartato non facendo continuare il do while 
        if(protagonista.isRestarted()) {
            continue;
        }
        //do while che si ripete fino a quando la scelta non sarà 1, 2 o 3
        do {
            scelta=scanner.nextLine();
            } while (!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3") && !scelta.equals("4"));
        protagonista.isCorrectChoise(Integer.parseInt(scelta));  //passa la scelta al isCorrectChoise trasformandola in int

    }while (protagonista.getNumLivelloAttuale()<5);
        //al termine del gioco, e quindi quando esce dal do while, stampa questo
        System.out.println("BRAVO HAI VINTO E COMPLETATO IL GIOCO!");
        scanner.close(); //chiude lo scanner
    	}
	}