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
            try {
            scelta=scanner.nextLine();
            } catch (Exception e) {
            	
                System.out.println("errore");

            }
            }while (Integer.parseInt(scelta)<3);

                do {
                System.out.println("scegli il tuo eroe \n1)Jedi\n2)Mago\n3)Hobbit");
                scelta=scanner.nextLine();
                if (Integer.parseInt(scelta)==1) {
                    protagonista= new Jedi();
                }
                else if (Integer.parseInt(scelta)==2) {
                    protagonista=new Mago();
                }
                else if (Integer.parseInt(scelta)==3) {
                    protagonista=new Hobbit();
                    }
                } while(!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));
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
                if (Integer.parseInt(scelta)==1) {
                    protagonista= new Jedi();
                }
                else if (Integer.parseInt(scelta)==2) {
                    protagonista=new Mago();
                }
                else if (Integer.parseInt(scelta)==3) {
                    protagonista=new Hobbit();
                    }
                } while(!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));

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