"""
Problème
--------
Concevoir un programme qui détermine la somme d'une série de valeurs de taille n

Catégorie
---------
Numbers

Niveau
------
Débutant

@author
10Glo (https://github.com/10Glo)
@version 1.0
@since 17/09/2025
"""

def main():
    print("==============================================")
    print(":::::::::      :::   :::   :::     :::::::::: ")
    print(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ")
    print("+:+    +:+  +:+   +:+ +:+ +:+      +:+        ")
    print("+#+    +:+ +#++:++#++: +#++:       +#++:++#+  ")
    print("+#+    +#+ +#+     +#+  +#+               +#+ ")
    print("#+#    #+# #+#     #+#  #+#        #+#    #+# ")
    print("#########  ###     ###  ###         ########  ")
    print("==============================================\n")

    try:
        n = int(input("➡️  Entrez le Nombre de Valeurs que vous Souhaitez Sommer : "))
        if n < 0:
            print("\n⚠️ Le nombre des valeurs à sommer ne peut être négatif !!!")
            return
        elif n == 0:
            print("\n⚠️ Aucune valeur ne sera sommée car n = 0 !!!")
            return
    except ValueError:
        print("\n⚠️ Erreur : Vous devez entrer un nombre valide !")
        return

    sum_values = 0
    entered_numbers = []

    for i in range(1, n + 1):
        try:
            temp = int(input(f"➡️  Entrez le Nombre numéro {i} --> "))
            sum_values += temp
            entered_numbers.append(temp)
        except ValueError:
            print("⚠️ Valeur invalide !")
            return

    print("\n-------------------------------------")
    print(" 📋 Résumé des informations saisies")
    print("-------------------------------------")
    print(f" 🔢 Vous avez entré au total {n} nombres qui sont : {', '.join(map(str, entered_numbers))}\n")

    print("--------------")
    print(" 📋 Résultats")
    print("--------------")
    print(f"➡️  La somme est --> {sum_values}\n")

    print("Fin du programme ✅")
    print("-------------------------------------------")


if __name__ == "__main__":
    main()
