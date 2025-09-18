"""
Problème
--------
Concevoir un programme et un ordinogramme qui calcule la somme de deux nombres.
Le programme est protégé par un mot de passe 'constantine'

Catégorie
---------
Numbers

Niveau
------
Débutant

@author
10Glo (https://github.com/10Glo)
@version 1.0
@since 16/09/2025
"""

# --- Titre du projet ---
print("==============================================")
print(":::::::::      :::   :::   :::      ::::::::  \n"
      ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n"
      "+:+    +:+  +:+   +:+ +:+ +:+            +:+  \n"
      "+#+    +:+ +#++:++#++: +#++:           +#+    \n"
      "+#+    +#+ +#+     +#+  +#+          +#+      \n"
      "#+#    #+# #+#     #+#  #+#         #+#       \n"
      "#########  ###     ###  ###        ########## ")
print("==============================================\n")

# --- Ordinogramme ---
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
      "     [Fin]\n")

# --- Mot de passe ---
password = input("🔑 Veuillez entrer le mot de passe : ")

if password != "constantine":
    print("Le mot de passe n'est pas correct ❌")
    print("\nVeuillez Recommencer !!!")
    print("\nFin du programme ✅")
    exit()

print("Le mot de passe est correct ✅\n")

# --- Saisie des nombres ---
try:
    first_number = int(input("➡️  Entrez le premier nombre : "))
    second_number = int(input("➡️  Entrez le deuxième nombre : "))
except ValueError:
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !\n")
    print("Fin du programme ✅")
    exit()

# --- Résumé ---
print("\n-------------------------------------")
print(" 📋 Résumé des informations saisies")
print("-------------------------------------")
print("🔢 Le premier nombre    : ", first_number)
print("🔢 Le deuxième nombre   : ", second_number, "\n")

# --- Résultats ---
print("--------------")
print(" 📋 Résultats")
print("--------------\n")
print(f"➡️  La somme de {first_number} et {second_number} est --> {first_number + second_number}")

# --- Fin ---
print("Fin du programme ✅")
print("-------------------------------------------")
