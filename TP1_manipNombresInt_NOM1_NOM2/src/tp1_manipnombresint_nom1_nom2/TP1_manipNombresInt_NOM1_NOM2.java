/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_nom1_nom2;

import java.util.Scanner;

/**
 *
 * @author stell
 */
public class TP1_manipNombresInt_NOM1_NOM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner sc = new Scanner(System.in);

        // 1. Saisie de deux entiers
        System.out.print("Entrez le premier nombre entier : ");
        int operande1 = sc.nextInt();

        System.out.print("Entrez le deuxieme nombre entier : ");
        int operande2 = sc.nextInt();

        // Affichage des nombres saisis
        System.out.println("\nVous avez saisi : " + operande1 + " et " + operande2);

        // 2. Calcul et affichage de la somme, différence et produit
        int somme = operande1 + operande2;
        int difference = operande1 - operande2;
        int produit = operande1 * operande2;

        System.out.println("\n--- Resultats des opérations ---");
        System.out.println("Somme : " + operande1 + " + " + operande2 + " = " + somme);
        System.out.println("Difference : " + operande1 + " - " + operande2 + " = " + difference);
        System.out.println("Produit : " + operande1 + " * " + operande2 + " = " + produit);

        // 3. Division entière et reste de la division euclidienne
        if (operande2 != 0) {
            int quotientEntier = operande1 / operande2;
            int reste = operande1 % operande2;
            double quotientReel = (double) operande1 / operande2; // pour afficher la division exacte

            System.out.println("Quotient entier : " + operande1 + " / " + operande2 + " = " + quotientEntier);
            System.out.println("Reste de la division euclidienne : " + operande1 + " % " + operande2 + " = " + reste);
            System.out.println("Division reelle (exacte) : " + operande1 + " / " + operande2 + " = " + quotientReel);
        } else {
            System.out.println("Erreur : division par zero impossible !");
        }

        sc.close();
    }}