import java.util.Scanner;

/**
 * Problème
 * -------
 * Ecrire un programme qui demande deux nombres à l'utilisateur et l'informe ensuite
 * Si le produit est positif, egatif ou Neutre, Attention toutefois on ne doit pas calculer le produit
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
 * @since 15/09/2025
 */

public class Day_1 {
    public static void main(String[] args) {

        // --- Déclaration des Variables ---
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        // --- Titre du projet ---
        System.out.println("==============================================");
        System.out.println(":::::::::      :::     :::   :::         :::   \n" +
                ":+:    :+:   :+: :+:   :+:   :+:       :+:+:   \n" +
                "+:+    +:+  +:+   +:+   +:+ +:+          +:+   \n" +
                "+#+    +:+ +#++:++#++:   +#++:           +#+   \n" +
                "+#+    +#+ +#+     +#+    +#+            +#+   \n" +
                "#+#    #+# #+#     #+#    #+#            #+#   \n" +
                "#########  ###     ###    ###          ####### ");
        System.out.println("==============================================\n");

        // --- Saisie des informations ---
        try {
            System.out.print("➡️  Entrez le premier nombre : ");
            firstNumber = scanner.nextInt();

            System.out.print("➡️  Entrez le deuxième nombre : ");
            secondNumber = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
        } finally {
            scanner.close();
            System.out.println("Fin du programme ✅");
            System.exit(0);
        }

        // --- Résumé des informations ---
        System.out.println("\n-------------------------------------");
        System.out.println(" 📋 Résumé des informations saisies");
        System.out.println("-------------------------------------");
        System.out.println(" \uD83D\uDD22 Le premier nombre    : " + firstNumber);
        System.out.println(" \uD83D\uDD22 Le deuxième nombre    : " + secondNumber + "\n");
        System.out.println("Voici la règle : \n\n" +
                "*   Si les deux nombres sont positifs ou si les deux nombres sont négatifs, leur produit est positif\n" +
                "*   Si un nombre est positif et l'autre est négatif, leur produit est négatif\n" +
                "*   Si l'un des nombres est 0, alors le produit des deux nombres est toujours 0\n\n" +
                "En résumé :\n\n" +
                "*   Paire de nombres positifs :  Produit positif\n" +
                "*   Paire de nombres négatifs :Produit positif\n" +
                "*   Un positif, un négatif : Produit négatif\n" +
                "*   Paire de zéro ou Un zéro: Produit Neutre");


        // --- Résumé des informations ---
        System.out.println("--------------");
        System.out.println(" 📋 Résutats");
        System.out.println("--------------");

        if (firstNumber > 0 && secondNumber > 0)
            System.out.println("➡️  Le Résultat est 'POSITIF'");
        else if (firstNumber < 0 && secondNumber < 0)
            System.out.println("➡️  Le Résultat est 'POSITIF'");
        else if (firstNumber == 0 || secondNumber == 0)
            System.out.println("➡️  Le Résultat est 'NEUTRE'");
        else
            System.out.println("➡️  Le Résultat est 'NÉGATIF'\n\n");

        // --- Message de fin ---
        scanner.close();
        System.out.println("Fin du programme ✅");
        System.out.println("-------------------------------------------");
    }
}
