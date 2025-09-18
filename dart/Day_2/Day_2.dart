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
 * @author
 * 10Glo (https://github.com/10Glo)
 * @version 1.0
 * @since 16/09/2025
 */

import 'dart:io';

void main() {
  // --- Titre du projet ---
  print("==============================================");
  print(":::::::::      :::   :::   :::      ::::::::  \n"
      ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n"
      "+:+    +:+  +:+   +:+ +:+ +:+            +:+  \n"
      "+#+    +:+ +#++:++#++: +#++:           +#+    \n"
      "+#+    +#+ +#+     +#+  +#+          +#+      \n"
      "#+#    #+# #+#     #+#  #+#         #+#       \n"
      "#########  ###     ###  ###        ########## ");
  print("==============================================\n");

  // --- Ordinogramme ---
  print("🔷    Organigramme de Programmation\n\n"
      "                           [Début]\n"
      "                              ↓\n"
      "                       [Lire password]\n"
      "                              ↓\n"
      "           [password == 'constantine' ?]◄──\n"
      "                    / Oui             Non \\\n"
      "                   ↓                       ↓\n"
      "   [Lire firstNumber & secondNumber]     [Fin]\n"
      "               ↓\n"
      "[firstNumber & secondNumber isNumber() ?]◄──\n"
      "        / Oui             Non \\\n"
      "       ↓\n"
      "[Afficher Somme]"
      "       ↓\n"
      "     [Fin]\n");

  // --- Mot de passe ---
  stdout.write("🔑 Veuillez entrer le mot de passe : ");
  String? password = stdin.readLineSync();

  if (password != "constantine") {
    print("Le mot de passe n'est pas correct ❌");
    print("\nVeuillez Recommencer !!!");
    print("\nFin du programme ✅");
    exit(0);
  }

  print("Le mot de passe est correct ✅\n");

  // --- Saisie des nombres ---
  int firstNumber = 0;
  int secondNumber = 0;

  try {
    stdout.write("➡️  Entrez le premier nombre : ");
    firstNumber = int.parse(stdin.readLineSync()!);

    stdout.write("➡️  Entrez le deuxième nombre : ");
    secondNumber = int.parse(stdin.readLineSync()!);
  } catch (e) {
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !\n");
    print("Fin du programme ✅");
    exit(0);
  }

  // --- Résumé ---
  print("\n-------------------------------------");
  print(" 📋 Résumé des informations saisies");
  print("-------------------------------------");
  print("🔢 Le premier nombre    : $firstNumber");
  print("🔢 Le deuxième nombre   : $secondNumber\n");

  // --- Résultats ---
  print("--------------");
  print(" 📋 Résultats");
  print("--------------\n");
  print("➡️  La somme de $firstNumber et $secondNumber est --> ${firstNumber + secondNumber}");

  // --- Fin ---
  print("Fin du programme ✅");
  print("-------------------------------------------");
}
