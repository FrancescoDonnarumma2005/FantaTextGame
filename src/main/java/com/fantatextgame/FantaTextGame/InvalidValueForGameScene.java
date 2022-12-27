package com.fantatextgame.FantaTextGame;

public class InvalidValueForGameScene extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidValueForGameScene(){
		super("scelta non valida per il livello attuale");
	}
}
