package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Menu {

    private Scanner clavier;

    public Menu() {
        clavier = new Scanner(System.in);
    }

    public void showMenuPrincipal() {
        System.out.println("1- Creer un personnage");
        System.out.println("Pour quitter le jeu, appuyer sur 0");
    }

    public void showMenuCreationPerso() {
        System.out.println("1- Magicien");
        System.out.println("2- Guerrier");
        System.out.println("Pour quitter le jeu, appuyer sur 0");
    }

    public void entrerNom() {
        System.out.println("Entrer nom");
    }

    public void showMenuDetailsPerso() {
        System.out.println("1- Afficher les détails du personnage");
        System.out.println("2- Modifier les informations du personnage");
        System.out.println("3- Demarrer jeu");
        System.out.println("Pour quitter le jeu, appuyer sur 0");
    }

    public void modifierDetails(Personnage pPerso) {
        System.out.println("Nouveau nom");
        String nouveauNom = lireString();
        System.out.println("Nouvelle force");
        int nouvelleForce = lireInt();
        System.out.println("Nouvelle vie");
        int nouvelleVie = lireInt();

        pPerso.setNomPerso(nouveauNom);
        pPerso.setForceMin(nouvelleForce);
        pPerso.setNiveauVieMin(nouvelleVie);
    }

//    public void modifierDetailsGuerrier(Guerrier pGuerrier) {
//        System.out.println("Nouveau nom");
//        String nouveauNom = lireString();
//        System.out.println("Nouvelle force");
//        int nouvelleForce = lireInt();
//        System.out.println("Nouvelle vie");
//        int nouvelleVie = lireInt();
//
//        pGuerrier.setNomPerso(nouveauNom);
//        pGuerrier.setForceAttaquePerso(nouvelleForce);
//        pGuerrier.setNiveauViePerso(nouvelleVie);
//    }
//
//    public void modifierDetailsMagicien(Magicien pMagicien) {
//        System.out.println("Nouveau nom");
//        String nouveauNom = lireString();
//        System.out.println("Nouvelle force");
//        int nouvelleForce = lireInt();
//        System.out.println("Nouvelle vie");
//        int nouvelleVie = lireInt();
//
//        pMagicien.setNomPerso(nouveauNom);
//        pMagicien.setForceAttaquePerso(nouvelleForce);
//        pMagicien.setNiveauViePerso(nouvelleVie);
//    }

    public void showMenuContinuerOuQuitter() {
        System.out.println(" ");
        System.out.println("Que voulez vous faire ? ");
        System.out.println("1-Relancer partie");
        System.out.println("2-Quitter");
    }

    public void showCombattreOuFuir() {
        System.out.println(" ");
        System.out.println("Que voulez vous faire ? ");
        System.out.println("1-Combattre");
        System.out.println("2-Fuir");
    }



    private int lireInt() {
        int choix = clavier.nextInt();
        clavier.nextLine(); // Caractère entrée

        return choix;
    }

    private String lireString() {
        String chaine = clavier.nextLine();
        return chaine;
    }

    //*------------- Réponse utilisateurs *

    public int reponseMenuInt() {
        int choix = lireInt();
        return choix;
    }

    public String reponseEntrerNom() {
        String choix = lireString();
        return choix;
    }



}

//toute les methode qui permettent de discuter avec le joueur
