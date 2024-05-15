package org.learnings;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Quanti kilometri devi percorrere? ");
        int distance= Integer.parseInt(scanner.nextLine());
        System.out.print("Inserisci la tua età ");
        int age= Integer.parseInt(scanner.nextLine());
        double pricePerKm= 0.21;
        double finalPrice = pricePerKm * distance;
        if(age<18){
            finalPrice = finalPrice * 0.8;
        }else if(age >65){
            finalPrice= finalPrice * 0.6;
        }
        System.out.println("Il prezzo del tuo biglietto è: " + finalPrice + "€");

    }
}
