package com.fantatextgame.FantaTextGame;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
       
        
      
        Scanner scanner =new Scanner(System.in);
        String scelta="0";
 
        //usando il polimorfismo e un do while che si ripeterà finchè la scelta non sarà 1,2 o 3, va ad istanziare la classe della storia scelta
                do {
                System.out.println("scegli il tuo eroe \n1)Jedi\n2)Mago\n3)Hobbit"); 
                scelta=scanner.nextLine();
               
                } while(!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));
                Protagonista protagonista=new Protagonista(Integer.parseInt(scelta));
        do {
       
        protagonista.Menu();
        do {
        scelta=scanner.nextLine();
        } while (!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));
        protagonista.GameController(Integer.parseInt(scelta));
        
        if(protagonista.isRestarted()) {
            do {
                System.out.println("scegli il tuo eroe \n1)Jedi\n2)Mago\n3)Hobbit");
                scelta=scanner.nextLine();
                } while(!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));
            protagonista=new Protagonista(Integer.parseInt(scelta));
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