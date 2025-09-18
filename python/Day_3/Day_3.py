import sys

def main():
    # --- Variables ---
    unit_price = 0
    sales_price_incl_taxes = 0
    sales_price_excl_tax = 0
    quantity = 0
    product_name = ""
    password = ""

    # --- Titre du projet ---
    print("==============================================")
    print(":::::::::      :::   :::   :::      ::::::::  ")
    print(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ")
    print(":+:    +:+  +:+   +:+ +:+ +:+             +:+ ")
    print(":+:    +:+ +#++:++#++: +#++:           +#++:  ")
    print(":+:    +#+ +#+     +#+  +#+               +#+ ")
    print(":#:    #+# #+#     #+#  #+#        #+#    #+# ")
    print("#########  ###     ###  ###         ########  ")
    print("==============================================\n")

    # --- Mot de passe ---
    password = input("🔑 Veuillez entrer le mot de passe : ")
    if password == "anne":
        print("Le mot de passe est correct ✅\n")
    else:
        print("Le mot de passe n'est pas correct ❌")
        print("\nVeuillez Recommencer !!!")
        print("\nFin du programme ✅")
        sys.exit(0)

    try:
        # --- Infos Article ---
        product_name = input("➡️  Entrez le nom de l'article : ")

        unit_price = float(input(f"➡️  Entrez le prix unitaire de l'article {product_name} --> "))
        quantity = int(input(f"➡️  Entrez la quantité de l'article {product_name} --> "))

    except ValueError:
        print("\n⚠️ Erreur : Vous devez entrer un nombre valide pour le prix unitaire et la quantité !\n")
        print("\nFin du programme ✅")
        sys.exit(0)

    # --- Résumé ---
    print("\n-------------------------------------")
    print(" 📋 Résumé des informations saisies")
    print("-------------------------------------")
    print(f"🔠    Le nom de l'article : {product_name}\n")
    print(f"🔢    Le prix unitaire : {unit_price}\n")
    print(f"🔢    La quantité : {quantity}\n")

    # --- Résultats ---
    print("--------------")
    print(" 📋 Résultats")
    print("--------------\n")

    sales_price_excl_tax = unit_price * quantity
    print(f"➡️  Le prix de vente hors taxes est  --> {sales_price_excl_tax:.2f} CDF\n")

    print("➡️  Le TVA(Taxe sur la Valeur Ajoutée) est de 16%")
    sales_price_incl_taxes = sales_price_excl_tax * (1 + 0.16)
    print(f"➡️  Le prix de vente toutes taxes comprises est  --> {sales_price_incl_taxes:.2f} CDF\n")

    # --- Réduction ---
    if sales_price_incl_taxes > 100:
        reduction = sales_price_incl_taxes * 0.10
        final_price = sales_price_incl_taxes * 0.90
        print(f"➡️  Une Réduction de 10% ({reduction:.2f} cdf) est appliquée au prix TTC ({sales_price_incl_taxes:.2f})")
        print(f"Voici le prix de vente final  --> {final_price:.2f} CDF\n")

    # --- Fin ---
    print("Fin du programme ✅")
    print("-------------------------------------------")


if __name__ == "__main__":
    main()
