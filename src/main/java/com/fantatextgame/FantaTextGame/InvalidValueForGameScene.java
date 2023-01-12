package com.fantatextgame.FantaTextGame;

/**
 * Classe di errore per la scelta non valida del scenario di gioco
 */
public class InvalidValueForGameScene extends Exception{
	
	private static final long serialVersionUID = 1L;

	InvalidValueForGameScene(){
		super("scelta non valida per il livello attuale");
	}
}
