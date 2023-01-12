package com.fantatextgame.FantaTextGame;

/**
 * Classe di errore per la scelta non valida del menù di gioco
 */
public class InvalidValueForGameMenu extends Exception {
	
	private static final long serialVersionUID = 1L;

	InvalidValueForGameMenu(){
		super("Scelta non valida per il menù di gioco");
	}
	

}
