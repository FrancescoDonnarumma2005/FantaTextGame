package com.fantatextgame.FantaTextGame;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
    
        Protagonista protagonista = new Protagonista();
        Scanner scanner =new Scanner(System.in);
        int scelta=0;

        while (protagonista.numLivelloAttuale<2) {
        protagonista.Menu();
        scelta=scanner.nextInt();

        protagonista.GameController(scelta);
        //TODO FAR FUNZIONARE LA SCELTA GRAZIE
        if(protagonista.isRestarted()) {
            continue;
        }

        scelta=scanner.nextInt();
       
        protagonista.isCorrectChoise(scelta);

    }
        
        System.out.println("BRAVO HAI VINTO E COMPLETATO IL GIOCO!");
        
    	}
	}

