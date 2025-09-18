"""
Problème
--------
Concevoir un programme qui détermine la moyenne, la variance et l'écart type d'une série de valeurs contenues dans une liste

Catégorie
---------
Numbers

Niveau
------
Débutant

@author 10Glo
@version 1.0
@since 17/09/2025
"""

import math

# --- Titre du projet ---
print("==============================================")
print(":::::::::      :::   :::   :::      ::::::::  ")
print(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ")
print(":+:    +:+  +:+   +:+ +:+ +:+      +:+        ")
print(":+:    +:+ +#++:++#++: +#++:       +#++:++#+  ")
print(":+:    +#+ +#+     +#+  +#+        +#+    +#+ ")
print("#+#    #+# #+#     #+#  #+#        #+#    #+# ")
print("#########  ###     ###  ###         ########  ")
print("==============================================\n")

try:
    # --- Saisie des Valeurs ---
    n = int(input("➡️  Entrez le Nombre de Valeurs contenues dans votre liste : "))

    if n < 0:
        print("\n⚠️ Le nombre de valeurs ne peut pas être négatif !!!")
        exit()
    elif n == 0:
        print("\n⚠️ Aucune valeur à traiter, n est égal à 0 !!!")
        exit()
    else:
        values = []
        for i in range(1, n + 1):
            temp = int(input(f"➡️  Entrez le Nombre numéro : {i} --> "))
            values.append(temp)

except ValueError:
    print("\n⚠️ Erreur : Vous devez entrer un nombre valide !")
    print("\nFin du programme ✅")
    exit()

# --- Résumé des informations ---
print("\n-------------------------------------")
print(" 📋 Résumé des informations saisies")
print("-------------------------------------")
print(f" 🔢 Vous avez entré au total {n} nombres qui sont : {', '.join(map(str, values))} \n")

# --- Calculs ---
sum_values = sum(values)
mean = sum_values / len(values)
variance = sum((x - mean) ** 2 for x in values) / len(values)
standard_deviation = math.sqrt(variance)

# --- Résultats ---
print("--------------")
print(" 📋 Résultats")
print("--------------")

print(f"➡️  La moyenne est --> {mean:.2f}")
print(f"➡️  La variance est --> {variance:.2f}")
print(f"➡️  L'écart type est --> {standard_deviation:.2f}\n")

# --- Message de fin ---
print("Fin du programme ✅")
print("-------------------------------------------")
