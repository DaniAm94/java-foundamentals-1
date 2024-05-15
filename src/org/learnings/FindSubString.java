package org.learnings;

import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa ");
        String word = scanner.nextLine();
        System.out.print("Scegli un carattere da cercare nella stringa ");
        char character = scanner.nextLine().charAt(0);
        scanner.close();

        // Lunghezza della sequenza di caratteri scelto dall'utente
        int maxLength = 0;

        // Indice della sequenza di caratteri scelto dall'utente
        int position = 0;

        // Flag che indica se il carattere è stato trovato o no
        boolean found = false;

        // Itero su tutta la stringa
        for (int i = 0; i < word.length(); i++) {
            // Ad ogni prima corrispondenza del carattere scelto dall'utente
            if ((i == 0 && word.charAt(i) == character) || (i > 0 && word.charAt(i - 1) != character && word.charAt(i) == character)) {
                // Il carattere è stato trovato
                found = true;

                // Mi salvo la posizione della prima occorrenza in una variabile temporanea
                int tempPosition = i;

                // Dichiaro un contatore temporaneo e lo inizializzo a 1
                int tempCount = 1;

                // Creo un nuovo indice j che avrà valore di partenza uguale a i
                int j = i;
                // Finchè c'è un carattere in posizione j+1 e quel carattere è uguale al carattere cercato dall'utente
                while (j + 1 < word.length() && word.charAt(j + 1) == character) {
                    // Incremento il contatore temporaneo
                    tempCount++;
                    j++;
                }
                // Se il contatore temporaneo è maggiore di maxLength
                if (tempCount > maxLength) {
                    // Riassegno a maxLength il valore del contatore temporaneo (ho trovato una nuova sequenza di lunghezza massima)
                    maxLength = tempCount;
                    position = tempPosition;
                }
            }
        }
        // Se è stata trovata un'occorrenza del carattere scelto dall'utente, stampo la sua sua posizione e la lunghezza della sequenza
        if (found) {
            System.out.println("Indice: " + position);
            System.out.println("Lunghezza sequenza: " + maxLength);
        } else {
            System.out.println("Il carattere '" + character + "' non è stato trovato nella stringa.");
        }
    }
}
