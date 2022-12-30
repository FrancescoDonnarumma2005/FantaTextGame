package com.fantatextgame.FantaTextGame;
/**
 * Classe per lanciare un'Exception personalizzata se il valore per la scelta della scena di gioco non è valido 
 */
public class InvalidValueForGameScene extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**richiama il costruttore del padre Exception facendo stampare di default la stringa che viene passata */
	InvalidValueForGameScene(){
		super("scelta non valida per il livello attuale");
	}
}
