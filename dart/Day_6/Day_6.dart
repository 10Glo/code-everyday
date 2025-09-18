/**
 * Problème
 * --------
 * Concevoir un programme qui détermine la moyenne, la variance et l'écart type
 * d'une série de valeurs contenues dans une liste
 *
 * Catégorie
 * ---------
 * Numbers
 *
 * Niveau
 * ------
 * Débutant
 *
 * @author 10Glo
 * @version 1.0
 * @since 17/09/2025
 */

import 'dart:io';
import 'dart:math';

void main() {
  // --- Titre du projet ---
  print("==============================================");
  print(":::::::::      :::   :::   :::      ::::::::  ");
  print(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ");
  print(":+:    +:+  +:+   +:+ +:+ +:+      +:+        ");
  print(":+:    +:+ +#++:++#++: +#++:       +#++:++#+  ");
  print(":+:    +#+ +#+     +#+  +#+        +#+    +#+ ");
  print("#+#    #+# #+#     #+#  #+#        #+#    #+# ");
  print("#########  ###     ###  ###         ########  ");
  print("==============================================\n");

  // --- Saisie du nombre de valeurs ---
  stdout.write("➡️  Entrez le Nombre de Valeurs contenues dans votre liste : ");
  String? input = stdin.readLineSync();
  int? n = int.tryParse(input ?? "");

  if (n == null) {
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
    print("\nFin du programme ✅");
    return;
  } else if (n < 0) {
    print("\n⚠️ Le nombre de valeurs ne peut pas être négatif !!!");
    return;
  } else if (n == 0) {
    print("\n⚠️ Aucune valeur à traiter, n est égal à 0 !!!");
    return;
  }

  List<int> values = [];

  // --- Saisie des valeurs ---
  for (int i = 1; i <= n; i++) {
    stdout.write("➡️  Entrez le Nombre numéro $i --> ");
    String? val = stdin.readLineSync();
    int? temp = int.tryParse(val ?? "");

    if (temp == null) {
      print("\n⚠️ Valeur invalide !");
      return;
    }

    values.add(temp);
  }

  // --- Résumé des informations ---
  print("\n-------------------------------------");
  print(" 📋 Résumé des informations saisies");
  print("-------------------------------------");
  print(" 🔢 Vous avez entré au total $n nombres qui sont : ${values.join(", ")} \n");

  // --- Calculs ---
  int sum = values.reduce((a, b) => a + b);
  double mean = sum / values.length;
  double variance = values
      .map((x) => pow(x - mean, 2))
      .reduce((a, b) => a + b) /
      values.length;
  double stdDev = sqrt(variance);

  // --- Résultats ---
  print("--------------");
  print(" 📋 Résultats");
  print("--------------");

  print("➡️  La moyenne est --> ${mean.toStringAsFixed(2)}");
  print("➡️  La variance est --> ${variance.toStringAsFixed(2)}");
  print("➡️  L'écart type est --> ${stdDev.toStringAsFixed(2)}\n");

  // --- Message de fin ---
  print("Fin du programme ✅");
  print("-------------------------------------------");
}
