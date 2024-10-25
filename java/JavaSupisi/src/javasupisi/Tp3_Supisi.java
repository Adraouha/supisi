/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasupisi;

import java.util.Scanner;

/**
 *
 * @author ADRAOU Hassan
 * Exercice 1 : IF

1. Soit une variable V. Si la valeur de V est supérieure a 5 
* affichez le message suivant 
«la valeur saisie est grande + la valeur » 

2. Soit une variable V. Si la valeur de V est inféricure 4 faites v=v+1, 
* puis affichez le message suivant: « La valeur finale vaut + Ia valeur». 
 */
public class Tp3_Supisi {
    
    public static void main(String[] args) {
    
        
        Scanner valeur = new Scanner(System.in);
        System.out.println("Entrez une valeur : ");
        int V = valeur.nextInt();
        
        if (V>5){
            System.out.println("La valeur saisie est grande, vaut : " + V);
        }
        
        if (V<4){
            V = V+1;
            System.out.println("La valeur finale vaut " + V);
        }
    }
}
