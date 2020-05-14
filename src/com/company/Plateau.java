package com.company;

import java.sql.SQLOutput;

public class Plateau {
    private int nbCasePlateau;
    private int posJoueur;

    public Plateau() {
       nbCasePlateau = 64;
       posJoueur = 0;
    }

    public int lancerDes() {
        int dice = 0;
        dice = 1 + (int) (Math.random() * 6);
        System.out.println(" ");
        System.out.println("J'ai tiré le numéro " + dice);
        return dice;
    }

    /*
    Parametre : nombre de case à avancer
    Retour : nouvel position du joueur
     */
    public int avancerJoueur(int nb) throws PersonnageHorsPlateauException {
        posJoueur = posJoueur + nb;
        if (posJoueur > nbCasePlateau) {
            throw new PersonnageHorsPlateauException();
        }
        System.out.println("Mon pion avance donc de " + nb);
        return posJoueur;
    }

    public int tourDeJeu() {
        int nbLancerDes = lancerDes();
        try {
            avancerJoueur(nbLancerDes);
        }
        catch (PersonnageHorsPlateauException e) {
            //e.printStackTrace();
            System.out.println("On revient à la case 64");
            posJoueur = nbCasePlateau;

        }
        System.out.println("Je suis à la case " + posJoueur);
        return nbLancerDes;

    }

    public void jeu(int typePersonnage) {
        while (posJoueur < nbCasePlateau) {
            tourDeJeu();
        }

    }
}
