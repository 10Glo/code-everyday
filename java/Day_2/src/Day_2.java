import java.util.Scanner;

/**
 * Problème
 * --------
 * Concevoir un programme et un ordinogramme qui calcule la somme de deux nombres.
 * Le programme est protégé par un mot de passe 'constantine'
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

public class Day_2 {

    public static void main(String[] args) {

        // --- Déclaration des Variables ---
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        String password = "";

        // --- Titre du projet ---
        System.out.println("==============================================");
        System.out.println(":::::::::      :::   :::   :::      ::::::::  \n" +
                ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n" +
                "+:+    +:+  +:+   +:+ +:+ +:+            +:+  \n" +
                "+#+    +:+ +#++:++#++: +#++:           +#+    \n" +
                "+#+    +#+ +#+     +#+  +#+          +#+      \n" +
                "#+#    #+# #+#     #+#  #+#         #+#       \n" +
                "#########  ###     ###  ###        ########## ");
        System.out.println("==============================================\n");

        // --- Ordinogramme ---
        System.out.println("\uD83D\uDD37    Organigramme de Programmation \n\n" +
                "                           [Début]\n" +
                "                              ↓\n" +
                "                       [Lire password]\n" +
                "                              ↓\n" +
                "           [password isEqual() 'constantine' ?]◄──\n" +
                "                    / Oui             Non \\\n" +
                "                   ↓                       ↓\n" +
                "   [Lire firstNumber & secondNumber]     [Fin]\n" +
                "               ↓\n" +
                "[firstNumber & secondNumber isNumber() ?]◄──\n" +
                "        / Oui             Non \\\n" +
                "       ↓\n" +
                "[Afficher Somme]"+
                "       ↓\n" +
                "     [Fin]\n");

        // --- Saisie du Mot de Passe ---
        System.out.println("\uD83D\uDD11️  Veuillez entrer le mot de passe :  ");
        password = scanner.nextLine();
        if (password.equals("constantine"))
            System.out.println("Le mot de passe est correct ✅\n");
        else {
            System.out.println("Le mot de passe n'est pas correct ❌");
            System.out.println("\nVeuillez Recommencer !!!");

            scanner.close();
            System.out.println("\nFin du programme ✅");
            System.exit(0);
        }


        // --- Saisie des informations ---
        try {
            System.out.print("➡️  Entrez le premier nombre : ");
            firstNumber = scanner.nextInt();

            System.out.print("➡️  Entrez le deuxième nombre : ");
            secondNumber = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("\n⚠️ Erreur : Vous devez entrer un nombre valide !\n");

            scanner.close();
            System.out.println("\nFin du programme ✅");
            System.exit(0);
        }

        // --- Résumé des informations ---
        System.out.println("\n-------------------------------------");
        System.out.println(" 📋 Résumé des informations saisies");
        System.out.println("-------------------------------------");
        System.out.println(" \uD83D\uDD22 Le premier nombre    : " + firstNumber);
        System.out.println(" \uD83D\uDD22 Le deuxième nombre    : " + secondNumber + "\n");

        // --- Résutats ---
        System.out.println("--------------");
        System.out.println(" 📋 Résutats");
        System.out.println("--------------\n");
        System.out.println("➡️  La somme de " + firstNumber + " et " + secondNumber + " est --> " + (firstNumber + secondNumber));

        // --- Message de fin ---
        scanner.close();
        System.out.println("Fin du programme ✅");
        System.out.println("-------------------------------------------");

    }

}
