/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02;

/**
 * Esempio di commenti in Java. Solo per descrivere classe e metodo...
 *
 * @author tss
 */
public class Main {

    // Variabili a livello di classe (oltre al tipo e al nome possono contenere il modificatore di visibilità "public o private" che può essere seguito o no da "static").
    // Variabile statica
    private static int colore;

    // Variabile di istanza
    private int carattere;

    /**
     * Da questo punto partirà l'esecuzione del progeamma
     *
     * @param args
     */
    public static void main(String[] args) {
        // args = variabile locale del metodo main che identifica un parametro

        // commento singolo
        /*
        commento multiriga
        ....
        ....
         */
        System.out.println("Start esempio commenti...");

        /*
        Da progetto (cup of coffee); tasto dx + generate javadoc (genera documentazione tecnica in formato html).
         */
        
        /*
        Da progetto: tasto dx - git - commit poi... git - remote - push
         */
        
        // Variabile locale
        int totale = 10;
        String frase;

        totale -= 20;

        if (totale > 0) {
            // Variabile locale
            int x = 5;
            frase = "Il totale è positivio";
        } else {
            int x = 10;
            frase = "Il totale è negativo";
        }

        // Operatore di assegnamento ternario
        frase = (totale > 0) ? "Il totale è positivio" : "Il totale è negativo";

        System.out.println("Totale = " + totale);
        System.out.println(frase);

    }

}
