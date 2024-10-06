import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Afficher le message de bienvenue
        System.out.println("Bienvenue au parcours Java");

        // Stocker le nom dans une variable et afficher le message personnalisé
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bienvenue " + nom + " au parcours Java");

        // Afficher la somme de deux valeurs numériques
        System.out.print("Entrez la première valeur : ");
        int valeur1 = scanner.nextInt();
        System.out.print("Entrez la deuxième valeur : ");
        int valeur2 = scanner.nextInt();
        int somme = valeur1 + valeur2;
        System.out.println("La somme vaut : " + somme);
    }
}

