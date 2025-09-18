import java.util.Scanner;

/**
 * Problème
 * --------
 * Concevoir un programme qui determine la somme d'une série de valeurs de taille n
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
 * @since 17/09/2025
 */

public class Day_5 {

    public static void main(String[] args) {

        // --- Déclaration des Variables ---
        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 0, i = 0, temp = 0;
        StringBuilder enteredNumbers = new StringBuilder();

        // --- Titre du projet ---
        System.out.println("==============================================");
        System.out.println(":::::::::      :::   :::   :::     :::::::::: \n" +
                ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n" +
                "+:+    +:+  +:+   +:+ +:+ +:+      +:+        \n" +
                "+#+    +:+ +#++:++#++: +#++:       +#++:++#+  \n" +
                "+#+    +#+ +#+     +#+  +#+               +#+ \n" +
                "#+#    #+# #+#     #+#  #+#        #+#    #+# \n" +
                "#########  ###     ###  ###         ########  ");
        System.out.println("==============================================\n");

        // --- Saisie des Valeurs ---
        try {
            System.out.print("➡️  Entrez le Nombre de Valeurs que vous Souhaitez Sommer : ");
            n = scanner.nextInt();

            if (n < 0)
                System.out.print("\nLe nombre des valeurs à sommer ne peut être négatif !!!");
            else if (n == 0)
                System.out.print("\nAucune valeur ne sera sommé n est égal á 0 !!!");
            else {
                do {
                    i += 1;
                    System.out.print("➡️  Entrez le Nombre numéro : " + i +" --> ");
                    temp = scanner.nextInt();
                    sum += temp;
                    enteredNumbers.append(Integer.toString(temp));
                    if(i < n - 1)
                        enteredNumbers.append(", ");
                    else if (i == n - 1)
                        enteredNumbers.append(" et ");
                } while (i <= n - 1);
            }
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
        System.out.println(" \uD83D\uDD22 Vous avez entré au total " + n + " nombres qui sont : "+ enteredNumbers +" \n");

        // --- Résutats ---
        System.out.println("--------------");
        System.out.println(" 📋 Résutats");
        System.out.println("--------------");
        System.out.println("➡️  La somme est --> "+sum+"\n");

        // --- Message de fin ---
        scanner.close();
        System.out.println("Fin du programme ✅");
        System.out.println("-------------------------------------------");
    }
}
