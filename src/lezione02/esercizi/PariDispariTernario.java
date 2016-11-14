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
 * 
 * @author tss
 */
public class PariDispariTernario {
    public static void main(String [] args) {
        
        String risultato;
        
        // Crea oggetto scanner per leggere input alternativa a JOptionPane
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci il numero: ");
        
        // Leggo il numero in input
        int numero = s.nextInt();
        
        System.out.println(numero);
        risultato = (numero % 2) == 0 ? "Il numero è pari" : "Il numero è dispari";
        
        // Output in consolle 
        System.out.println(risultato);
        
    }
    
}
