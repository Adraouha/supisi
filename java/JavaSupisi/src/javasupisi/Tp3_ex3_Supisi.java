/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasupisi;

import java.util.Scanner;

/**
 *
 * @author adrao
 */
public class Tp3_ex3_Supisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        while (true) {
            System.out.print("Veuillez entrer votre âge : ");
            age = scanner.nextInt();

            switch (age) {
                case 7:
                    System.out.println("Il est temps de partir à l'école.");
                    break;
                case 12:
                    System.out.println("Il est temps de commencer le sport.");
                    break;
                case 18:
                    System.out.println("Il est temps de chercher un travail.");
                    break;
                default:
                    System.out.println("Veuillez saisir un autre âge.");
                    continue; // Re-demande l'âge
            }

            break; // Sort de la boucle si un cas est traité
        }

        scanner.close();
                     


  
}
}
