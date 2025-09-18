/**
 * Problème
 * --------
 * Concevoir un programme qui demande l'âge d'une personne.
 * Ensuite, l'informe de sa catégorie :
 * - "Enfance : de 0 à 12 ans"
 * - "Adolescence : de 12 à 18 ans"
 * - "Âge Adulte : de 18 à 65 ans"
 * - "Séniors ou Personnes âgées : À partir de 65 ans"
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
  print(":::::::::      :::   :::   :::         :::     ");
  print(":+:    :+:   :+: :+: :+:   :+:        :+:      ");
  print("+:+    +:+  +:+   +:+ +:+ +:+        +:+ +:+   ");
  print("+#+    +:+ +#++:++#++: +#++:        +#+  +:+   ");
  print("+#+    +#+ +#+     +#+  +#+        +#+#+#+#+#+ ");
  print("#+#    #+# #+#     #+#  #+#              #+#   ");
  print("#########  ###     ###  ###              ###   ");
  print("==============================================\n");

  // --- Saisie de l'âge ---
  stdout.write("➡️  Entrez votre âge (Entrez juste le nombre) : ");
  String? input = stdin.readLineSync();

  int? age;
  try {
    age = int.parse(input!);
  } catch (e) {
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
    print("\nFin du programme ✅");
    return;
  }

  // --- Résumé des informations ---
  print("\n-------------------------------------");
  print(" 📋 Résumé des informations saisies");
  print("-------------------------------------");
  print(" 🔢 L'âge que vous avez entré : $age ans\n");

  // --- Résultats ---
  print("--------------");
  print(" 📋 Résultats");
  print("--------------");

  if (age < 0) {
    print("Votre âge ne peut pas être négatif.\n");
  } else if (age <= 12) {
    print("➡️  Votre catégorie est 'ENFANT'\n");
  } else if (age <= 18) {
    print("➡️  Votre catégorie est 'ADOLESCENCE'\n");
  } else if (age <= 65) {
    print("➡️  Votre catégorie est 'ADULTE'\n");
  } else {
    print("➡️  Votre catégorie est 'SÉNIORS'\n");
  }

  // --- Message de fin ---
  print("Fin du programme ✅");
  print("-------------------------------------------");
}
