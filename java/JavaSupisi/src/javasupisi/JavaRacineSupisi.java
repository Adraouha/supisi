/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasupisi;

import java.util.Scanner;

/**
 *
 * @author adraou HASSAN
 * Exercice 2 : Racine carrée et valeur absolue
1. Récupérez les variables a et b au clavier et évaluer formule suivante : résultat=𝒂+√𝒃+𝟏. Puis affichez le resultat.
2. Récupérez une variable c à partir du clavier et afficher sa valeur absolue.
 */
public class JavaRacineSupisi {
    
    public static void main(String[] args) {
        
     // Calculer a* Racince(b+1)
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez la valeur de a: ");
    double a = scanner.nextDouble();
    
    System.out.println("Entrez la valeur de b: ");
    double b = scanner.nextDouble();
        System.out.println("========================= ");


    double resultat = a*Math.sqrt(b+1);
    System.out.println("La racine est: "+resultat);
    System.out.println("========================= ");

    // valeur absolue de C.
    System.out.println("Entrez la valeur de c: ");
    double c = scanner.nextDouble();
    double ValeurAbs = Math.abs(c);
    System.out.println("La valeur absolue de C est: "+ValeurAbs);
    
    
}
}
