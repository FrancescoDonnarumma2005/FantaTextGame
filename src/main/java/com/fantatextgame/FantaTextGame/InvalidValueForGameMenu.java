package com.fantatextgame.FantaTextGame;
/**
 * Classe per lanciare un'Exception personalizzata se il valore per il Game Menù non è valido 
 */

public class InvalidValueForGameMenu extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**richiama il costruttore del padre Exception facendo stampare di default la stringa che viene passata */
	InvalidValueForGameMenu(){
		super("Scelta non valida per il menù di gioco");
	}
	

}
