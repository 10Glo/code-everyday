/**
 * Problème
 * -------
 * Ecrire un programme qui demande deux nombres à l'utilisateur et l'informe ensuite
 * Si le produit est positif, egatif ou Neutre, Attention toutefois on ne doit pas calculer le produit
 *
 * Catégorie
 * ---------
 * Numbers
 *
 * Niveau
 * ------
 * Débutant
 *
 * @author 10Glo (https://github.com/10Glo)
 * @version 1.0
 * @since 15/09/2025
 */

// node-readline-async.js
const readline = require('readline');


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// --- Titre du projet ---
console.log("==============================================");
console.log(":::::::::      :::     :::   :::         :::   \n" +
    ":+:    :+:   :+: :+:   :+:   :+:       :+:+:   \n" +
    "+:+    +:+  +:+   +:+   +:+ +:+          +:+   \n" +
    "+#+    +:+ +#++:++#++:   +#++:           +#+   \n" +
    "+#+    +#+ +#+     +#+    +#+            +#+   \n" +
    "#+#    #+# #+#     #+#    #+#            #+#   \n" +
    "#########  ###     ###    ###          ####### ");
console.log("==============================================\n");


// readline est asynchrone : on utilise rl.question ou une Promise/async pour écrire du flow lisible.
function question(q) {
    return new Promise(resolve => rl.question(q, ans => resolve(ans)));
}


(async () => {
    // une try catch afin de prevenir les erreurs de type
    try {

        // --- Déclaration des Variables ---
        let firstNumberStr = "",
            secondNumberStr = "",
            firstNumberInt = 0,
            secondNumberInt = 0;

        // --- Saisie des informations ---
        firstNumberStr = await question('➡️  Entrez le premier nombre : ');
        secondNumberStr = await question('➡️  Entrez le deuxième nombre : ');

        // --- Transtypage Explicite ---
        firstNumberInt = Number(firstNumberStr.trim());
        secondNumberInt = Number(secondNumberStr.trim());


        if (Number.isNaN(firstNumberInt) || Number.isNaN(secondNumberInt)) {
            console.log('\n⚠️ Entrée invalide. Veuillez entrer des nombres.');
            rl.close();
            console.log("\nFin du programme ✅");
            console.log("-------------------------------------------");
        } else {
            // --- Résumé des informations ---
            console.log("\n-------------------------------------");
            console.log(" 📋 Résumé des informations saisies");
            console.log("-------------------------------------");
            console.log(" \uD83D\uDD22 Le premier nombre    : " + firstNumberInt);
            console.log(" \uD83D\uDD22 Le deuxième nombre    : " + secondNumberInt + "\n");
            console.log("Voici la règle : \n\n" +
                "*   Si les deux nombres sont positifs ou si les deux nombres sont négatifs, leur produit est positif\n" +
                "*   Si un nombre est positif et l'autre est négatif, leur produit est négatif\n" +
                "*   Si l'un des nombres est 0, alors le produit des deux nombres est toujours 0\n\n" +
                "En résumé :\n\n" +
                "*   Paire de nombres positifs :  Produit positif\n" +
                "*   Paire de nombres négatifs :Produit positif\n" +
                "*   Un positif, un négatif : Produit négatif\n" +
                "*   Paire de zéro ou Un zéro: Produit Neutre");


            // --- Résutats ---
            console.log("--------------");
            console.log(" 📋 Résutats");
            console.log("--------------");

            // --- Régles ---
            if (firstNumberInt > 0 && secondNumberInt > 0)
                console.log("➡️  Le Résultat est 'POSITIF'");
            else if (firstNumberInt < 0 && secondNumberInt < 0)
                console.log("➡️  Le Résultat est 'POSITIF'");
            else if (firstNumberInt === 0 || secondNumberInt === 0)
                console.log("➡️  Le Résultat est 'NEUTRE'");
            else
                console.log("➡️  Le Résultat est 'NÉGATIF'\n\n");

            // --- Message de fin ---
            rl.close();
            console.log("\nFin du programme ✅");
            console.log("-------------------------------------------");
        }

    } catch (error){
        console.log('\n⚠️ Entrée invalide. Veuillez entrer des nombres.');
    } finally {
        rl.close();
    }
})();
