/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author stell
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
   
        System.out.println("Veuillez entrer le premier nombre");
        int operande1=sc.nextInt();
        System.out.println("Veuillez entrer le deuxieme nombre");
        int operande2=sc.nextInt();
        
        System.out.println ("Please enter the operator:"); 
        System.out.println(" 1) add") ;
        System.out.println(" 2) substract") ;
        System.out.println(" 3) multiply ");
        System.out.println(" 4) divide");
        System.out.println(" 5) modulo ");
        
        int operateur=sc.nextInt(); 
        System.out.println("Vous avez choisi l'operateur numero : " + operateur);
        int resultat;
       
                
                
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Erreur : division par zéro.");
                    return;
                }   break;
            case 5:
                if (operande2 != 0) {
                    resultat = operande1 % operande2;
                } else {
                    System.out.println("Erreur : modulo par zéro.");
                    return;
                }   break;
            default:
                System.out.println("Opérateur invalide.");
                return;
        }
                        
        System.out.println("Le resultat est " + resultat );
    }
    
}
