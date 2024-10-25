/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasupisi;

import java.util.Scanner;

/**
 *
 * @author Hassan ADRAOU
 * 1. Soit la variable age représentant lige d'une personne. 
 * Lorsque age >18 affichez: « cette personne est adulte » 
 * si non affichez le message « cette persoane est n'est pas adulte » 
 * 
 * 2. Avec le méme principe de la premiére question 
 * si age >18 affchez « cette personne est adulte », 
 * si non si age >15 affichez «cette personne est adolescente » 
 * si affichez «cette personae est petite». 

 */
public class Tp3_ex2_Supisi {
     public static void main(String[] args) {
     Scanner numero = new Scanner(System.in);
     System.out.println("Entrez une age : ");
     
     int age = numero.nextInt();
     
     // Verifier si la personne est adulte (Age >=18)
     if (age >=18){
         
         System.out.println("Cette personne est adulte.a "+age +" ans.");
     } else {
              // Verifier si la personne -18 est adolescente (Age >=15)

     System.out.println("Cette personne n'est pas adulte.");
     
     if (age >= 15){
              System.out.println("Cette personne adolescente, a "+age +" ans.");

     } else {
         System.out.println("Cette personne est petite, a "+age +" ans.");
     }
     }
     
         
     }
}
