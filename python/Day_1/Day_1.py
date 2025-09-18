# -*- coding: utf-8 -*-
"""
Problème
--------
Écrire un programme qui demande deux nombres à l'utilisateur et l'informe ensuite
Si le produit est positif, négatif ou neutre, ATTENTION : on ne doit pas calculer le produit.

Catégorie
---------
Numbers

Niveau
------
Débutant

@author 10Glo (https://github.com/10Glo)
@version 1.0
@since 15/09/2025
"""

def main():
    # --- Titre du projet ---
    print("==============================================")
    print(""":::::::::      :::     :::   :::         :::
:+:    :+:   :+: :+:   :+:   :+:       :+:+:
+:+    +:+  +:+   +:+   +:+ +:+          +:+
+#+    +:+ +#++:++#++:   +#++:           +#+
+#+    +#+ +#+     +#+    +#+            +#+
#+#    #+# #+#     #+#    #+#            #+#
#########  ###     ###    ###          #######""")
    print("==============================================\n")

    try:
        # --- Saisie des informations ---
        first_number = int(input("➡️  Entrez le premier nombre : "))
        second_number = int(input("➡️  Entrez le deuxième nombre : "))
    except ValueError:
        print("\n⚠️ Erreur : Vous devez entrer un nombre valide !")
        print("Fin du programme ✅")
        return

    # --- Résumé des informations ---
    print("\n-------------------------------------")
    print(" 📋 Résumé des informations saisies")
    print("-------------------------------------")
    print(f"🔢 Le premier nombre    : {first_number}")
    print(f"🔢 Le deuxième nombre   : {second_number}\n")
    print("Voici la règle : \n\n"
          "*   Si les deux nombres sont positifs ou si les deux nombres sont négatifs, leur produit est positif\n"
          "*   Si un nombre est positif et l'autre est négatif, leur produit est négatif\n"
          "*   Si l'un des nombres est 0, alors le produit des deux nombres est toujours 0\n\n"
          "En résumé :\n\n"
          "*   Paire de nombres positifs : Produit positif\n"
          "*   Paire de nombres négatifs : Produit positif\n"
          "*   Un positif, un négatif    : Produit négatif\n"
          "*   Paire de zéro ou Un zéro  : Produit Neutre")

    # --- Résultats ---
    print("--------------")
    print(" 📋 Résultats")
    print("--------------")

    # --- Régles ---
    if first_number > 0 and second_number > 0:
        print("➡️  Le Résultat est 'POSITIF'")
    elif first_number < 0 and second_number < 0:
        print("➡️  Le Résultat est 'POSITIF'")
    elif first_number == 0 or second_number == 0:
        print("➡️  Le Résultat est 'NEUTRE'")
    else:
        print("➡️  Le Résultat est 'NÉGATIF'\n\n")

    # --- Message de fin ---
    print("Fin du programme ✅")
    print("-------------------------------------------")


if __name__ == "__main__":
    main()
