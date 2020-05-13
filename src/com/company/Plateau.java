package com.company;

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
        return dice;
    }

    /*
    Parametre : nombre de case à avancer
    Retour : nouvel position du joueur
     */
    public int avancerJoueur(int nb) {
        posJoueur = posJoueur + nb;
        if (posJoueur > nbCasePlateau) {
            posJoueur = nbCasePlateau;
        }
        System.out.println("Mon pion avance donc de " + nb);
        return posJoueur;
    }

    public int tourDeJeu() {
        int nbLancerDes = lancerDes();
        avancerJoueur(nbLancerDes);
        System.out.println("Je suis à la case " + posJoueur);
        return nbLancerDes;

    }

    public void jeu(int typePersonnage) {
        while (posJoueur < nbCasePlateau) {
            tourDeJeu();
        }

    }
}
