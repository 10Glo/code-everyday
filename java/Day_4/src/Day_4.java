import java.util.Scanner;

/**
 * Problème
 * --------
 * Concevoir un programme qui demande l'age d'une personne.
 * Ensuite, l'informe de sa catégorie ("Enfance : de 0 à 12ans", "Adolescence : De 12 à 18 ans,"
 * "Âge Adulte : De 18 à 65 ans" et "Séniors ou Personnes âgées : À partir de 65 ans")
 *
 * Catégorie
 * ---------
 * Numbers
 *
 * Niveau
 * ------
 * Débutant
 *
 * @author 10Glo (https://github.com/10Glo)
 * @version 1.0
 * @since 16/09/2025
 */

public class Day_4 {

    public static void main(String[] args) {

        // --- Déclaration des Variables ---
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        // --- Titre du projet ---
        System.out.println("==============================================");
        System.out.println(":::::::::      :::   :::   :::         :::     \n" +
                ":+:    :+:   :+: :+: :+:   :+:        :+:      \n" +
                "+:+    +:+  +:+   +:+ +:+ +:+        +:+ +:+   \n" +
                "+#+    +:+ +#++:++#++: +#++:        +#+  +:+   \n" +
                "+#+    +#+ +#+     +#+  +#+        +#+#+#+#+#+ \n" +
                "#+#    #+# #+#     #+#  #+#              #+#   \n" +
                "#########  ###     ###  ###              ###   ");
        System.out.println("==============================================\n");

        // --- Saisie de l'âge ---
        try {
            System.out.print("➡️  Entrez votre âge (Entrez juste le nombre) : ");
            age = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("\n⚠️ Erreur : Vous devez entrer un nombre valide !");

            scanner.close();
            System.out.println("\nFin du programme ✅");
            System.exit(0);
        }

        // --- Résumé des informations ---
        System.out.println("\n-------------------------------------");
        System.out.println(" 📋 Résumé des informations saisies");
        System.out.println("-------------------------------------");
        System.out.println(" \uD83D\uDD22 L'âge que vous avez entré : " + age + " ans\n");

        // --- Résutats ---
        System.out.println("--------------");
        System.out.println(" 📋 Résutats");
        System.out.println("--------------");

        // --- Régles ---
        if (age < 0)
            System.out.println("Votre âge ne peux être négatif'\n");
        else if (age <= 12)
            System.out.println("➡️  Votre catégorie est 'ENFANT'\n");
        else if (age <= 18)
            System.out.println("➡️  Votre catégorie est 'ADOLESCENCE'\n");
        else if (age <= 65)
            System.out.println("➡️  Votre catégorie est 'ADULTE'\n");
        else
            System.out.println("➡️  Votre catégorie est 'SÉNIORS'\n");

        // --- Message de fin ---
        scanner.close();
        System.out.println("Fin du programme ✅");
        System.out.println("-------------------------------------------");


    }
}
