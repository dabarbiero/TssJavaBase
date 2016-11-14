/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Legge un numero in input e stampa se pari o dispari
 * Parto da 0... 
 * 0 è pari, incremento sempre di 2 e quando esco o è uguale o è maggiore
 * 
 * @author tss
 */
public class PariDispariAlternativo {
    public static void main(String [] args) {
        
        String risultato = "";
        
        // Crea oggetto scanner per leggere input alternativa a JOptionPane
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci il numero: ");
        
        // Leggo il numero in input
        int numero = s.nextInt();
        
        int indice = 0;
        
        while (indice < numero) {
            indice += 2;
            
        }
        
        risultato = (indice == numero) ? numero + " è un numero pari" : numero + " è un numero dispari";
        
        System.out.println(risultato);
        
    }
    
}
