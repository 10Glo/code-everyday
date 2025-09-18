import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Problème
 * -------
 * Ecrire un programme qui calcule le prix de vente TTC (toutes taxes comprises) d'un article dont on connait le prix unitaire et la quantité.
 * Si le prix de vente TTC (toutes taxes comprises) est superieur  à 100, on accorde une réduction de 10%.
 * Le programme est protégé par un mot de passe 'anne' et Le TVA est de 16%.
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

public class Day_3 {

    public static void main(String[] args) {

        // --- Déclaration des Variables ---
        Scanner scanner = new Scanner(System.in);
        double unitPrice = 0, salesPriceIncludingAllTaxes = 0, salesPriceExcludingTax = 0;
        int quantity = 0;

        // formatteur pour 2 décimales
        DecimalFormat df = new DecimalFormat("#.##");

        String password = "", productName = "";

        // --- Titre du projet ---
        System.out.println("==============================================");
        System.out.println(":::::::::      :::   :::   :::      ::::::::  \n" +
                ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n" +
                "+:+    +:+  +:+   +:+ +:+ +:+             +:+ \n" +
                "+#+    +:+ +#++:++#++: +#++:           +#++:  \n" +
                "+#+    +#+ +#+     +#+  +#+               +#+ \n" +
                "#+#    #+# #+#     #+#  #+#        #+#    #+# \n" +
                "#########  ###     ###  ###         ########  ");
        System.out.println("==============================================\n");

        // --- Saisie du Mot de Passe ---
        System.out.println("\uD83D\uDD11️  Veuillez entrer le mot de passe :  ");
        password = scanner.nextLine();
        if (password.equals("anne"))
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
            System.out.print("➡️  Entrez le nom de l'article : ");
            productName = scanner.nextLine();

            System.out.print("➡️  Entrez le prix unitaire de l'article " + productName + " --> ");
            unitPrice = scanner.nextInt();

            System.out.print("➡️  Entrez la quantité de l'article " + productName + " --> ");
            quantity = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("\n⚠️ Erreur : Vous devez entrer un nombre valide pour le prix unitaire et la quantité de l'article !\n");

            scanner.close();
            System.out.println("\nFin du programme ✅");
            System.exit(0);
        }

        // --- Résumé des informations ---
        System.out.println("\n-------------------------------------");
        System.out.println(" 📋 Résumé des informations saisies");
        System.out.println("-------------------------------------");
        System.out.println("\uD83D\uDD20    Le nom de l'article : " + productName + "\n");
        System.out.println("\uD83D\uDD22    Le prix unitaire : " + unitPrice + "\n");
        System.out.println("\uD83D\uDD22    La quantité : " + quantity + "\n");

        // --- Résutats ---
        System.out.println("--------------");
        System.out.println(" 📋 Résutats");
        System.out.println("--------------\n");

        salesPriceExcludingTax = unitPrice * quantity;
        System.out.println("➡️  Le prix de vente hors taxes est  --> " + df.format(salesPriceExcludingTax) + " CDF\n");
        System.out.println("➡️  Le TVA(Taxe sur la Valeur Ajoutée) est de 16% ");
        salesPriceIncludingAllTaxes = salesPriceExcludingTax * (1 + 0.16);
        System.out.println("➡️  Le prix de vente toutes taxes comprises est  --> " + df.format(salesPriceIncludingAllTaxes) + " CDF\n");

        // --- Réduction ---
        if (salesPriceIncludingAllTaxes > 100)
            System.out.println("➡️  Une Réduction de 10% (" + df.format(salesPriceIncludingAllTaxes * 0.10) + " cdf) est appliqué au prix de vente toutes taxes comprises (" + df.format(salesPriceIncludingAllTaxes) + ") \nVoici le prix de vente final  --> " + df.format(salesPriceIncludingAllTaxes *  0.90) + " CDF\n");

        // --- Message de fin ---
        scanner.close();
        System.out.println("Fin du programme ✅");
        System.out.println("-------------------------------------------");

    }
}
