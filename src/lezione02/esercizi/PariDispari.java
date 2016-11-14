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
public class PariDispari {
    public static void main(String [] args) {
        
        // Crea oggetto scanner per leggere input alternativa a JOptionPane
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci il numero: ");
        
        // Leggo il numero in input
        int numero = s.nextInt();
        
        // Output in consolle 
        System.out.println("Il numero inserito è: " + numero);      //println = va a capo. print = di seguito
        
        if (numero%2 == 0) {
            System.out.println(numero + " è un numero pari");
            
        } else {
            System.out.println(numero + " è un numero dispari");
            
        }
        
    }
    
}
