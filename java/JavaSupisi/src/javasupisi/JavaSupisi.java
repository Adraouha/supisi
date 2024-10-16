/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasupisi;

import java.util.Scanner;

/**
 Exercice 1 : La variable PI et la méthode pow
1. Soit M=10 et C=2.4 calculer et afficher la valeur de E=𝑴∗𝑪𝟐
2. Récupérez à partir du clavier la valeur du rayon d’un cercle et calculez et 
* affichez sa surface (𝐒𝐮𝐫𝐟𝐚𝐜𝐞=𝝅∗𝒓𝒂𝒚𝒐𝒏𝟐).
 */
public class JavaSupisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP2 - SUPISI
        
        //Q1 calculer et afficher la valeur de E=𝑴∗𝑪𝟐
        double M=10, C=2.4, PI=3.1415927;
        double E=M*C*C;
        System.out.println("La valeur de E est: "+E);
        
        /** Q2 Récupérez à partir du clavier la valeur du rayon d’un cercle et calculez et 
* affichez sa surface (𝐒𝐮𝐫𝐟𝐚𝐜𝐞=𝝅∗𝒓𝒂𝒚𝒐𝒏𝟐)*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le rayon du cercle: ");
        double rayon = scanner.nextDouble();
        double surface = Math.PI * Math.pow(rayon, 2);
        System.out.println("Surface du cercle = " + surface);
        scanner.close();
    }
    
}
