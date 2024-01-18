import java.io.PrintStream;
import java.security.PublicKey;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double fahrenheit(double C) {
        double F = 9 * C / 5 + 32;
        return F;
    }

    public static void age() {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        double anneDeNaissance;
        String prenom;
        String nom;
        double annee;

        System.out.println("quel est on prenom");
        prenom = input.nextLine();
        System.out.println("quel est on nom");
        nom = input.nextLine();
        System.out.println("quel est on annee de naissance");
        anneDeNaissance = Double.parseDouble(input.nextLine());
        System.out.println("quel est on annee dans laquel tu veux savoir ton age");
        annee = Double.parseDouble(input.nextLine());

        output.println(prenom + " " + nom + " " + (annee - anneDeNaissance) + " ans en " + annee);
    }

    public static double perimetre(double longeur, double largeur) {
        return longeur * 2 + longeur * 2;
    }

    public static double aire(double longeur, double largeur) {
        return longeur * largeur;
    }

    public static boolean estPair(double nombre) {
        return nombre % 2 == 0;

    }

    public static boolean authetification(String identifiant, String motDePasse) {
        return "couscous" == identifiant && "camembert" == motDePasse;
    }

    public static double parc(double age, double heure) {
        double heureDeFermeture = 19;
        double prix;
        if (age < 5) {
            return 0;
        } else {
            prix = 6 + 2 * (heureDeFermeture - heure);
            if (prix >= 18) {
                return 18;
            }
        }
        return prix;
    }

    public static String categorie(double age) {
        if (age < 8) {
            return "petit poussin";
        } else if (8 == age || 9 == age) {
            return "poussins";
        } else if (10 == age || 11 == age) {
            return "pupilles";
        } else if (12 == age || 13 == age) {
            return "benjamins";
        } else if (14 == age || 15 == age) {
            return "minimes";
        } else if (16 == age || 17 == age) {
            return "cadets";
        } else if (18 == age || 19 == age) {
            return "juniors";
        } else if (age >= 20 && age <= 49) {
            return "seniors";
        } else if (age >= 50 && age <= 64) {
            return "seniors+";
        } else if (age >= 65) {
            return "veterans";
        }
        return "ca marche pas";
    }


    public static void carresParfaits(int n) {
        int somme = 0;
        int nombreImpair = 1;

        for (int i = 1; i <= n; i++) {
            somme += nombreImpair;
            System.out.println("Carré parfait jusqu'à " + i + " : " + somme);
            nombreImpair += 2;
        }
    }

    public static void multiplications(double nombre) {
        for (double i = 1; i <= 10; i++) {
            System.out.println(i * nombre);
        }
    }

    public static long factorielle(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif.");
        }
        if (n == 0) {
            return 1;
        }
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }

    public static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String civilite() {
        Scanner scanner = new Scanner(System.in);
        String reponse;

        do {
            System.out.print("Êtes-vous un homme (H) ou une femme (F) ? ");
            reponse = scanner.nextLine().toUpperCase();  // Convertir la réponse en majuscules

            if (!reponse.equals("H") && !reponse.equals("F")) {
                System.out.println("Veuillez entrer une réponse valide (H ou F).");
            }

        } while (!reponse.equals("H") && !reponse.equals("F"));

        scanner.close();
        return reponse;
    }

    public static void deviner() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double tours = 0;
        double victoire = 0;
        int valeurAleatoire = random.nextInt(1, 1001);
        while (victoire == 0) {
            System.out.println("enter un nombre entre 1 et 1000");
            double valeurDuJoueur = Double.parseDouble(scanner.nextLine());
            if (valeurDuJoueur == valeurAleatoire) {
                System.out.println("bravo vous avez gagné en " + tours + " tours");
                break;
            } else if (valeurDuJoueur < valeurAleatoire) {
                System.out.println("trop petit");
            } else {
                System.out.println("trop grand");
            }
            tours++;
        }
    }

    public static void inverser(int[] tableau) {
        int debut = 0;
        int fin = tableau.length - 1;
        while (debut < fin) {
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;
            debut++;
            fin--;
        }
    }

    public static boolean egaux(int[] tableau, int[] tableEau) {
        if (tableau.length == tableEau.length) {
            for (int i = 0; i < tableEau.length; i++) {
                if (tableau[i] != tableEau[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean carreMagique(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            int sommeLigne = 0;
            int sommeColonne = 0;

            for (int j = 0; j < tableau[i].length; j++) {
                sommeLigne += tableau[i][j];
                sommeColonne += tableau[j][i];
            }

            if (sommeLigne != sommeColonne) {
                return false;
            }
        }
        int sommeDiagonalePrincipale = 0;
        for (int i = 0; i < tableau.length; i++) {
            sommeDiagonalePrincipale += tableau[i][i];
        }
        int sommeAntiDiagonale = 0;
        for (int i = 0; i < tableau.length; i++) {
            sommeAntiDiagonale += tableau[i][tableau.length - 1 - i];
        }
        return sommeDiagonalePrincipale == sommeAntiDiagonale;
    }
    public static double moyenne(int[]notes, int[]coeff){
        double somme = 0;
        double sommeCoeff = 0;
        for(int i = 0; i<notes.length; i++){
            somme = somme+notes[i]*coeff[i];
            sommeCoeff = sommeCoeff+coeff[i];
        }
        return somme/sommeCoeff;
    }

    public static double taux_concordance(char[] adn1, char[] adn2) {
        if (adn1.length != adn2.length) {
            throw new IllegalArgumentException("Les deux brins d'ADN doivent avoir la même taille.");
        }
        int basesAppariees = 0;
        for (int i = 0; i < adn1.length; i++) {
            if (sontBasesAppariees(adn1[i], adn2[i])) {
                basesAppariees++;
            }
        }
        return (double) basesAppariees / adn1.length * 100;
    }
    public static boolean sontBasesAppariees(char base1, char base2) {
        return (base1 == 'a' && base2 == 't') ||
                (base1 == 't' && base2 == 'a') ||
                (base1 == 'g' && base2 == 'c') ||
                (base1 == 'c' && base2 == 'g');
    }

    public static boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0 && annee % 4000 != 0);
    }

    public static String jourMois(int jourDansAnnee, int annee) {
        boolean estBissextile = estBissextile(annee);
        int[] joursDansMoisNonBissextile = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] joursDansMoisBissextile = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] joursDansMois = estBissextile ? joursDansMoisBissextile : joursDansMoisNonBissextile;
        if (jourDansAnnee < 1 || jourDansAnnee > 365 + (estBissextile ? 1 : 0)) {
            return "Numéro de jour invalide";
        }
        int mois = 0;
        int joursRestants = jourDansAnnee;
        while (joursRestants > joursDansMois[mois]) {
            joursRestants -= joursDansMois[mois];
            mois++;
        }
        return String.format("%02d/%02d", joursRestants, mois + 1);
    }

    public static void main(String[] args) {
        /*
        System.out.println("hello world");

        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);

        output.println("saisir un message : ");
        String msg = input.nextLine();
        output.println(msg);

        input.close();
        output.close();
        */
        //age();
        //System.out.println(fahrenheit(10));
        //System.out.println(perimetre(10, 10));
        //System.out.println(aire(10, 10));
        //System.out.println(estPair(3));
        //System.out.println(authetification("couscous" ,"camembert"));
        //System.out.println(parc(10,18));
        //System.out.println(categorie(8));
        //carresParfaits(5);
        //multiplications(9);

        /*
        int nombre = 5;
        long resultatFactorielle = factorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultatFactorielle);
        */
        /*
        int nombre = 13;
        boolean estPremier = estPremier(nombre);
        System.out.println("Le nombre " + nombre + " est premier : " + estPremier);
        */
        /*
        String resultat = civilite();
        System.out.println("Vous avez répondu : " + resultat);
         */
        //deviner();

        /*
        int[] tableau = {1, 2, 3, 4, 5};
        inverser(tableau);
        for (int element : tableau) {
            System.out.print(element + " ");
        }
         */
        /*
        int[] tableau = {1,2,3,4};
        int[] tableEau = {1,2,5,4};
        System.out.println(egaux(tableau, tableEau));
        */
        /*
        int[][] carre = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        boolean estCarreMagique = carreMagique(carre);
        if (estCarreMagique) {
            System.out.println("Le tableau est un carré magique.");
        } else {
            System.out.println("Le tableau n'est pas un carré magique.");
        }
         */
        /*
        int[] notes = {10, 15};
        int[] coeff = {1, 2};
        System.out.println(moyenne(notes, coeff));
         */
        /*
        char[] adn1 = {'a', 'a', 't', 'g', 'g', 'c'};
        char[] adn2 = {'c', 't', 'a', 'c', 'a', 'g'};
        double taux = taux_concordance(adn1, adn2);
        System.out.println("Le taux de concordance est : " + taux + "%");
         */
        /*
        int annee = 2024;
        boolean estBissextile = estBissextile(annee);
        if (estBissextile) {
            System.out.println("L'année " + annee + " est bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
         */

        int jourDansAnnee = 32;
        int annee = 2023;
        System.out.println(jourMois(jourDansAnnee, annee));

    }
}