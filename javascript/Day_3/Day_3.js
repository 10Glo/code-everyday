/**
 * Problème
 * -------
 * Écrire un programme qui calcule le prix de vente TTC (toutes taxes comprises) d'un article
 * dont on connaît le prix unitaire et la quantité.
 * Si le prix de vente TTC est supérieur à 100, on accorde une réduction de 10%.
 * Le programme est protégé par un mot de passe 'anne' et la TVA est de 16%.
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

const readline = require("readline");

// --- Setup de readline ---
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

// --- Variables ---
let unitPrice = 0,
    salesPriceIncludingAllTaxes = 0,
    salesPriceExcludingTax = 0;
let quantity = 0;
let productName = "";
const TVA = 0.16;

// --- Titre du projet ---
console.log("==============================================");
console.log(
    ":::::::::      :::   :::   :::      ::::::::  \n" +
    ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n" +
    "+:+    +:+  +:+   +:+ +:+ +:+             +:+ \n" +
    "+#+    +:+ +#++:++#++: +#++:           +#++:  \n" +
    "+#+    +#+ +#+     +#+  +#+               +#+ \n" +
    "#+#    #+# #+#     #+#  #+#        #+#    #+# \n" +
    "#########  ###     ###  ###         ########  "
);
console.log("==============================================\n");

// --- Mot de passe ---
rl.question("🔑 Veuillez entrer le mot de passe : ", (password) => {
    if (password !== "anne") {
        console.log("❌ Le mot de passe n'est pas correct !");
        console.log("\nVeuillez recommencer !!!");
        rl.close();
        console.log("\nFin du programme ✅");
        process.exit(0);
    }

    console.log("✅ Le mot de passe est correct\n");

    // --- Nom du produit ---
    rl.question("➡️  Entrez le nom de l'article : ", (name) => {
        productName = name;

        // --- Prix unitaire ---
        rl.question(
            `➡️  Entrez le prix unitaire de l'article ${productName} --> `,
            (unit) => {
                unitPrice = parseFloat(unit);
                if (isNaN(unitPrice)) {
                    console.log(
                        "\n⚠️ Erreur : Vous devez entrer un nombre valide pour le prix unitaire !"
                    );
                    rl.close();
                    console.log("\nFin du programme ✅");
                    process.exit(0);
                }

                // --- Quantité ---
                rl.question(
                    `➡️  Entrez la quantité de l'article ${productName} --> `,
                    (qty) => {
                        quantity = parseInt(qty);
                        if (isNaN(quantity)) {
                            console.log(
                                "\n⚠️ Erreur : Vous devez entrer un nombre valide pour la quantité !"
                            );
                            rl.close();
                            console.log("\nFin du programme ✅");
                            process.exit(0);
                        }

                        // --- Résumé ---
                        console.log("\n-------------------------------------");
                        console.log(" 📋 Résumé des informations saisies");
                        console.log("-------------------------------------");
                        console.log(`🔠    Le nom de l'article : ${productName}`);
                        console.log(`🔢    Le prix unitaire : ${unitPrice}`);
                        console.log(`🔢    La quantité : ${quantity}\n`);

                        // --- Calculs ---
                        console.log("--------------");
                        console.log(" 📋 Résultats");
                        console.log("--------------\n");

                        salesPriceExcludingTax = unitPrice * quantity;
                        console.log(
                            `➡️  Le prix de vente hors taxes est  --> ${salesPriceExcludingTax.toFixed(
                                2
                            )} CDF\n`
                        );

                        console.log("➡️  La TVA (Taxe sur la Valeur Ajoutée) est de 16% ");
                        salesPriceIncludingAllTaxes = salesPriceExcludingTax * (1 + TVA);
                        console.log(
                            `➡️  Le prix de vente toutes taxes comprises est  --> ${salesPriceIncludingAllTaxes.toFixed(
                                2
                            )} CDF\n`
                        );

                        // --- Réduction ---
                        if (salesPriceIncludingAllTaxes > 100) {
                            const reduction = salesPriceIncludingAllTaxes * 0.1;
                            const finalPrice = salesPriceIncludingAllTaxes * 0.9;
                            console.log(
                                `➡️  Une réduction de 10% (${reduction.toFixed(
                                    2
                                )} CDF) est appliquée au prix TTC (${salesPriceIncludingAllTaxes.toFixed(
                                    2
                                )})\nVoici le prix de vente final  --> ${finalPrice.toFixed(
                                    2
                                )} CDF\n`
                            );
                        }

                        // --- Fin ---
                        rl.close();
                        console.log("Fin du programme ✅");
                        console.log("-------------------------------------------");
                    }
                );
            }
        );
    });
});
