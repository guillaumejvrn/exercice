import java.io.PrintStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double fahrenheit(double C){
        double F = 9*C / 5 + 32;
        return F;
    }
    public static void age () {
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

        output.println(prenom+" "+nom+" "+(annee - anneDeNaissance)+" ans en "+annee);
    }

    public static double perimetre(double longeur, double largeur){
        return longeur*2+longeur*2;
    }

    public static double aire(double longeur, double largeur){
        return longeur*largeur;
    }

    public static boolean estPair(double nombre){
        return nombre%2==0;

    }

    public static boolean authetification(String identifiant, String motDePasse){
        return "couscous" == identifiant && "camembert" == motDePasse;
    }

    public static double parc(double age, double heure){
        double heureDeFermeture = 19;
        double prix;
        if(age < 5){
            return 0;
        } else {
            prix = 6 + 2*(heureDeFermeture-heure);
            if(prix>=18){
                return 18;
            }
        }
        return prix;
    }

    public static String categorie(double age){
        if(age<8){
            return "petit poussin";
        } else if(8==age || 9==age){
            return "poussins";
        } else if(10==age || 11==age){
            return "pupilles";
        } else if(12==age || 13==age){
            return "benjamins";
        } else if(14==age || 15==age){
            return "minimes";
        } else if(16==age || 17==age){
            return "cadets";
        } else if (18==age || 19==age){
            return "juniors";
        } else if (age>=20 && age<=49){
            return "seniors";
        } else if (age>=50 && age<=64){
            return "seniors+";
        } else if (age>=65){
            return "veterans";
        }
        return "ca marche pas";
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
    }
}