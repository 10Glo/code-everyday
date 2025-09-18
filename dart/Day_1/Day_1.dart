/**
 * Problème
 * -------
 * Écrire un programme qui demande deux nombres à l'utilisateur et l'informe ensuite
 * Si le produit est positif, négatif ou neutre, mais ATTENTION on ne doit pas calculer le produit.
 *
 * Catégorie
 * ---------
 * Numbers
 *
 * Niveau
 * ------
 * Débutant
 *
 * @author
 * 10Glo (https://github.com/10Glo)
 * @version 1.0
 * @since 15/09/2025
 */

import 'dart:io';

void main() {
  // --- Déclaration des Variables ---
  int firstNumber = 0;
  int secondNumber = 0;

  // --- Titre du projet ---
  print("==============================================");
  print(":::::::::      :::     :::   :::         :::   \n"
      ":+:    :+:   :+: :+:   :+:   :+:       :+:+:   \n"
      "+:+    +:+  +:+   +:+   +:+ +:+          +:+   \n"
      "+#+    +:+ +#++:++#++:   +#++:           +#+   \n"
      "+#+    +#+ +#+     +#+    +#+            +#+   \n"
      "#+#    #+# #+#     #+#    #+#            #+#   \n"
      "#########  ###     ###    ###          ####### ");
  print("==============================================\n");

  // --- Saisie des informations ---
  try {
    stdout.write("➡️  Entrez le premier nombre : ");
    firstNumber = int.parse(stdin.readLineSync()!);

    stdout.write("➡️  Entrez le deuxième nombre : ");
    secondNumber = int.parse(stdin.readLineSync()!);
  } catch (e) {
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
    print("\nFin du programme ✅");
    exit(0);
  }

  // --- Résumé des informations ---
  print("\n-------------------------------------");
  print(" 📋 Résumé des informations saisies");
  print("-------------------------------------");
  print(" 🔢 Le premier nombre    : $firstNumber");
  print(" 🔢 Le deuxième nombre   : $secondNumber\n");

  print("Voici la règle : \n\n"
      "* Si les deux nombres sont positifs ou si les deux nombres sont négatifs, leur produit est positif\n"
      "* Si un nombre est positif et l'autre est négatif, leur produit est négatif\n"
      "* Si l'un des nombres est 0, alors le produit des deux nombres est toujours 0\n\n"
      "En résumé :\n\n"
      "* Paire de nombres positifs : Produit positif\n"
      "* Paire de nombres négatifs : Produit positif\n"
      "* Un positif, un négatif : Produit négatif\n"
      "* Paire de zéro ou un zéro : Produit neutre\n");

  // --- Résultats ---
  print("--------------");
  print(" 📋 Résultats");
  print("--------------");

  if (firstNumber > 0 && secondNumber > 0) {
    print("➡️  Le Résultat est 'POSITIF'");
  } else if (firstNumber < 0 && secondNumber < 0) {
    print("➡️  Le Résultat est 'POSITIF'");
  } else if (firstNumber == 0 || secondNumber == 0) {
    print("➡️  Le Résultat est 'NEUTRE'");
  } else {
    print("➡️  Le Résultat est 'NÉGATIF'");
  }

  // --- Message de fin ---
  print("\nFin du programme ✅");
  print("-------------------------------------------");
}
