/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasupisi;

import java.util.Scanner;

/**
 * Exercice 3
 *  : Logarithme et exponentielle
1. Récupérez une variable a à partir du clavier et affichez la valeur de 𝒓=𝒆^𝒂.
2. Récupérez une variable b à partir du clavier et affichez la valeur de r=log(b).
 * @author adraou Hassan
 */
public class LogExpSupisi {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // demander et enregistrer la valeur de a:
        Scanner valeur = new Scanner(System.in);
        System.out.println("Donnez la valeur de a: ");
        double a = valeur.nextDouble();
        
        // calculer le resultat de r = e^a
        double r = Math.E * a;
        
        // Afficher le resultat.
        System.out.println("la valeur de 𝒓=𝒆^𝒂 est : " +r);
        
        
        
        // 2. Récupérez une variable b à partir du clavier et affichez la valeur de r=log(b).
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        // demander et enregistrer la valeur de b:
        Scanner valeurB = new Scanner(System.in);
        System.out.println("Donnez la valeur de b: ");
        double b = valeurB.nextDouble();
        
        double r2 = Math.log(b);
        

        System.out.println("la valeur de r=log(b) est : " +r2);

    }
}
