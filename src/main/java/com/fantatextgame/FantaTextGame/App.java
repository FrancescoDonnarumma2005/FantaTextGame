package com.fantatextgame.FantaTextGame;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
       
        
        Protagonista protagonista = new Protagonista();
        Scanner scanner =new Scanner(System.in);
        String scelta="0";
        do {
       
        protagonista.Menu();
        do {
        scelta=scanner.nextLine();
        } while (!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));
        protagonista.GameController(Integer.parseInt(scelta));
        if(protagonista.isRestarted()) {
            continue;
        }
        do {
            scelta=scanner.nextLine();
            } while (!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3") && !scelta.equals("4"));
        protagonista.isCorrectChoise(Integer.parseInt(scelta));

    }while (protagonista.getNumLivelloAttuale()<5);
        
        System.out.println("BRAVO HAI VINTO E COMPLETATO IL GIOCO!");
        scanner.close();
    	}
	}