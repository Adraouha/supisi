public class tp1_ex3 {
    public static void main(String[] args) {
        // Stocker dans une variable a le résultat de l’opération 3/4 et l'afficher
        double a = 3.0 / 4.0;
        System.out.println("Le résultat de 3/4 est : " + a);

        // Modifier l’opération 2+3*2-6/2 pour que le résultat final soit -4.0
        double resultat1 = 2 + 3 * 2 - 6.0 / 2;
        System.out.println("Le résultat de l'opération modifiée 2+3*2-6/2 est : " + resultat1);

        // Arranger l’opération 9+3*9%2 pour avoir 12 comme résultat
        int resultat2 = 9 + 3 * (9 % 2);
        System.out.println("Le résultat de l'opération 9+3*9%2 est : " + resultat2);
    }
}

