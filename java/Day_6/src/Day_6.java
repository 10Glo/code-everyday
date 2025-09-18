import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Problème
 * --------
 * Concevoir un programme qui determine la moyenne, la variance et l'ecart type d'une série de valeurs contenue dans une liste
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

public class Day_6 {

    public static void main(String[] args) {

        // --- Déclaration des Variables ---
        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 0, mean = 0, i = 0, temp = 0;
        double variance = 0, varianceTemp = 0, standardDeviation = 0, varianceSum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        StringBuilder enteredNumbers = new StringBuilder();

        // formatteur pour 2 décimales
        DecimalFormat df = new DecimalFormat("#.##");

        // --- Titre du projet ---
        System.out.println("==============================================");
        System.out.println(":::::::::      :::   :::   :::      ::::::::  \n" +
                ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n" +
                "+:+    +:+  +:+   +:+ +:+ +:+      +:+        \n" +
                "+#+    +:+ +#++:++#++: +#++:       +#++:++#+  \n" +
                "+#+    +#+ +#+     +#+  +#+        +#+    +#+ \n" +
                "#+#    #+# #+#     #+#  #+#        #+#    #+# \n" +
                "#########  ###     ###  ###         ########  ");
        System.out.println("==============================================\n");

        // --- Saisie des Valeurs ---
        try {
            System.out.print("➡️  Entrez le Nombre de Valeurs contenue dans votre liste : ");
            n = scanner.nextInt();

            if (n < 0)
                System.out.print("\nLe nombre des valeurs à sommer ne peut être négatif !!!");
            else if (n == 0)
                System.out.print("\nAucune valeur ne sera sommé n est égal á 0 !!!");
            else {
                do {
                    i += 1;
                    System.out.print("➡️  Entrez le Nombre numéro : " + i + " --> ");
                    temp = scanner.nextInt();
                    list.add(temp);
                    enteredNumbers.append(Integer.toString(temp));
                    if (i < n - 1)
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
        System.out.println(" \uD83D\uDD22 Vous avez entré au total " + n + " nombres qui sont : " + enteredNumbers + " \n");

        // --- Résutats ---
        System.out.println("--------------");
        System.out.println(" 📋 Résutats");
        System.out.println("--------------");

        // --- Calcul de la somme ---
        for (Integer value : list) {
            sum += value;
        }

        // --- Calcul de la moyenne ---
        mean += sum / list.size();

        // --- Calcul de la variance ---
        for (Integer value : list) {
            varianceTemp = Math.pow((value - mean), 2);
            varianceSum += varianceTemp;
        }
        variance = varianceSum / list.size();

        // --- Calcul de l'écart type ---
        standardDeviation = Math.sqrt(variance);

        System.out.println("\n➡️  La moyenne est --> " + mean );
        System.out.println("➡️  La variance est --> " + df.format(variance) );
        System.out.println("➡️  L'ecart type est --> " + df.format(standardDeviation) + "\n");

        // --- Message de fin ---
        scanner.close();
        System.out.println("Fin du programme ✅");
        System.out.println("-------------------------------------------");
    }
}
