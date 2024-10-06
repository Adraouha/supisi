import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class tp1_ex4 {
    public static void main(String[] args) {
        // Obtenir la date courante
        LocalDate dateCourante = LocalDate.now();
        // Obtenir l'heure courante
        LocalTime heureCourante = LocalTime.now();
        
        // Formater l'heure courante
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String heureFormatee = heureCourante.format(formatter);

        // Codes ANSI pour le texte rouge
        String rouge = "\u001B[31m";
        String reset = "\u001B[0m";

        // Afficher la date courante en rouge
        System.out.println(rouge + "La date courante est : " + dateCourante + reset);
        // Afficher l'heure courante en rouge
        System.out.println(rouge + "L'heure courante est : " + heureFormatee + reset);
    }
}

