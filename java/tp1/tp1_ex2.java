    import java.util.Scanner;

public class tp1_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Récupérer et afficher le message
        System.out.print("Entrez le message : ");
        String message = scanner.nextLine();
        System.out.println(message);

        // Saisir dynamiquement le nom et afficher le message personnalisé
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bienvenue " + nom + " au parcours Java");

        // Récupérer une valeur numérique, la multiplier par 4 et afficher le résultat
        System.out.print("Entrez une valeur numérique : ");
        int valeur = scanner.nextInt();
        int resultat = valeur * 4;
        System.out.println("La valeur fois quatre vaut : " + resultat);
    }
}


