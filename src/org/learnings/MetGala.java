package org.learnings;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String[] guests= {
                "Jennifer Lopez",
                "Zendaya",
                "Chris Hemsworth",
                "Bad Bunny",
                "Cara Delavigne",
                "Kendall Jenner",
                "Uma Thurman",
                "Damiano David",
                "Luca Guadagnino"
        };
        Scanner scanner= new Scanner(System.in);
        System.out.print("Come ti chiami? ");
        String name= scanner.nextLine();
        Boolean isInList= false;
        for (String guest : guests) {
            if(name.equals(guest) ){
                isInList= true;
            }
        }
        if (isInList){
            System.out.println("Sei nella lista degli invitati. Puoi entrare");
        }else {
            System.out.println("Non sei nella lista degli invitati. Non puoi entrare");
        }
    }
}
