/**
 * Problème
 * -------
 * Écrire un programme qui calcule le prix de vente TTC (toutes taxes comprises) d'un article
 * dont on connaît le prix unitaire et la quantité.
 * Si le prix de vente TTC est supérieur à 100, on accorde une réduction de 10%.
 * Le programme est protégé par un mot de passe 'anne' et la TVA est de 16%.
 *
 * Catégorie
 * ---------
 * Numbers
 *
 * Niveau
 * ------
 * Débutant
 */

import 'dart:io';

void main() {

  // --- Variables ---
  double unitPrice = 0, salesPriceExclTax = 0, salesPriceInclTaxes = 0;
  int quantity = 0;
  String productName = "";
  const double TVA = 0.16;

  // --- Titre du projet ---
  print("==============================================");
  print(":::::::::      :::   :::   :::      ::::::::  ");
  print(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ");
  print(":+:    +:+  +:+   +:+ +:+ +:+             +:+ ");
  print("+#+    +:+ +#++:++#++: +#++:           +#++:  ");
  print("+#+    +#+ +#+     +#+  +#+               +#+ ");
  print("#+#    #+# #+#     #+#  #+#        #+#    #+# ");
  print("#########  ###     ###  ###         ########  ");
  print("==============================================\n");

  // --- Mot de passe ---
  stdout.write("🔑 Veuillez entrer le mot de passe : ");
  String? password = stdin.readLineSync();

  if (password != "anne") {
    print("❌ Le mot de passe n'est pas correct !");
    print("\nVeuillez recommencer !!!");
    print("\nFin du programme ✅");
    exit(0);
  }

  print("✅ Le mot de passe est correct\n");

  try {
    // --- Nom du produit ---
    stdout.write("➡️  Entrez le nom de l'article : ");
    productName = stdin.readLineSync() ?? "";

    // --- Prix unitaire ---
    stdout.write("➡️  Entrez le prix unitaire de l'article $productName --> ");
    unitPrice = double.parse(stdin.readLineSync()!);

    // --- Quantité ---
    stdout.write("➡️  Entrez la quantité de l'article $productName --> ");
    quantity = int.parse(stdin.readLineSync()!);
  } catch (e) {
    print(
        "\n⚠️ Erreur : Vous devez entrer un nombre valide pour le prix unitaire et la quantité !\n");
    print("\nFin du programme ✅");
    exit(0);
  }

  // --- Résumé ---
  print("\n-------------------------------------");
  print(" 📋 Résumé des informations saisies");
  print("-------------------------------------");
  print("🔠    Le nom de l'article : $productName");
  print("🔢    Le prix unitaire : ${unitPrice.toStringAsFixed(2)}");
  print("🔢    La quantité : $quantity\n");

  // --- Calculs ---
  print("--------------");
  print(" 📋 Résultats");
  print("--------------\n");

  salesPriceExclTax = unitPrice * quantity;
  print(
      "➡️  Le prix de vente hors taxes est  --> ${salesPriceExclTax.toStringAsFixed(2)} CDF\n");

  print("➡️  La TVA (Taxe sur la Valeur Ajoutée) est de 16%");
  salesPriceInclTaxes = salesPriceExclTax * (1 + TVA);
  print(
      "➡️  Le prix de vente toutes taxes comprises est  --> ${salesPriceInclTaxes.toStringAsFixed(2)} CDF\n");

  // --- Réduction ---
  if (salesPriceInclTaxes > 100) {
    double reduction = salesPriceInclTaxes * 0.10;
    double finalPrice = salesPriceInclTaxes * 0.90;
    print(
        "➡️  Une Réduction de 10% (${reduction.toStringAsFixed(2)} CDF) est appliquée au prix TTC (${salesPriceInclTaxes.toStringAsFixed(2)})");
    print(
        "Voici le prix de vente final  --> ${finalPrice.toStringAsFixed(2)} CDF\n");
  }

  // --- Fin ---
  print("Fin du programme ✅");
  print("-------------------------------------------");
}
