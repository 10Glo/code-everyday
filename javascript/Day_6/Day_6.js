/**
 * Problème
 * --------
 * Concevoir un programme qui détermine la moyenne, la variance et l'écart type d'une série de valeurs contenues dans une liste
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

const readline = require("readline");

// --- Création de l'interface pour la saisie utilisateur ---
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// --- Variables globales ---
let n = 0;
let list = [];
let enteredNumbers = [];

// --- Fonction utilitaire pour poser une question ---
function askQuestion(query) {
    return new Promise((resolve) => rl.question(query, resolve));
}

async function main() {
    console.log("==============================================");
    console.log(":::::::::      :::   :::   :::      ::::::::  \n" +
        ":+:    :+:   :+: :+: :+:   :+:     :+:    :+: \n" +
        "+:+    +:+  +:+   +:+ +:+ +:+      +:+        \n" +
        "+#+    +:+ +#++:++#++: +#++:       +#++:++#+  \n" +
        "+#+    +#+ +#+     +#+  +#+        +#+    +#+ \n" +
        "#+#    #+# #+#     #+#  #+#        #+#    #+# \n" +
        "#########  ###     ###  ###         ########  ");
    console.log("==============================================\n");

    try {
        // --- Saisie du nombre de valeurs ---
        n = parseInt(await askQuestion("➡️  Entrez le Nombre de Valeurs contenue dans votre liste : "));

        if (isNaN(n)) {
            console.log("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
            rl.close();
            return;
        }

        if (n < 0) {
            console.log("\nLe nombre des valeurs à sommer ne peut être négatif !!!");
            rl.close();
            return;
        } else if (n === 0) {
            console.log("\nAucune valeur ne sera sommé n est égal à 0 !!!");
            rl.close();
            return;
        }

        // --- Saisie des valeurs ---
        for (let i = 1; i <= n; i++) {
            let temp = parseFloat(await askQuestion(`➡️  Entrez le Nombre numéro : ${i} --> `));

            if (isNaN(temp)) {
                console.log("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
                rl.close();
                return;
            }

            list.push(temp);
            enteredNumbers.push(temp);
        }

        // --- Résumé des informations ---
        console.log("\n-------------------------------------");
        console.log(" 📋 Résumé des informations saisies");
        console.log("-------------------------------------");
        console.log(` 🔢 Vous avez entré au total ${n} nombres qui sont : ${enteredNumbers.join(", ")} \n`);

        // --- Calculs ---
        let sum = list.reduce((a, b) => a + b, 0);
        let mean = sum / list.length;

        let varianceSum = list.reduce((acc, val) => acc + Math.pow(val - mean, 2), 0);
        let variance = varianceSum / list.length;
        let standardDeviation = Math.sqrt(variance);

        // --- Résultats ---
        console.log("--------------");
        console.log(" 📋 Résultats");
        console.log("--------------");
        console.log(`➡️  La moyenne est --> ${mean.toFixed(2)}`);
        console.log(`➡️  La variance est --> ${variance.toFixed(2)}`);
        console.log(`➡️  L'écart type est --> ${standardDeviation.toFixed(2)}\n`);

        console.log("Fin du programme ✅");
        console.log("-------------------------------------------");
        rl.close();

    } catch (error) {
        console.log("\n⚠️ Une erreur est survenue :", error.message);
        rl.close();
    }
}

// --- Lancement du programme ---
main();
