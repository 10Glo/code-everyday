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

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

console.log("==============================================");
console.log(":::::::::      :::   :::   :::     :::::::::: ");
console.log(":+:    :+:   :+: :+: :+:   :+:     :+:    :+: ");
console.log("+:+    +:+  +:+   +:+ +:+ +:+      +:+        ");
console.log("+#+    +:+ +#++:++#++: +#++:       +#++:++#+  ");
console.log("+#+    +#+ +#+     +#+  +#+               +#+ ");
console.log("#+#    #+# #+#     #+#  #+#        #+#    #+# ");
console.log("#########  ###     ###  ###         ########  ");
console.log("==============================================\n");

let n = 0, sum = 0, i = 0;
let enteredNumbers = [];

rl.question("➡️  Entrez le Nombre de Valeurs que vous Souhaitez Sommer : ", (input) => {
    n = parseInt(input);

    if (isNaN(n) || n < 0) {
        console.log("\n⚠️ Erreur : Le nombre doit être un entier positif !");
        rl.close();
        return;
    } else if (n === 0) {
        console.log("\nAucune valeur ne sera sommée, n est égal à 0 !!!");
        rl.close();
        return;
    }

    const askNumber = () => {
        if (i < n) {
            rl.question(`➡️  Entrez le Nombre numéro ${i + 1} --> `, (val) => {
                let num = parseInt(val);
                if (isNaN(num)) {
                    console.log("⚠️ Valeur invalide !");
                    rl.close();
                    return;
                }
                sum += num;
                enteredNumbers.push(num);
                i++;
                askNumber();
            });
        } else {
            console.log("\n-------------------------------------");
            console.log(" 📋 Résumé des informations saisies");
            console.log("-------------------------------------");
            console.log(` 🔢 Vous avez entré au total ${n} nombres qui sont : ${enteredNumbers.join(", ")}\n`);

            console.log("--------------");
            console.log(" 📋 Résultats");
            console.log("--------------");
            console.log(`➡️  La somme est --> ${sum}\n`);

            console.log("Fin du programme ✅");
            console.log("-------------------------------------------");
            rl.close();
        }
    };

    askNumber();
});
