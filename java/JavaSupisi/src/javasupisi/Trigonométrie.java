/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package javasupisi;

/**
 *Soit a = 30° et b = 60°

1. Évaluez les formules suivantes : sin(a + b) et cos(a - b).
2. Calculez et affichez à la console la tangente de l’angle a (tan(a)).

 * @author adrao
 */
public class Trigonométrie {
     public static void main(String[] args) {
// 1. Évaluez les formules suivantes : sin(a + b) et cos(a - b).
     
//DECLARATION DE VARIABLES
          
        double a = Math.toRadians(30);
        double b = Math.toRadians(60);

        // Calcul des formules
        double sinResult = Math.sin(a + b);
        double cosResult = Math.cos(a - b);

        // Affichage des résultats
        System.out.println("sin(a + b) = " + sinResult);
        System.out.println("cos(a - b) = " + cosResult);
        
        System.out.println("::::::::::::::::::::::::::::::");
        
        //2. Calculez et affichez à la console la tangente de l’angle a (tan(a)).
double tanA = Math.tan(a);
System.out.println("tan(a) = " + tanA);

     }
    
}
