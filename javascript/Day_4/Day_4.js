/**
 * Problème
 * --------
 * Concevoir un programme qui demande l'âge d'une personne.
 * Ensuite, l'informe de sa catégorie :
 * "Enfance : de 0 à 12 ans",
 * "Adolescence : de 12 à 18 ans",
 * "Âge Adulte : de 18 à 65 ans",
 * "Séniors ou Personnes âgées : À partir de 65 ans"
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
 * @since 16/09/2025
 */

// --- Dépendance pour la saisie ---
const prompt = require("prompt-sync")({ sigint: true });

// --- Déclaration des Variables ---
let age = 0;

// --- Titre du projet ---
console.log("==============================================");
console.log(":::::::::      :::   :::   :::         :::     ");
console.log(":+:    :+:   :+: :+: :+:   :+:        :+:      ");
console.log("+:+    +:+  +:+   +:+ +:+ +:+        +:+ +:+   ");
console.log("+#+    +:+ +#++:++#++: +#++:        +#+  +:+   ");
console.log("+#+    +#+ +#+     +#+  +#+        +#+#+#+#+#+ ");
console.log("#+#    #+# #+#     #+#  #+#              #+#   ");
console.log("#########  ###     ###  ###              ###   ");
console.log("==============================================\n");

// --- Saisie de l'âge ---
try {
    let input = prompt("➡️  Entrez votre âge (Entrez juste le nombre) : ");
    age = parseInt(input);

    if (isNaN(age)) {
        console.log("\n⚠️ Erreur : Vous devez entrer un nombre valide !");
        console.log("\nFin du programme ✅");
        process.exit(0);
    }
} catch (error) {
    console.log("\n⚠️ Erreur : Impossible de lire la saisie !");
    console.log("\nFin du programme ✅");
    process.exit(0);
}

// --- Résumé des informations ---
console.log("\n-------------------------------------");
console.log(" 📋 Résumé des informations saisies");
console.log("-------------------------------------");
console.log(" 🔢 L'âge que vous avez entré : " + age + " ans\n");

// --- Résultats ---
console.log("--------------");
console.log(" 📋 Résultats");
console.log("--------------");

// --- Règles ---
if (age < 0) {
    console.log("Votre âge ne peut pas être négatif.\n");
} else if (age <= 12) {
    console.log("➡️  Votre catégorie est 'ENFANT'\n");
} else if (age <= 18) {
    console.log("➡️  Votre catégorie est 'ADOLESCENCE'\n");
} else if (age <= 65) {
    console.log("➡️  Votre catégorie est 'ADULTE'\n");
} else {
    console.log("➡️  Votre catégorie est 'SÉNIORS'\n");
}

// --- Message de fin ---
console.log("Fin du programme ✅");
console.log("-------------------------------------------");
