package com.company.personnages;

import com.company.Personnage;

public class Magicien extends Personnage {


    // * Constructeur sans paramètre * \\

    public Magicien() {
        System.out.println("Creation d'un magicien!");
        setNomPerso("Inconnu");
        setImgPerso("Inconnu");
        setNiveauVieMin(3);
        setNiveauVieMax(6);
        setForceMin(8);
        setForceMax(15);
    }


    // * Constructeur avec paramètre Nom * \\

    public Magicien( String pNomMagicien ) {
        System.out.println("Creation d'un magicien avec un paramètre nom!");
        setNomPerso(pNomMagicien);
        setImgPerso("Inconnu");
        setNiveauVieMin(3);
        setNiveauVieMax(6);
        setForceMin(8);
        setForceMax(15);
    }


    // * Constructeur avec paramètre Nom, Img, Niveau, Force Attaque * \\

    public Magicien(String pNomMagicien, String pImgMagicien, int pNiveauVieMagicienMin, int pNiveauVieMagicienMax, int pForceAttaqueMagicienMin, int pForceAttaqueMagicienMax) {
        System.out.println("Creation d'un magicien avec un paramètre nom, image, niveau de vie et force d'attaque!");
        setNomPerso(pNomMagicien);
        setImgPerso(pImgMagicien);
        setNiveauVieMin(pNiveauVieMagicienMin);
        setNiveauVieMax(pNiveauVieMagicienMax);
        setForceMin(pForceAttaqueMagicienMin);
        setForceMax(pForceAttaqueMagicienMax);
    }

    public String champsSQL() {
        return "'Magicien', '"+this.getNomPerso()+"', '"+this.getNiveauVieMin()+"', '"+this.getForceMin()+"', 'Sort', "+"'aucun'" ;
    }

}

