/**
 * Problème
 * --------
 * Concevoir un programme qui détermine la somme d'une série de valeurs de taille n
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
 * @since 17/09/2025
 */

import 'dart:io';

void main() {
  print("==============================================");
  print(":::::::::      :::   :::   :::     :::::::::: ");
  print(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ");
  print("+:+    +:+  +:+   +:+ +:+ +:+      +:+        ");
  print("+#+    +:+ +#++:++#++: +#++:       +#++:++#+  ");
  print("+#+    +#+ +#+     +#+  +#+               +#+ ");
  print("#+#    #+# #+#     #+#  #+#        #+#    #+# ");
  print("#########  ###     ###  ###         ########  ");
  print("==============================================\n");

  stdout.write("➡️  Entrez le Nombre de Valeurs que vous Souhaitez Sommer : ");
  String? input = stdin.readLineSync();
  int? n;

  try {
    n = int.parse(input!);
  } catch (e) {
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
    return;
  }

  if (n < 0) {
    print("\n⚠️ Le nombre des valeurs à sommer ne peut être négatif !!!");
    return;
  } else if (n == 0) {
    print("\n⚠️ Aucune valeur ne sera sommée car n = 0 !!!");
    return;
  }

  int sum = 0;
  List<int> enteredNumbers = [];

  for (int i = 1; i <= n; i++) {
    stdout.write("➡️  Entrez le Nombre numéro $i --> ");
    String? val = stdin.readLineSync();
    int? temp;

    try {
      temp = int.parse(val!);
    } catch (e) {
      print("⚠️ Valeur invalide !");
      return;
    }

    sum += temp;
    enteredNumbers.add(temp);
  }

  print("\n-------------------------------------");
  print(" 📋 Résumé des informations saisies");
  print("-------------------------------------");
  print(" 🔢 Vous avez entré au total $n nombres qui sont : ${enteredNumbers.join(", ")}\n");

  print("--------------");
  print(" 📋 Résultats");
  print("--------------");
  print("➡️  La somme est --> $sum\n");

  print("Fin du programme ✅");
  print("-------------------------------------------");
}
